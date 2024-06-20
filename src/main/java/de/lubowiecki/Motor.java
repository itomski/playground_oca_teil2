package de.lubowiecki;

public class Motor {

    private String antriebsArt;

    private int leistung;

    public Motor(String antriebsArt, int leistung) {
        this.antriebsArt = antriebsArt;
        this.leistung = leistung;
    }

    public String getAntriebsArt() {
        return antriebsArt;
    }

    public void setAntriebsArt(String antriebsArt) {
        this.antriebsArt = antriebsArt;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
}
