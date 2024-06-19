package de.lubowiecki.uebung;

import java.time.LocalDate;

public class Medium {

    private String titel = "Unbekannt";
    private String beschreibung;

    private int erscheinungsJahr;

    private double preis;

    // Konstruktor nimmt Parameter entgegen und befüllt das Objekt bei der Erzeugung damit
    public Medium(String titel, String beschreibung, int erscheinungsJahr, double preis) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.erscheinungsJahr = erscheinungsJahr;
        this.preis = preis;
    }

    public Medium(String titel) {
        this.titel = titel;
    }

    public /* Rückgabewert */ String getTitel() { // lesen
        return titel; // Instanzeigenschaft wird an den Aufrufer der Methode zurückgegeben
    }

    public void setTitel(String parameter /* Eingangsparameter */) { // schreiben
        // this.title = Instanzeigenschaft
        // title = Eingangsparameter
        // this = aktuelles Objekt = Objekt auf dem gerade die Methode ausgeführt wird
        this.titel = parameter; // Schreibt den Eigangsparameter in die Instanzeigenschaft
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void ausgeben1() {
        System.out.println(titel + ", " + beschreibung + ", " + erscheinungsJahr + ", " + preis + " €");
    }

    public String ausgeben2() {
        return titel + ", " + beschreibung + ", " + erscheinungsJahr + ", " + preis + " €";
    }
}
