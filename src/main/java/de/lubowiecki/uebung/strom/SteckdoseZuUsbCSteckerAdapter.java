package de.lubowiecki.uebung.strom;

public class SteckdoseZuUsbCSteckerAdapter implements Stecker {

    // Adapter

    private UsbCStecker geraet;

    public SteckdoseZuUsbCSteckerAdapter(UsbCStecker geraet) {
        this.geraet = geraet;
    }

    @Override
    public void ausfuehren() {
       if(geraet != null)
           geraet.laden();
    }
}
