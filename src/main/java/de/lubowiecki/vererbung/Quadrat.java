package de.lubowiecki.vererbung;

public class Quadrat extends Rechteck {

    @Override
    public void setBreite(int breite) {
        // Über super kann eine überlagerte Methode aus der Elternklasse aufgerufen werden
        super.setBreite(breite);
        super.setLaenge(breite);
    }

    @Override
    public void setLaenge(int laenge) {
        super.setBreite(laenge);
        super.setLaenge(laenge);
    }

    @Override
    public void print() {
        System.out.printf("Quadrat x: %d, y: %d, länge/breite: %d \n", getX(), getY(), getLaenge());
    }
}
