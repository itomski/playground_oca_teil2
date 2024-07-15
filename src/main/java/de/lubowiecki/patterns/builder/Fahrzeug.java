package de.lubowiecki.patterns.builder;

public class Fahrzeug {

    private String kennzeichen;
    private final String marke;
    private final String typ;
    private final Antrieb antrieb;
    private final Getriebe getriebe;
    private final int baujahr;

    public Fahrzeug(String marke, String typ, Antrieb antrieb, Getriebe getriebe, int baujahr) {
        this.marke = marke;
        this.typ = typ;
        this.antrieb = antrieb;
        this.getriebe = getriebe;
        this.baujahr = baujahr;
    }

    public Fahrzeug(String kennzeichen, String marke, String typ, Antrieb antrieb, Getriebe getriebe, int baujahr) {
        this(marke, typ, antrieb, getriebe, baujahr);
        this.kennzeichen = kennzeichen;
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

    public String getTyp() {
        return typ;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public Getriebe getGetriebe() {
        return getriebe;
    }

    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", antrieb=").append(antrieb);
        sb.append(", getriebe=").append(getriebe);
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}
