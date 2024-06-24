package de.lubowiecki.uebung;

import java.util.Random;
import java.util.Scanner;

public class U6Strings {

    // Schreibe ein kleines Ratespiel
    // Per Zufall wird ein String mit einem Zeichen erzeugt (nur Großbuchstaben)
    // Danach gibt der User per Console Zeichen ein und versucht damit das Zufallszeichen zu erraten.
    // Er hat 3 Versuche

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random rand = new Random();
        int zahl = rand.nextInt(25) + 65; // Zufallszahl zwischen 65 ... 90

        //int zahl = (int)(Math.random() * 25) + 65; // Zufallszahl zwischen 65 ... 90

        // (char)zahl : Aus zahl wird ein Zeichen nach der Unicode-Tabelle
        String zeichen = (char)zahl + ""; // Aus primitiven char wird ein String

        boolean treffer = false;
        int versuch = 0;

        while(versuch < 5) {
            versuch++; // Anzahl der Versuche hochzählen

            System.out.print("Welches Zeichen? (A-Z): ");

            // Gesuchtes Zeichen und Eingabe des Users sind String-Objekte, daher Vergleich mit equals
            // Wenn gesuchtes Zeichen und Eingabe des Users primitive chars wären, dann Vergleich mit ==

            if(scanner.next().equals(zeichen)) {
                System.out.println("Treffer!");
                treffer = true;
                break; // Beendet die While-Schleife
            }
            else {
                System.out.println("Leider kein Treffer!");
            }
        }

        if(treffer) {
            System.out.println("Super! Du hast beim Versuch #" + versuch + " das Zeichen erraten.");
        }
        else {
            System.out.println("Schade! Das gesuchte Zeichen war " + zeichen);
        }
    }
}
