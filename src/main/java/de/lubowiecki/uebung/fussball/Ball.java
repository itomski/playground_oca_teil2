package de.lubowiecki.uebung.fussball;

public class Ball {

    private Spieler spieler;

    public Spieler getSpieler() {
        return spieler;
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("spieler=").append(spieler);
        sb.append('}');
        return sb.toString();
    }
}
