package de.lubowiecki.testen;

import java.util.ArrayList;
import java.util.List;

public class FahrzeugMangement {

    private List<Fahrzeug> fahrzeuge = new ArrayList<>();

    public List<Fahrzeug> getFahrzeuge() {
        return fahrzeuge;
    }

    public void addFahrzeuge(Fahrzeug fahrzeug) {
        if(fahrzeug == null) throw new IllegalArgumentException();
        this.fahrzeuge.add(fahrzeug);
    }
}
