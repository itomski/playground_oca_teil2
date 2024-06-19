package de.lubowiecki.uebung;

import java.time.LocalDate;

public class U2Konstruktoren {

    // Schreibe eine Klasse (Tier oder Kunde oder Produkt) mit 5 Eigenschaften unterschiedlichen Typs
    // Schreibe dazu Getter und Setter
    // Schreibe mind. 3 Konstruktoren, mit denen das Objekt befüllt werden kann
    // Teste das Objekt

    public static void main(String[] args) {

        //Kunde k1 = new Kunde(); // Baut ein leeres Objekt
        //Kunde k1 = new Kunde("Bruce", "Banner");

        // Aufruf des Konstruktors
        Kunde k1 = new Kunde("Bruce", "Banner", LocalDate.of(1995, 10, 17));

        //k1.vorname = "Peter"; // Eigenschaft ist privat
        //System.out.println(k1.vorname); // Eigenschaft ist privat

        //k1.setVorname("Peter");
        //k1.setNachname("Parker");
        System.out.println(k1.getVorname() + " " + k1.getNachname());

        System.out.println();

        k1.setVorname("");
        //System.out.println(k1.getVorname() + " " + k1.getNachname());
        System.out.println(k1.getName());
        System.out.println(k1.getGeburtsdatum());

        System.out.println();

        LocalDate heute = LocalDate.now();
        System.out.println(heute);

        LocalDate gestern = LocalDate.of(2024, 6, 18);
        System.out.println(gestern);

        System.out.println();

        System.out.println(k1);

        k1.setAktiv(true);
        k1.setKundenNr(123);
        System.out.println(k1); // Methode in Kunde nicht vorhanden, aber in Object
        // System.out.println(k1.machWas()); // Methode weder in Kunde noch in Object vorhanden

        // Methoden, die von Object geerbt werden
        System.out.println(k1.toString());
        System.out.println(k1.hashCode());
        Kunde k2 = new Kunde("Carol", "Danvers");
        System.out.println(k1.equals(k2));
        System.out.println(k1.getClass());
    }
}
