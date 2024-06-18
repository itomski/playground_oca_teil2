package de.lubowiecki;

public class ModifierTest {

    public static void main(String[] args) {

        A a1 = new A();
        a1.run();
        //a1.showX(); // Nicht sichtbar, da privat

        System.out.println();

        B b1 = new B();
        b1.run();

    }
}

class A {

    private int x = 100;

    private void showX() {
        System.out.println(x);
    }

    public void run() {
        showX();
    }
}

class B extends A {

    // Nur nicht privates Inventar wird vererbt

    // Überschrieben = Die geerbte Version einer Methode mit einer eigenen Version überlagern
    @Override
    public void run() {
        super.run(); // Führt die überlagerte Methode aus der Elternklasse aus
        System.out.println("0");
    }
}
