package de.lubowiecki.uebung.fahrzeugmanagement;

import java.io.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static final String FILE_NAME = "fahrzeuge.ser";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Map<String, Fahrzeug> fahrzeuge;
            try {
                fahrzeuge = read();
            }
            catch(IOException e) {
                fahrzeuge = new HashMap<>();
            }

            Fahrzeug fahrzeug;

            System.out.print("Neues Fahrzeug: ");
            if(scanner.next().trim().equalsIgnoreCase("ja")) {
                fahrzeug = new Fahrzeug();
                System.out.print("Kennzeichen: ");
                fahrzeug.setKennzeichen(scanner.next());
                System.out.print("Marke: ");
                fahrzeug.setMarke(scanner.next());
                System.out.print("Farbe: ");
                fahrzeug.setFarbe(scanner.next());
                System.out.print("Baujahr: ");
                fahrzeug.setBaujahr(scanner.nextInt());
                fahrzeuge.put(fahrzeug.getKennzeichen(), fahrzeug);
            }
            else {
                System.out.print("Kennzeichen: ");
                fahrzeug = fahrzeuge.get(scanner.next());
                // TODO: Validieren, ob das Fahrzeug verfügbar ist
            }

            System.out.print("Eintrag in Checkheft? ");
            if(scanner.next().trim().equalsIgnoreCase("ja")) {
                System.out.print("Text: ");
                scanner.nextLine();
                fahrzeug.getCheckheft().addEintraeg(scanner.nextLine());
            }

            System.out.print("Anzeigen? ");
            if(scanner.next().trim().equalsIgnoreCase("ja")) {
                System.out.println(fahrzeuge);
            }

            save(fahrzeuge);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void save(Map<String, Fahrzeug> fahrzeuge) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(fahrzeuge);
        }
    }

    private static Map<String, Fahrzeug> read() throws IOException, ClassNotFoundException {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Map<String, Fahrzeug>) in.readObject();
        }
    }
}
