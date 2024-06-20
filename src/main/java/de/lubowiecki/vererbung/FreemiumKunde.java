package de.lubowiecki.vererbung;

public class FreemiumKunde extends Kunde {

    public FreemiumKunde(String vorname, String nachname) {
        super(vorname, nachname);
    }

    @Override
    public void stream() {
        System.out.println(getVorname() + " " + getNachname() + ": Nur die Öffentlich-Rechtlichen...");
    }
}
