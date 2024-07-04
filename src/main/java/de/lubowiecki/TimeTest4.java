package de.lubowiecki;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

public class TimeTest4 {

    private static Logger logger = Logger.getLogger(TimeTest4.class.getName());

    public static void main(String[] args) {

        Instant start = Instant.now();

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println();
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.of(16, 30);
        LocalDateTime ldt = ld.atTime(lt); // Datum wird mit Zeit verbunden
        ldt = lt.atDate(ld); // Zeit wird mit Datum verbunden
        System.out.println(ldt);

        System.out.println();

        // Year y = Year.now(); // aktuelles Jahr
        Year y = Year.of(2020);
        YearMonth ym = y.atMonth(Month.AUGUST);
        LocalDate ld2 = ym.atDay(15);
        System.out.println(ld2);
        LocalDate ld3 = ym.atEndOfMonth();
        System.out.println(ld3);
        LocalDate ld4 = y.atDay(200); // Tag des Jahres
        System.out.println(ld4);
        System.out.println("Ist Schaltjahr: " + y.isLeap());

        LocalDate now = LocalDate.now();
        System.out.println("ist in der Vergangenheit? " + ld3.isBefore(now));
        System.out.println("ist in der Zukunft? " + ld3.isAfter(now));

        Period p = Period.between(ld3, now);
        System.out.println("Jahre: " + p.getYears() + ", Monate: " + p.getMonths() + ", Tage: " + p.getDays());

        System.out.println(ChronoUnit.DAYS.between(ld3, now) + " Tage");
        long days = ChronoUnit.DAYS.between(now, ld3);
        System.out.println(Math.abs(days) + " Tage"); // Hier ist es egal ob - oder +

        System.out.println();

        long nanos = ChronoUnit.NANOS.between(LocalTime.now(), LocalTime.of(16,30));
        System.out.println(Math.abs(nanos) + " nanos"); // Hier ist es egal ob - oder +

        System.out.println();

        // nanos = ChronoUnit.NANOS.between(LocalDateTime.now(), LocalDateTime.of(-2020, 2, 15, 16,30));
        // System.out.println(Math.abs(nanos) + " Nanos");

        Period p2 = Period.ofWeeks(25).plusYears(10).plusMonths(22); // Wochen werden gleich in Tage umgerechnet
        System.out.println(p2);
        System.out.println(p2.normalized()); // Kleinere Einheiten werden in größere umgerechnet

        Instant end = Instant.now();

        logger.info(Duration.between(start, end).toNanos() + "ns");

    }
}
