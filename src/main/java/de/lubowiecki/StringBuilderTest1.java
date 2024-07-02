package de.lubowiecki;

public class StringBuilderTest1 {

    public static void main(String[] args) {

        String str = "Hallo";
        str += " Welt";

        for (int i = 0; i < 100; i++) {
            str += i; // Jede Änderung erzeugt ein neues Objekt auf dem Speicher
        }



        String vergleich1 = "Hallo Welt";
        String vergleich2 = "hallo welt";

        System.out.println(str == vergleich1);
        System.out.println(str.equals(vergleich1));
        System.out.println(str.toLowerCase() == vergleich2);
        System.out.println(str.toLowerCase().equals(vergleich2));

        System.out.println();

        StringBuilder sb = new StringBuilder(); // Standard capacity: 16
        //StringBuilder sb = new StringBuilder("ABC"); // Capacity: Inital-Inhalt + 16
        //StringBuilder sb = new StringBuilder(100); // Capacity: 100
        System.out.println(sb.capacity());

        // capacity = interge Größe des Zeichenarrays
        // size = Anzahl von Zeichen im Array

        sb.append(123);
        sb.append("abc");
        sb.append("ABC");
        sb.append("öß€");

        for (int i = 0; i < 100; i++) {
            sb.append(i); // Vorhandener StringBuilder wird erweitert - Es gibt nur 1 Objekt
        }

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.toString());


        //sb.append("Das ist das Haus");
        //sb.append(" von "); // Das interne Array muss vergrößert werden
        sb.trimToSize(); // Kürzt das interne Array auf die benötigte Größe (passend zum Inhalt)
        System.out.println(sb.capacity());


    }
}
