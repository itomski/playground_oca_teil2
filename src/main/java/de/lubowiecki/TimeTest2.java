package de.lubowiecki;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TimeTest2 {

    public static void main(String[] args) {

        System.out.println("--- ALT ---");

        Date d1 = new Date();
        System.out.println(d1);

        d1 = new Date(2024, 10, 15);
        System.out.println(d1);

        d1 = Date.from(Instant.now());
        System.out.println(d1);

        System.out.println("--- NEU ---");

        LocalDate ld = LocalDate.of(2024, 10, 15); // Datum
        System.out.println(ld); // ISO-Format
        ld = LocalDate.now(); // Datum
        System.out.println(ld); // ISO-Format
        System.out.println(LocalTime.now()); // Zeit
        System.out.println(LocalDateTime.now()); // Datum und Zeit
        System.out.println(LocalTime.of(10, 25));
        System.out.println(LocalDateTime.of(2015, 10, 15, 13, 22, 44));
        LocalTime jetzt = LocalTime.now();
        System.out.println(LocalDateTime.of(ld, jetzt));
    }
}
