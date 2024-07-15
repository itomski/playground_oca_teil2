package de.lubowiecki.patterns.adapter;

public class Server {

    public Server() {
    }

    public void versenden(Nachricht n) {

        n.verarbeiten();

    }
}
