package de.lubowiecki.uebung.kalender;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kalender {

    public static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    private List<Termin> termine = new ArrayList<>();

    public void add(Termin termin) {
        termine.add(termin);
        Collections.sort(termine);
    }

    public List<Termin> getTermine() {
        return termine;
    }

    public void printTermine() {
        for(Termin t : termine) {
            System.out.println(t);
        }
    }

    public static boolean checkZeitpunkt(LocalDateTime zeitpunkt) {
        return LocalDateTime.now().isBefore(zeitpunkt);
    }
}
