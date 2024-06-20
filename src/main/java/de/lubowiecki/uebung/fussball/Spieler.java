package de.lubowiecki.uebung.fussball;

public class Spieler {

    private String vorname;
    private String nachname;
    private int nr;

    private Ball ball;

    public void ballAnnehmen(Ball ball) {
        ball.setSpieler(this); // Spieler dem Ball zuweisen
        this.ball = ball; // Ball den Spieler zuweisen
    }

    public void ballPassen(Spieler spieler) {
        if(ball == null) { // Wenn Spieler keinen Ball hat
            System.out.println(vorname + " " + nachname + ": ich habe keinen Ball.");
        }
        else {
            if(spieler == null) { // Wenn der Pass ins leere geht
                ball.setSpieler(null);
            }
            else {
                spieler.ballAnnehmen(ball); // Den Ball an einen anderen Spieler abgeben
            }
            ball = null; // den aktuellen Spieler den Ball wegnehmen
        }
    }

    public boolean hatBall() {
        return ball != null;
    }

    public Spieler(String vorname, String nachname, int nr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nr = nr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spieler{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", nr=").append(nr);
        sb.append('}');
        return sb.toString();
    }
}
