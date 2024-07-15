package de.lubowiecki.uebung.strom;

public class SmartPhone implements UsbCStecker {

    @Override
    public void laden() {
        System.out.println("Das SmartPhone lädt...");
    }
}
