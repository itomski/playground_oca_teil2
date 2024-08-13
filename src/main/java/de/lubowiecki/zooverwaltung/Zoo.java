package de.lubowiecki.zooverwaltung;

public class Zoo {

    private Visitor[] visitorArr = new Visitor[500];

    private int nr;

    public void addVisitor(Visitor besucher) {
        visitorArr[nr++] = besucher;
    }

    public double computeTurnover() {

        double umsatz = 0.0;

        for(Visitor v : visitorArr) {

            if(v == null) continue;
            umsatz += v.getPrice();
        }

        return umsatz;
    }

    public int visitorCount() {

        int count = 0;

        for(Visitor v : visitorArr) {

            if(v == null) continue;
            count += v.getNumber();
        }

        return count;
    }
}
