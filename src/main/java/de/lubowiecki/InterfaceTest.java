package de.lubowiecki;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {

        //InterfaceA ia = new InterfaceA(); // Error - Interface ist nicht instanzierbar
        KlassA ka = new KlassA();
        InterfaceA ia = new KlassA();

        ka.machWas(); // Überschriebene/Implementierte abstrakte Methode
        ka.machWasAnderes(); // geerbte default Methode
        //ka.machWasGanzAnderes(); // statische Methode wird NICHT vererbt
        InterfaceA.machWasGanzAnderes(); // muss direkt über das Interface aufgerufen werden

        System.out.println();

        // Interfaces sind dazu da Kompatibilität zwischen komplexen Datentypen zu ermöglichen

        //KlassA ka2 = new KlassB(); // Error
        InterfaceA ia2 = new KlassB(); // OK
        ia2.machWas();
        ia2 = new KlassA(); // OK
        ia2.machWas();

        List<Object> list1 = new ArrayList<>();
        list1.add(new KlassA());
        list1.add(new KlassB());
        list1.add(new String("Hallo"));

        for(Object o : list1) {
            //System.out.println(o.machWas()); // Error: Object hat keine machWas-Methode
        }

        System.out.println();

        List<InterfaceA> list2 = new ArrayList<>();
        list2.add(new KlassA());
        list2.add(new KlassB());
        //list2.add(new String("Hallo")); // Error: String implementier NICHT das InterfaceA

        for(InterfaceA i : list2) {
            i.machWas();
        }
    }
}

interface InterfaceA {

    // Alle Methoden sind public
    // Alle Eigenschaften sind public static final (per default)

    // Ein Interface kann statische Methoden enthalten
    // Ein Interface kann abstrakte Methoden enthalten
    // Ein Interface kann default Methoden enthalten (seit Java 8)

    // Ein Interface kann nicht instanziert werden!!!!!!

    int zahl = 10; // Muss sofort einen Wert bekommen! Werden an Kindklassen vererbt

    void machWas(); // Abstakte Methode. Kindklasse muss die Methode einbauen/überschreiben

    default void machWas(int zahl) {
        //...
    }

    default void machWasAnderes() { // default Methode. Kindklasse kann, muss aber nicht überschreiben
        System.out.println("DEFAULT");
    }

    static void machWasGanzAnderes() { // statische Methode
        System.out.println("STATIC");
    }
}

class KlassA implements InterfaceA { // KlassA sichert zu, dass Anforderungen aus dem Interface erfüllt werden
    @Override
    public void machWas() {
        System.out.println("Instanzmethode in KlassA ****");
    }
}

class KlassB implements InterfaceA {
    @Override
    public void machWas() {
        System.out.println("Instanzmethode in KlassB ####");
    }

    @Override
    public void machWas(int zahl) {
        //...
    }
}
