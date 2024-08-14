package de.lubowiecki.uebung.fahrzeugmanagement;

import java.io.Serializable;

public class Fahrzeug implements Serializable {

    private String kennzeichen;
    private String marke;
    private String farbe;
    private int baujahr;

    private final Checkheft checkheft;

    public Fahrzeug() {
        checkheft = new Checkheft();
    }

    public Fahrzeug(String kennzeichen, String marke, String farbe, int baujahr) {
        this();
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public Checkheft getCheckheft() {
        return checkheft;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", farbe='").append(farbe).append('\'');
        sb.append(", baujahr='").append(baujahr).append('\'');
        sb.append(", checkheft=").append(checkheft);
        sb.append('}');
        return sb.toString();
    }
}
