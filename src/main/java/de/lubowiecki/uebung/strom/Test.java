package de.lubowiecki.uebung.strom;

public class Test {

    public static void main(String[] args) {

        // Composite

        Computer c = new Computer();
        Ventilator v = new Ventilator();
        SmartPhone sp = new SmartPhone();

        Multistecker ms = new Multistecker();
        ms.add(c);
        ms.add(v);
        //ms.add(sp); // Geht nicht ohne Adapter
        ms.add(new SteckdoseZuUsbSteckerAdapter(sp));

        Steckdose sd = new Steckdose();
        sd.einstecken(ms);
        sd.an();
    }

}
