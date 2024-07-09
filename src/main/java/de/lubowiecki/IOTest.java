package de.lubowiecki;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class IOTest {

    public static void main(String[] args) {

        Path pfad = Paths.get("data/content.txt");

        System.out.println("Datei vorhanden: " + Files.exists(pfad));

        Scanner scanner = new Scanner(System.in);

        try {
            if(!Files.exists(pfad))
                Files.createFile(pfad);

            System.out.println("Gibt bisschen Inhalt ein: ");
            BufferedWriter writer = Files.newBufferedWriter(pfad, StandardOpenOption.APPEND);
            writer.append(scanner.nextLine());
            writer.close();
        }
        catch(FileAlreadyExistsException ex) {
            System.out.println("Datei ist bereits verfügbar");
        }
        catch(IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
