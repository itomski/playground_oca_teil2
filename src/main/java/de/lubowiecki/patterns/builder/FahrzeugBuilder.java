package de.lubowiecki.patterns.builder;

public class FahrzeugBuilder {

    private String kennzeichen;
    private String marke;
    private String typ;
    private Antrieb antrieb;
    private Getriebe getriebe;
    private int baujahr;

    public String getKennzeichen() {
        return kennzeichen;
    }

    public FahrzeugBuilder setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public String getMarke() {
        return marke;
    }

    public FahrzeugBuilder setMarke(String marke) {
        this.marke = marke;
        return this;
    }

    public String getTyp() {
        return typ;
    }

    public FahrzeugBuilder setTyp(String typ) {
        this.typ = typ;
        return this;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public FahrzeugBuilder setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
        return this;
    }

    public Getriebe getGetriebe() {
        return getriebe;
    }

    public FahrzeugBuilder setGetriebe(Getriebe getriebe) {
        this.getriebe = getriebe;
        return this;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public FahrzeugBuilder setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public Fahrzeug build() {
        return new Fahrzeug(kennzeichen, marke, typ, antrieb, getriebe, baujahr);
    }
}
