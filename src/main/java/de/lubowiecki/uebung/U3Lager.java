package de.lubowiecki.uebung;

import java.util.Arrays;

public class U3Lager {

    // Schreibe eine Klasse, die ein Lager darstellt.
    // Das Lager kann über den Konstruktor eine Kapazität bekommen
    // Wenn keine Größe vorgegeben wird, soll die Standardgröße 10 sein.
    // Über eine Methode add(String produkt) soll es möglich sein Produkte zum Lager hinzuzufügen
    // Das soll nur solange möglich sein, bis das Lager voll ist, danach ergibt ein add eine passende Meldung
    // Nach jedem add soll der aktuelle Inhalt angezeigt werden


    // java de.lubowiecki.uebung.U3Lager 1 7 22
    public static void main(String[] args) {

        //System.out.println(args[0]); // Parameter, die beim Starten des Programms eigegeben wurden

        int pos = 0;
        String[] sammlung = new String[20];
        sammlung[pos] = "Milch";
        pos++;
        sammlung[pos] = "Butter";

        for (int i = 0; i < sammlung.length; i++) {
            System.out.println(sammlung[i]);
        }

        System.out.println();

        System.out.println(Arrays.toString(sammlung));
    }
}
