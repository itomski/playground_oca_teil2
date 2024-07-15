package de.lubowiecki.uebung.strom;

import java.util.ArrayList;
import java.util.List;

public class Multistecker implements Stecker {

    private List<Stecker> geraete = new ArrayList<>();

    public void add(Stecker stecker) {
        geraete.add(stecker);
    }


    @Override
    public void ausfuehren() {
        for(Stecker s : geraete) {
            s.ausfuehren();
        }
    }
}
