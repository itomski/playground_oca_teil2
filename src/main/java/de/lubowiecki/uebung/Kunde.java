package de.lubowiecki.uebung;

import java.time.LocalDate;

public class Kunde /* extends Object */ {

    // Alle Instanz und Klassenvariablen, die bei der Erzeugung des Objekts keine Werte bekommen
    // erhalten Standardwerte

    private int kundenNr; // Standardwert: 0
    private String vorname; // Standardwert: null
    private String nachname; // Standardwert: null
    private LocalDate geburtsdatum; // Standardwert: null
    private boolean aktiv; // Standardwert: false

    // Konstruktoren befüllen das Objekt bei der Instanzierung/Erzeugung mit Startwerten

    public Kunde() {
    }

    // Deklaration des Konstruktors
    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Kunde(String vorname, String nachname, LocalDate geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public Kunde(int kundenNr, String vorname, String nachname, LocalDate geburtsdatum, boolean aktiv) {
        this.kundenNr = kundenNr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.aktiv = aktiv;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        if(vorname != null && vorname.length() > 0)
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

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    // Eigenschaft name gibt es nicht
    // Ein Getter dafür simuliert sie
    public String getName() {
        return vorname + " " + nachname;
    }

    @Override // Eine geerbte Methode aus der Elternklasse wird durch eine eigene Version ersetzt
    public String toString() {
        return kundenNr + ": " + vorname + " " + nachname + ", " + geburtsdatum + ", " + (aktiv ? "aktiv" : "nicht aktiv");
    }
}
