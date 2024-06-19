package de.lubowiecki.uebung;

public class U1Vererbung {

    // Schreibe eine Klasse, die ein Medium definiert

    // Schreibe Kindklassen (Buch, Video, Zeitschrift, Musik), die von Medium erben.
    // In Medium sollen alle Informationen definiert sein, die alle Medien gemeisam haben

    // Sorge dafür, dass von der Klasse Medium keine Instanzen direkt erzeugt werden können

    // Schreibe eine Testklasse, wo die Objekte benutzt werden

    public static void main(String[] args) {

        //Medium m1 = new Medium(); // Erzeugt ein leeres Medium
        //Medium m1 = new Medium("Backen ohne Mehl", "...", 2017, 15.99);
        Medium m1 = new Medium("Backen ohne Mehl");
        //System.out.println(m1.getTitel()); // liest den aktuellen Zustand des Objekts

        /*
        m1.setTitel("Backen ohne Mehl"); // Schreibt in die titel-Eigenschaft des Objekts
        m1.setBeschreibung("Ein Buch");
        m1.setErscheinungsJahr(2015);
        m1.setPreis(10.99);
        */

        m1.setPreis(10.99); // Verändert den Zustand des Objekts

        //System.out.println(m1.getTitel());
        //System.out.println(m1.ausgeben2());
        m1.ausgeben1();


    }
}
