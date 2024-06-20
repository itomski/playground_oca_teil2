package de.lubowiecki.vererbung;

public class PremiumKunde extends Kunde {

    public PremiumKunde(String vorname, String nachname) {
        super(vorname, nachname);
    }

    @Override
    public void stream() {
        System.out.println(getVorname() + " " + getNachname() + ": Netflix, WOW, AppleTv, etc.");
    }
}
