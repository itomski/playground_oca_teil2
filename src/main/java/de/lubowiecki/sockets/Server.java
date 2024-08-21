package de.lubowiecki.sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    private Socket clientSocket;

    private PrintWriter out;

    private BufferedReader in;


    public static void main(String[] args) {

        Server server = new Server();

        try {
            server.start(6000);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start(int port) throws IOException {

        serverSocket = new ServerSocket(port);

        while(true) { // Wartet auf Verbindungen vom Clinets
            new ClientHandler(serverSocket.accept()).start();
        }
    }
}
