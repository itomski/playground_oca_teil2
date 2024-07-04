package de.lubowiecki.uebung.kalender;

import java.time.LocalDateTime;

public class Termin implements Comparable<Termin> {

    private LocalDateTime zeitpunkt;

    private String titel;

    public Termin(LocalDateTime zeitpunkt, String titel) {
        this.zeitpunkt = zeitpunkt;
        this.titel = titel;
    }

    public LocalDateTime getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(LocalDateTime zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public int compareTo(Termin other) {
        return zeitpunkt.compareTo(other.zeitpunkt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(zeitpunkt.format(Kalender.FMT));
        sb.append(": ").append(titel);
        return sb.toString();
    }
}
