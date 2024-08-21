package de.lubowiecki.sockets;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket clientSocket;

    private PrintWriter out;

    private BufferedReader in;

    public static void main(String[] args) {

        Client client = new Client();
        final Scanner scanner = new Scanner(System.in);

        try {
            client.connect("127.0.0.1", 6000);

            String resp = null;
            String clientMsg = null;

            app: while(true) {
                System.out.print("Eingabe: ");
                clientMsg = scanner.nextLine();
                resp = client.send(clientMsg);

                if(resp.equalsIgnoreCase("disconnected")) break;
                System.out.println(resp);
            }
            client.closeConnection();
            System.out.println("Programm beendet.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String send(String msg) throws IOException {
        out.println(msg); // Nachricht an Server senden
        return in.readLine(); // Nachricht vom Server empfangen
    }

    private void connect(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void closeConnection() throws IOException {
        out.close();
        in.close();
        clientSocket.close();
    }
}
