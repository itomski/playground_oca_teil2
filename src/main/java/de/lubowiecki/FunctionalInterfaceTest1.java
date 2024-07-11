package de.lubowiecki;

public class FunctionalInterfaceTest1 {

    public static void main(String[] args) {

        // void ausfuehren();
        run(() -> System.out.println("Moin Moin")); // Lambda ist flexibler als Klasse
        run(() -> System.out.println("Xyz"));

        // Klassen sind nicht flexibel, da sie kompilert werden müssen
        run(new Aufgabe());
        run(new Aufgabe2());

        // Das Lambda implementiert die abstrakte Methode des FunctionalInterface

    }

    public static void run(Ausfuehrbar a) {
        a.ausfuehren();
    }
}

// FunctionalInterface ist ein SAM
// SAM = Single Abstract Method!!!!!
// kann auch statische Methoden enthalten
// kann auch default Methoden enthalten

@FunctionalInterface // Erfüllt dieses Interface die Anforderungen für ein FunctionalInterface?
interface Ausfuehrbar {

    public void ausfuehren();

}

class Aufgabe implements Ausfuehrbar {

    @Override
    public void ausfuehren() {
        System.out.println("Aufgabe...");
    }
}

class Aufgabe2 implements Ausfuehrbar {

    @Override
    public void ausfuehren() {
        System.out.println("Aufgabe2...");
    }
}


