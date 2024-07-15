package de.lubowiecki.uebung.strom;

public class Test {

    public static void main(String[] args) {

        // Composite

        Computer c = new Computer();
        Ventilator v = new Ventilator();

        Multistecker ms = new Multistecker();
        ms.add(c);
        ms.add(v);

        Steckdose sd = new Steckdose();
        sd.einstecken(ms);
        sd.an();
    }

}
