package de.lubowiecki.collections;

import java.util.Objects;

public class Fahrzeug implements Comparable<Fahrzeug> {

    private String kennzeichen;

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(kennzeichen, fahrzeug.kennzeichen);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(kennzeichen);
    }

    @Override
    public int compareTo(Fahrzeug other) {
        return kennzeichen.compareTo(other.getKennzeichen());
    }
}
