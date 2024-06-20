package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class HasATest {

    public static void main(String[] args) {

        List<Kunde> kunden = new ArrayList<>();
        kunden.add(new PremiumKunde("Peter", "Parker"));
        kunden.add(new PremiumKunde("Carol", "Danvers"));
        kunden.add(new FreemiumKunde("Bruce", "Banner"));

        for(Kunde k : kunden) {
            k.stream();
        }
    }
}
