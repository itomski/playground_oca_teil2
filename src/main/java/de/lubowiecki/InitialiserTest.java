package de.lubowiecki;

public class InitialiserTest {

    static { // Klassen-Initialiser: Wird beim laden der Klasse ausgeführt
        System.out.println("SInit");
        int rand = (int)(Math.random() * 100) + 1;
        if(rand > 50) {
            zahl = 1;
        }
        else {
            zahl = 0;
        }

        // hat Zugriff nur auf static Eigenschaften
        // statische Konstanten (final) müssen spätestens hier ihren Wert bekommen
    }

    { // Instanz-Initialiser: Wird vor der Objekterzeugung ausgeführt
        // Wird direkt vor dem Konstruktor ausgeführt
        System.out.println("IInit 1");
        // Hat Zugriff auf alle Instanz und Klassenvariablen
    }

    {
        System.out.println("IInit 2");
    }

    {
        System.out.println("IInit 3");
    }

    // Static-Initialiser als erstes und nur 1x
    // Instanz-Initialiser danach und für jede Instanzierung
    // Danach der Konstruktor

    static final int zahl;
    final int andereZahl;

    public InitialiserTest() {
        System.out.println("Const");
        this.andereZahl = 200;
    }

    public static void main(String[] args) {

        InitialiserTest a = new InitialiserTest();
        InitialiserTest b = new InitialiserTest();
        InitialiserTest c = new InitialiserTest();


    }
}
