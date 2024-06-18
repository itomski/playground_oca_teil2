package de.lubowiecki;

// Normale Imports importieren nur Klassen/Interfaces/Enums
import java.time.LocalDate;
import java.util.*; // Alle Klassen aus dem Packege werden importiert

// Statische Imports importieren nur das statische Inventar
import static java.lang.Math.PI; // nur PI
import static java.lang.Math.*; // alle statischen Eigenschaften und Methoden
import static de.lubowiecki.Wochentag.*; // Alle Optionen des Enums werden importiert

public class ImportTest {

    public static void main(String[] args) {

        // Muss importiert werden, bevor sie verwendet wird
        LocalDate heute = LocalDate.now();

        // Klassen aus dem gleichen Package brauchen nicht importiert zu werden

        Date d1; // java.util.Date
        java.sql.Date d2; // java.sql.Date

        // Alle Klassen aus java.lang sind automatisch importiert
        String s = "Hallo"; // java.lang.String
        Integer i = 123; // java.lang.Integer

        List<String> namen = new ArrayList<>(); // Liste
        Set<String> andereNamen = new HashSet<>(); // Menge
        namen.add("Peter");
        andereNamen.add("Bruce");

        System.out.println(Math.PI); // PI ist statisch

        // Statische Imports importieren das statisch Inventar (Eigenschaften oder Methoden) einer anderen Klasse
        System.out.println(PI); // wurde statisch importiert
        System.out.println(E);
        System.out.println(pow(5,2)); // wurde statisch importiert

        System.out.println(Wochentag.DIENSTAG); // Ohne statischen Import
        System.out.println(DIENSTAG); // Mit statischen Import

    }
}
