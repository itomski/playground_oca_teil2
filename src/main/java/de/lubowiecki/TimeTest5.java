package de.lubowiecki;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeTest5 {

    public static void main(String[] args) {

        // List ist ein Interface - Kann als Referenztyp verwendet werden
        // ArrayList ist eine konkrete, instanzierbare Klasse - kann als Referenz- und Objekttyp verwendet werden
        List<LocalDate> dates = new ArrayList<>(); // Lists sind Collections
        //ArrayList<LocalDate> dates = new ArrayList<>();
        //ArrayList<LocalDate> dates = new List<>(); // Error

        // LocalDate, LocalTime und LocalDateTime sind sortierbar (comparable)
        dates.add(LocalDate.of(2017, 2, 10));
        dates.add(LocalDate.of(2007, 1, 1));
        dates.add(LocalDate.of(2033, 10, 5));
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2022, 8, 30));
        dates.add(LocalDate.of(2001, 2, 7));

        // Arrays.sort(...) // Nur für Arrays
        Collections.sort(dates);

        for(LocalDate date : dates) {
            System.out.println(date);
        }

        System.out.println();

        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("Backen ohne Mehl"));
        buecher.add(new Buch("Kochen ohne Wasser"));
        buecher.add(new Buch("Braten ohne Fett"));
        //Collections.sort(buecher); // Die Klasse Buch implementiert Comparable NICHT d.h. ist nicht sortierbar

        // Beschreibt eine Einheit
        // TemporalUnit: Interface
        // ChronoUnit: Enum, implementiert TemporalUnit

        // Beschreibt einen bestimmten Information/Bereich einer Zeitangabe
        // TemporalField: Interface
        // ChronoField: Enum, implementiert TemporalField

        long monatsTag = LocalDate.now().get(ChronoField.DAY_OF_MONTH);

        ChronoUnit unit;
        unit = ChronoUnit.HOURS;
        unit = ChronoUnit.DAYS;
        unit = ChronoUnit.HALF_DAYS;

        LocalDate ld = LocalDate.now();
        System.out.println(ld.isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(ld.isSupported(ChronoField.MINUTE_OF_DAY));
        System.out.println(ld.isSupported(ChronoField.SECOND_OF_MINUTE));
        System.out.println(ld.isSupported(ChronoUnit.CENTURIES));
        System.out.println(ld.isSupported(ChronoUnit.HOURS));
        System.out.println(ld.isSupported(ChronoUnit.DAYS));


    }
}
