package de.lubowiecki;

import java.time.LocalDate;

public class StringManipulationTest {

    public static void main(String[] args) {

        String wort = "Wasser \" ...\n";

        // Soll die Änderung permanent sein, muss die Referenz neu zugewiesen werden
        wort = wort.toUpperCase(); // In Großbuchstaben ändern
        //wort = wort.substring(2); // Liefert alles ab Index 2
        wort = wort.substring(1, 5); // Liefert alles ab Index 2 bis Index 5

        System.out.println(wort);
        //System.out.println(wort.matches("[a-zA-Z]{5,10}"));
        String regexp = "\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
        String email = "peter.parker@shield.org";
        System.out.println("Email: " + email.matches(regexp));


        //machWas(wort); // Kein Literal
        //machWas("Wasser"); // Literal

        // LocalDate, LocalTime und LocalDateTime sind auch immutable
        LocalDate now = LocalDate.now();
        now = now.plusDays(10); // Das neue Objekt muss auf die Referenz zugewiesen werden
        System.out.println(now);

    }

    private static void machWas(String str) {
        System.out.println(str.toLowerCase());
    }
}
