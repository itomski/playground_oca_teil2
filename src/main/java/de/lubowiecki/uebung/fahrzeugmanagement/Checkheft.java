package de.lubowiecki.uebung.fahrzeugmanagement;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Checkheft implements Serializable {

    private Map<LocalDate, List<String>> eintraege = new TreeMap<>();

    public Map<LocalDate, List<String>> getEintraege() {
        return eintraege;
    }

    public void addEintraeg(String eintrag) {
        addEintraeg(eintrag, LocalDate.now());
    }

    public void addEintraeg(String eintrag, LocalDate datum) {
        if(!eintraege.containsKey(datum)) {
            List<String> liste = new ArrayList<>();
            eintraege.put(datum, liste);
        }
        eintraege.get(datum).add(eintrag);
    }

    public void print() {
        for(Map.Entry<LocalDate, List<String>> eintrag : eintraege.entrySet()) {
            System.out.println(eintrag.getKey() + ": ");
            for(String job : eintrag.getValue())
                System.out.println(job);

            System.out.println();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checkheft{");
        sb.append("eintraege=").append(eintraege);
        sb.append('}');
        return sb.toString();
    }
}
