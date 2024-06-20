package de.lubowiecki;

public class Fahrzeug /* extends Object */ {

    // Is-A: Wird durch Vererbung realisiert
    // Has-A: Wird durch Referenz-Eigenschaften realisiert

    private String kennzeichen;
    private int baujahr;

    // OneToOne
    private Motor motor; // Objektbeziehung

    // OneToMany
    private Rad[] raeder = new Rad[4]; // Objektbeziehung

    public Fahrzeug(String kennzeichen, int baujahr, Motor motor) {
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
        this.motor = motor;
    }


    public void addRad(Rad rad, int pos) {
        if(pos >= 0 && pos < raeder.length) {
            raeder[pos] = rad;
        }
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
