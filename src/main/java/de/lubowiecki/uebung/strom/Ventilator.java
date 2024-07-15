package de.lubowiecki.uebung.strom;

public class Ventilator implements Stecker {

    @Override
    public void ausfuehren() {
        System.out.println("Ventilator pustet Luft");
    }
}
