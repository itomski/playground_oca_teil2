package de.lubowiecki.vererbung;

public class Kunde {

    private String vorname;
    private String nachname;

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
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

    public void stream() {
        System.out.println("Die Mitgliedschaft ist noch nicht klar.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
