package de.lubowiecki.collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        Set<Termin> termine = new TreeSet<>();
        termine.add(new Termin(LocalDate.now().plusDays(7), LocalTime.of(18, 22), "Bla bla bla"));
        termine.add(new Termin(LocalDate.now(), LocalTime.of(15, 30), "Essen mit Peter"));
        termine.add(new Termin(LocalDate.now().plusDays(7), LocalTime.of(10, 15), "Projektmeetning"));
        termine.add(new Termin(LocalDate.now().plusDays(2), LocalTime.of(18, 15), "Konzert"));

        // Object o = new Termin(LocalDate.now(), LocalTime.of(15, 30), "Essen mit Peter");
        // Comparable<Termin> t = (Comparable<Termin>) o;

        //System.out.println(termine);

        for(Termin t : termine) {
            System.out.println(t);
        }
    }
}
