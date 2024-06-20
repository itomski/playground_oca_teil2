package de.lubowiecki;

public class Rad {

    private double groeße;
    private String marke;

    public Rad(double groeße, String marke) {
        this.groeße = groeße;
        this.marke = marke;
    }

    public double getGroeße() {
        return groeße;
    }

    public void setGroeße(double groeße) {
        this.groeße = groeße;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
