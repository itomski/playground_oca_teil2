package de.lubowiecki.uebung.fussball;

import java.util.Arrays;

public class Team {

    private String name;
    private Spieler[] kader;

    private int curIndex;

    public Team(String name, int teamGroesse) {
        this.name = name;
        // TODO: Validierung der Größe
        this.kader = new Spieler[teamGroesse]; // Array mit der einer vorgegebenen Größe erzeugen
    }

    public Team(String name) {
        this.name = name;
        this.kader = new Spieler[30]; // Array mit der Standardgröße 30 erzeugen
    }

    public void add(Spieler spieler) {
        if(curIndex < kader.length) // Spieler nur hinzufügen, wenn im Array noch ein Platz frei ist
            kader[curIndex++] = spieler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void zeigeKader() {
        //System.out.println(kader); // Die toString-Methode des Arrays ist bisschen Gaga!
        //System.out.println(Arrays.toString(kader)); // Gute Alternative!

        final String ROW = "| %12s | %12s | %4s | \n";

        System.out.printf(ROW, "Vorname", "Nachname", "Nr");
        System.out.printf("--------------------------------------\n");

        for (int i = 0; i < kader.length; i++) {
            if(kader[i] != null) {// Nur ausgeben, wenn an dem Index im Array ein Spieler enthalten ist
                Spieler s = kader[i];
                System.out.printf(ROW, s.getVorname(), s.getNachname(), s.getNr());
                //System.out.println(kader[i]);
            }
        }

        System.out.println();
    }
}
