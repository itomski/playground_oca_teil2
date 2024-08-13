package de.lubowiecki.uebung;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class U17Collections {

    // int compare(T o1, T o2);
    private static final Comparator<Mitglied> NACH_GEBURTSDATUM = (a, b) -> a.getGeburtsdatum().compareTo(b.getGeburtsdatum());
    private static final Comparator<Mitglied> NACH_NACHNAME = (a, b) -> a.getNachname().compareTo(b.getNachname());
    private static final Comparator<Mitglied> NACH_VORNAME = (a, b) -> a.getVorname().compareTo(b.getVorname());

    // Aufgabe 1
    // Schreibe eine Klasse zum Verwalten eines Vereins
    // Es können Mitglieder hinzugefügt werden, und diese werden sortiert nach Vor- und Nachnamen ausgegeben
    // Jedes Mitglied hat einen Vor- und Nachnamen und ein Geburtsdatum
    // Schreibe eine alternative Sortierung nach Geburtsdatum

    public static void main(String[] args) {

        Set<Mitglied> mitglieder = new TreeSet<>(); // Natürliche Ordnung
        mitglieder.add(new Mitglied("Peter", "Parker", LocalDate.of(2000, 10, 7)));
        mitglieder.add(new Mitglied("Carol", "Danvers", LocalDate.of(1995, 9, 6)));
        mitglieder.add(new Mitglied("Bruce", "Banner", LocalDate.of(1989, 8, 5)));

        mitglieder.forEach(m -> System.out.println(m.getNachname() + ", " + m.getVorname()));

        System.out.println();

        Set<Mitglied> mitgliederSort1 = new TreeSet<>(NACH_GEBURTSDATUM);
        mitgliederSort1.addAll(mitglieder);

        mitgliederSort1.forEach(m -> System.out.println(m.getNachname() + ", " + m.getVorname() + ", " + m.getGeburtsdatum()));

        System.out.println();

        Set<Mitglied> mitgliederSort2 = new TreeSet<>(NACH_NACHNAME.thenComparing(NACH_VORNAME).thenComparing(NACH_GEBURTSDATUM));
        mitgliederSort2.addAll(mitglieder);
        mitgliederSort2.add(new Mitglied("Bruce", "Banner", LocalDate.of(1999, 1, 5)));
        mitgliederSort2.add(new Mitglied("Adam", "Banner", LocalDate.of(2000, 1, 5)));

        mitgliederSort2.forEach(m -> System.out.println(m.getNachname() + ", " + m.getVorname() + ", " + m.getGeburtsdatum()));
    }

    // Aufgabe 2
    // Schreibe eine Rezeptverwaltung
    // Einzelne Schritte des Rezepts werden in eine Queue abgelegt
    // Und dann nacheinander abgearbeitet
}

class Mitglied implements Comparable<Mitglied> {

    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    public Mitglied() {
    }

    public Mitglied(String vorname, String nachname, LocalDate geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public int compareTo(Mitglied other) {
        return nachname.compareTo(other.nachname);
    }
}

