package de.lubowiecki.uebung.kalender;

import de.lubowiecki.uebung.kalender.Kalender;
import de.lubowiecki.uebung.kalender.Termin;

import java.time.LocalDateTime;
import java.util.Scanner;

public class U12DatumUndZeit2 {

    // Schreibe eine Klasse, die einen Terminkalender realisiert.
    // Der Benutzer kann Termine eintragen und Termine abfragen.
    // Ein Termin besteht aus einem Datum und Uhrzeit (aktuell noch kein Text)
    // Nach dem Eintragen eines Termins sollen der Termin an die passende Stelle sortiert werden
    // Bei der Anzeige soll das Datum ausgegeben werden und angegeben werden wie lange es noch bis zum Termin ist
    private static Scanner scanner = new Scanner(System.in);
    private static Kalender kalender = new Kalender();

    public static void main(String[] args) {

        app: while(true) {

            System.out.print("Auswahl: ");

            switch(scanner.nextLine().trim().toLowerCase()) {

                case "e":
                    addTermin();
                    break;

                case "l":
                    showTermine();
                    break;

                case "q":
                    break app;

                default:
                    System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Programm wird beendet");
    }

    private static void addTermin() {

        LocalDateTime zeitpunkt;

        while(true) {
            System.out.print("Datum und Uhrzeit: ");
            String zeitpunktStr = scanner.nextLine();
            try {
                zeitpunkt = LocalDateTime.parse(zeitpunktStr, Kalender.FMT);
                if(!Kalender.checkZeitpunkt(zeitpunkt)) throw new Exception();
                break;
            }
            catch(Exception e) {
                System.out.println("Falsche Eingabe. Versuche es erneut.");
            }
        }

        System.out.print("Titel: ");
        String titel = scanner.nextLine();

        Termin termin = new Termin(zeitpunkt, titel);
        kalender.add(termin);
    }

    private static void showTermine() {
        kalender.printTermine();
    }
}
