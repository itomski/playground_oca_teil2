package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");

        if(!namen.add("Peter")) {
            System.out.println("Konnte nicht hinzugefügt werden!");
        }

        System.out.println(namen);

        // Jedes Objekt muss hashCode und equals richtig implementieren

        System.out.println();

        Set<Fahrzeug> fahrzeuge = new HashSet<>();
        fahrzeuge.add(new Fahrzeug("HH:AB123"));
        fahrzeuge.add(new Fahrzeug("HH:BX2254"));
        fahrzeuge.add(new Fahrzeug("HH:AB123"));
        fahrzeuge.add(new Fahrzeug("HH:AB768"));

        System.out.println(fahrzeuge);

        System.out.println();

        for(Fahrzeug f : fahrzeuge) {
            System.out.println(f.getKennzeichen());
        }

        System.out.println();

        fahrzeuge.forEach(e -> System.out.println(e.getKennzeichen()));

        // Set (Menge)
        // erlaubt KEINE Duplikate
        // hat keinen Index

        // HashSet: Nicht sortiert
        // LinkedHashSet: Einfügereihenfolge
        // TreeSet: Immer sortiert

        Set<String> namen2 = new TreeSet<>();
        namen2.add("Scott");
        namen2.add("Tony");
        namen2.add("Peter");
        namen2.add("Carol");
        namen2.add("Natasha");
        namen2.add("Bruce");
        namen2.add("Peter");
        System.out.println(namen2);

        System.out.println();

        Set<Fahrzeug> fahrzeuge2 = new TreeSet<>();
        fahrzeuge2.add(new Fahrzeug("HH:AB123"));

        System.out.println(fahrzeuge2);

    }
}
