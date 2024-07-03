package de.lubowiecki;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TimeTest3 {

    public static void main(String[] args) {

        // Zeitobjekte (LacalDate, LocalTime, LocalDateTime) sind immutable

        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        ld1 = ld1.plusDays(10); // Muss wieder auf Referenz zugewiesen werden
        ld1 = ld1.minusYears(2);
        ld1 = ld1.minus(2, ChronoUnit.DAYS); // Erlaubt nur Einheiten die im Datum enthalten sind
        ld1 = ld1.plus(100, ChronoUnit.WEEKS);

        System.out.println(ld1.getDayOfMonth());

        // 2024-04-22
        // ChronoUnit: Eine Einheit in die ggfl. umgerechnet wird
        // ChronoField: Eine bestimme Information im Datum
        System.out.println(ld1.getLong(ChronoField.YEAR));

        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("y G");
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate now = LocalDate.now();

        System.out.println(now.format(DATE_FMT)); // Formatierte Ausgabe
        now = now.minusYears(2050);
        System.out.println(now.format(DATE_FMT));

        // Relevant für die Prüfung
        // y, u Jahr
        // M Monat
        // m Minute
        // H Stunde
        // d Monatstag, D Jahrestag
        // s Sekunden

        LocalDate ld2 = LocalDate.parse("15.07.2015", DATE_FMT); // Datum aus String einlesen
        System.out.println(ld2);
        System.out.println(ld2.format(DATE_FMT));

    }
}
