package de.lubowiecki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckedUncheckedTest {

    public static void main(String[] args) {

        Path path = Paths.get("data.txt");

        // handle or declate
        // handle: Selbst die Behandlung mit catch vornehmen
        // declate: Die Methode als gefährlich deklarieren und die Behandlung an den Aufrufer delegieren

        try {
            // checked
            Files.readAllLines(path); // Java erzwingt eine Behandlung
        }
        catch (IOException e) {
            System.out.println("Problem");
        }

        try {
            String s1 = null;
            // unchecked
            System.out.println(s1.toLowerCase());
        }
        catch(RuntimeException ex) {
            System.out.println("Problem");
        }

        System.out.println();

        try {
            zeigeDateiInhalt();
        }
        catch (IOException e) {
            System.out.println("Probleme mit der Datei");
        }

        System.out.println("ENDE");

    }

    public static void zeigeDateiInhalt() throws IOException {

        // NIO
        Path path = Paths.get("data/content.txt");
        List<String> zeilen = null;

        //try {
            zeilen = Files.readAllLines(path);
        //}
        //catch (IOException e) {
        //    System.out.println("Probleme mit der Datei.");
        //}

        for(String zeile : zeilen) {
            System.out.println(zeile);
        }
    }
}
