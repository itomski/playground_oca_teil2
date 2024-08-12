package de.lubowiecki.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Termin implements Comparable<Termin> {

    private LocalDate datum;
    private LocalTime zeit;

    private String titel;

    public Termin(LocalDate datum, LocalTime zeit, String titel) {
        this.datum = datum;
        this.zeit = zeit;
        this.titel = titel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Termin{");
        sb.append("datum=").append(datum);
        sb.append(", zeit=").append(zeit);
        sb.append(", titel='").append(titel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Termin other) {
        return LocalDateTime.of(datum, zeit).compareTo(LocalDateTime.of(other.datum, other.zeit));
    }
}
