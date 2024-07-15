package de.lubowiecki.uebung.strom;

public class Steckdose {

    private Stecker stecker;

    public void einstecken(Stecker stecker) {
        this.stecker = stecker;
    }

    public void an() {
        if(stecker == null) {
            System.out.println("Kein Gerät angeschlossen.");
            return;
        }
        this.stecker.ausfuehren();
    }
}
