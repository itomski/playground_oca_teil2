package de.lubowiecki.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

    private Socket clientSocket;

    private PrintWriter out;

    private BufferedReader in;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

        System.out.println("Client angemeldet.");

        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String clientMsg = null;
            while ((clientMsg = in.readLine()) != null) {

                if (clientMsg.equalsIgnoreCase("exit")) {
                    out.println("disconnected");
                    closeConnection();
                    System.out.println("Verbindung zum Client wurde geschlossen.");
                    break;
                }

                System.out.println("Nachricht vom Client: " + clientMsg);
                out.println("Server hat deine Nachricht erhalten!");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() throws IOException {
        out.close();
        in.close();
        clientSocket.close();
    }
}
