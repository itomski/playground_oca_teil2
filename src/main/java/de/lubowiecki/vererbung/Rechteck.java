package de.lubowiecki.vererbung;

public class Rechteck extends AbstractGeometrischeForm {

    private int laenge;
    private int breite;

    // Konstruktoren werden nicht vererbt
    public Rechteck() {
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public void print() {
        System.out.printf("Rechteck x: %d, y: %d, länge: %d , breite: %d \n", getX(), getY(), laenge, breite);
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
