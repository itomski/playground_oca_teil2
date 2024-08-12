package de.lubowiecki.collections;

public class VerlinkteListeTest {

    public static void main(String[] args) {


        StringContainer e1 = new StringContainer("Peter");
        e1.setNachfolger(new StringContainer("Bruce"));

        e1.getNachfolger().setNachfolger(new StringContainer("Carol"));

        System.out.println(e1);
        System.out.println(e1.getNachfolger());
        System.out.println(e1.getNachfolger().getNachfolger());

        System.out.println();

        StringContainer e2 = e1.getNachfolger().getNachfolger();

        System.out.println(e2);
        System.out.println(e2.getVergaenger());
        System.out.println(e2.getVergaenger().getVergaenger());


    }
}

class StringContainer {

    private String wert;
    private StringContainer vergaenger;
    private StringContainer nachfolger;


    public StringContainer(String wert) {
        this.wert = wert;
    }

    public String getWert() {
        return wert;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }

    public StringContainer getVergaenger() {
        return vergaenger;
    }

    public void setVergaenger(StringContainer vergaenger) {
        this.vergaenger = vergaenger;
    }

    public StringContainer getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(StringContainer nachfolger) {
        this.nachfolger = nachfolger;
        nachfolger.setVergaenger(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StringContainer{");
        sb.append("wert='").append(wert).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
