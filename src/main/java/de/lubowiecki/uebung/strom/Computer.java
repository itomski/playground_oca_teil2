package de.lubowiecki.uebung.strom;

public class Computer implements Stecker {

    @Override
    public void ausfuehren() {
        System.out.println("Computer bootet");
    }
}
