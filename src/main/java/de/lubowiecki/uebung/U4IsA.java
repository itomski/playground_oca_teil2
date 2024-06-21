package de.lubowiecki.uebung;

import java.util.ArrayList;
import java.util.List;

public class U4IsA {

    // Schreibe eine Klasse, die ein Zoo realisiert
    // Schreibe verschiedene Tierklassen. Jedes Tier hat eine Methode mit dem bes sich vorstellt.
    // Schaffe die Möglichkeit, dass verschidene Tierobjekte dem Zoo zugeordnet werden können
    // Es kann angezeigt werden, welche Tiere dem Zoo angehören

    public static void main(String[] args) {
        Tier t1 = new Tier("Leo");
        t1.vorstellen();
        t1.umbennen("Hansen");
        t1.vorstellen();

        System.out.println();

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        System.out.println(namen);

        System.out.println();

        List<Tier> tiere = new ArrayList<>();
        tiere.add(t1);
        tiere.add(new Tier("Klaus"));
        Tier t2 = new Tier("Peters");
        tiere.add(t2);

        System.out.println(tiere);

        System.out.println(t2); // toString wird automatisch aufgerufen


    }
}

class Tier {

    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public void vorstellen() {
        System.out.println("Ich bin " + name);
    }

    public void umbennen(String name) {
        this.name = name;
    }

    // To String konvertiert ein Objekt in einen String
    @Override
    public String toString() {
        return "####:" + name;
    }
}