package de.lubowiecki.testen;

public class Fahrzeug {

    private String kennzeichen;

    private int baujahr;

    public Fahrzeug(String kennzeichen, int baujahr) {
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
}
