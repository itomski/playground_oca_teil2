package de.lubowiecki.zooverwaltung;

import java.util.Scanner;

public class ZooTest {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);

        app: while(true) {

            System.out.print("\nWelche Karte? [C, A, G] ");
            String eingabe = scanner.next();

            switch(eingabe.trim().toLowerCase()) {

                case "c" -> zoo.addVisitor(new Child());
                case "a" -> zoo.addVisitor(new Adult());
                case "g" -> {
                    System.out.print("Personenanzahl: ");
                    int num = scanner.nextInt();
                    zoo.addVisitor(new Group(num));
                }
                default -> System.out.println("Falsche Auswahl");
            }

            System.out.println();

            System.out.println("Umsatz: " + zoo.computeTurnover());
            System.out.println("Besucher: " + zoo.visitorCount());
        }
    }
}
