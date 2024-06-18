package de.lubowiecki.vererbung;

public class Kreis extends AbstractGeometrischeForm {

    protected int radius;

    @Override
    public void print() { // Überlagert die geerbte print-Methode
        System.out.printf("Kreis x: %d, y: %d, radius: %d \n", getX(), getY(), radius);
    }
}
