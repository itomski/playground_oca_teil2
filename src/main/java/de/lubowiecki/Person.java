package de.lubowiecki;

// Klassenvariablen
// Instanzvariablen
// Lokale Variablen (Methoden Parameter sind auch lokale Variablen)

import java.util.Objects;

public class Person {

    static String typ = "Mensch"; // Ist immer verfügbar

    String name = "Unbekannt"; // Nur im Objekt verfügbar

    int alter = -1; // Nur im Objekt verfügbar

    public Person() {
    }

    // Default-Konstruktor wird nicht automatisch bereitgestellt,
    // sobald ein eigener deklariert ist

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public Person(String name) {
        // this.name = Instanzvariable = Lebt so lange, wie das Objekt
        // name = Lokale Variable = Lebt nur bist zum Ende der Methode
        this.name = name;
        this.alter = 0;
    }

    @Override
    public String toString() { // Übersetzt das Objekt in einen String
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return alter == person.alter && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(name, alter);
    }
}
