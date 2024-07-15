package de.lubowiecki.uebung.strom;

public class SteckdoseZuUsbSteckerAdapter implements Stecker {

    // Adapter

    private UsbStecker geraet;

    public SteckdoseZuUsbSteckerAdapter(UsbStecker geraet) {
        this.geraet = geraet;
    }

    @Override
    public void ausfuehren() {
       if(geraet != null)
           geraet.laden();
    }
}
