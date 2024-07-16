package de.lubowiecki.vererbung;

public class ReturnTest {

    public static void main(String[] args) {

        // statische Methoden und Eigenschaften (nicht private) werden auf dem Referenztyp ausgeführt
        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        ParentD a = new ParentD();
        a.machWas();

        ParentD b = new ChildD();
        b.machWas();

        // Der Referenztyp entscheidet, welche Methoden sichtbar sind
        // Ausgeführt werden diese Methoden aber auf dem Objekttyp
        //b.machWasGanzAnderes(); // Error

        ChildD c = new ChildD();
        c.machWasGanzAnderes();

        // Animal a1 = new Animal();
        // a1 = new Bird();
        // a1 = new Cat();

        // Animal a2 = new Bird();

        // a1.print()
        // a1.fly() // Nicht ok. In dem Referenztyp gibt es kein fly(). Diese Methode ist also nicht sichtbar
        // ((Bird)a1).fly(); // Ok

        Integer i = 10;
        Object o = i; // Integer IS-A Object
        // i = o; // Error: Object IS-NOT Integer
        i = (Integer)o; // ist o auf Heap ein Integer ist das OK, sonst ClassCastException


    }
}

class ParentD {

    public ParentD(int x) {
        // super(); // Benutzt den Parameterlosen-Konstruktor von Object
    }

    void machWas() {
        System.out.println("ParentD: machWas()");
    }

    int machWas(int a, int b) {
        System.out.println("ParentD: machWas(a, b)");
        return a + b;
    }

    CharSequence machWasAnderes() {
        System.out.println("ParentD: machWasAnderes()");
        return "Hallo Welt"; // String IS-A CharSequence
    }
}

class ChildD extends ParentD {

    public ChildD() {
        // super(); // Benutzt den Parameterlosen-Konstruktor von ParentD
        super(10); // Benutzt den Int-Parameter-Konstruktor von ParentD
    }

    public ChildD(int z) {
        // super(); // Benutzt den Parameterlosen-Konstruktor von ParentD
        // super(z); // Benutzt den Int-Parameter-Konstruktor von ParentD
        this(); // Benutzt den anderen Konstruktor von ChildD
    }

    @Override // Prüft die Regeln für das Überschrieben
    public void machWas() {
        System.out.println("ChildD: machWas()");
    }

    // bei primitiven Datentypen und void muss der Rückgabetyp gleich bleiben
    int machWas(int a, int b) {
        System.out.println("ChildD: machWas(a, b)");
        byte c = 10;
        return c; // byte wird über primitive Widening auf int angehoben
    }

    // Co-Varianz = Bei komplexen Datentypen kann ein die gleiche Klasse oder
    // auch Kindklassen davon als Rückgabetyp verwendet werden

    @Override
    CharSequence machWasAnderes() {
        System.out.println("ChildD: machWasAnderes()");
        // StringBuilder IS-A CharSequence
        return new StringBuilder("Das ist das Haus von Nikigraus");
    }

    void machWasGanzAnderes() {
        System.out.println("ChildD: machWasGanzAnderes()");
    }
}
