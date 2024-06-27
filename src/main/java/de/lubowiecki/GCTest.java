package de.lubowiecki;

import java.time.LocalDate;

public class GCTest {

    public static void main(String[] args) {

        System.out.println("START");

        NextBox nb1 = new NextBox(123);
        NextBox nb2 = new NextBox(456);

        nb1 = null;
        nb2 = null;

        System.gc();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println("Problem");
        }

        System.out.println("ENDE");

        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getProperties());

    }

    public static void machWas(int zahl) {

        if(zahl == 0) {
            System.out.println("Problem");
            return; // Verlässt die Methode
            //System.out.println("..."); // Kompilererror!
        }

        System.out.println("Irgendwas wird mit der Zahl angestellt...");
    }

}

class NextBox {

    private final int value; // Finale Intsnazvariablen müssen spätestens im Konstruktor zugewiesen werden

    // Finale Klassenvariablen müssen sofort oder im static-Initializer zugewiesen werden
    private static final int otherValue;

    static {
        // statische Initializes
        otherValue = LocalDate.now().getDayOfMonth();
    }

    public NextBox(int value) {
        //final int x = 10;
        final int x = value;
        System.out.println(x);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    protected void finalize() {
        System.out.println("Box mit Wert " + value + " wurde vom Heap entfernt.");
    }
}
