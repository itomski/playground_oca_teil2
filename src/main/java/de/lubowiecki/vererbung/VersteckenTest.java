package de.lubowiecki.vererbung;

public class VersteckenTest {

    public static void main(String[] args) {

        ChildA a = new ChildA();
        System.out.println(a.zahl);
        a.showZahl();
        a.showAndereZahl();

        System.out.println();

        ParentA b = new ChildA(); // Ok: ChildA IS-A ParentA
        // ParentA c = new String(); // Error: String IS-NOT ParentA

        // Referenz kann vom Typ
        // einer konkreten Klasse sein
        // einer abstrakten Klasse sein
        // eines Interfaces sein

        // Variablen und statische Methoden werden auf dem Referenztyp (ParentA) ausgeführt
        System.out.println(b.zahl);
        b.showZahl(); // Instanz-Methoden werden auf dem Objekttyp (ChildA) ausgeführt
        // Referenztyp ist ParentA = Wir sehen nur Methoden und Eigenschaften von ParentA
        // b.showAndereZahl();
    }
}

class ParentA {

    int zahl = 100;

    public void showZahl() {
        System.out.println("ParentA: " + zahl);
    }
}

class ChildA extends ParentA {

    // hiding
    long zahl = 200L;

    @Override
    public void showZahl() {
        System.out.println("ChildA: " + zahl);
        // Super ist eine Referenz auf ein Objekt der Elternklasse
        System.out.println("Elternklasse: " + super.zahl);
    }

    public void showAndereZahl() {
        System.out.println("ChildA: " + zahl * zahl); // Punkt vor Strich

        // Alle Operationen sind gleichwertig, daher von Links nach Rechts
        // System.out.println("ChildA: " + zahl - zahl); // - für Strings ist nicht erlaubt
    }
}

interface InterA {

    void machWas();

}

interface InterB extends InterA {

    void machWasAnderes();

}

abstract class ChildB implements InterB {

    // Wird eine Interface-Methode nicht eingebaut, muss die Klasse abstrakt werden

    @Override
    public void machWas() {
        System.out.println("...");
    }
}

class ChildC extends ChildB {

    // Muss noch die fehlende Methode einbauen
    @Override
    public void machWasAnderes() {

    }
}

