package de.lubowiecki;

public class StringTest1 {

    public static void main(String[] args) {

        String s1 = "Hallo"; // Landet im String-Literal-Pool
        String s2 = "Hallo"; // Zeigt auf das Objekt im Pool
        String s3 = new String("Hallo"); // Landet NIE im Pool
        String s4 = new String("Hallo");

        // == bei Objekten prüft, ob beide Variablen auf das gleiche Objekt auf dem Heap verweisen

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s3 == s4: " + (s3 == s4));

        System.out.println();

        // equals bei Objekten prüft, ob beide Variablen auf ein Objekt mit gleichen Inhalt verweisen

        System.out.println("s1.equals(s2): " + (s1.equals(s2)));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));
        System.out.println("s3.equals(s4): " + (s3.equals(s4)));

        // Bei eigenen Klassen muss equals erstmal eingebaut werden

    }
}
