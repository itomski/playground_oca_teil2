package de.lubowiecki.vererbung;

// Abstrakte Klassen dürfen nicht direkt instanziert werden
public abstract class AbstractGeometrischeForm {

    private int x; // privates Inventar wird nicht vererbt
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void print(); // Abstrakte Methoden haben keinen Body
    // Sie müssen in der Kindklasse ausprogrammiert werden
    // Eine Absrakte Methode verpflichtet die Kindklassen eine solche zu implementieren
}
