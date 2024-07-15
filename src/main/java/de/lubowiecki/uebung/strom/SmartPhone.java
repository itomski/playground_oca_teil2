package de.lubowiecki.uebung.strom;

public class SmartPhone implements UsbStecker {

    @Override
    public void laden() {
        System.out.println("Das SmartPhone lädt...");
    }
}
