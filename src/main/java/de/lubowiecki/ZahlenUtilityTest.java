package de.lubowiecki;

import static de.lubowiecki.ZahlenUtility.*;

public class ZahlenUtilityTest {

    public static void main(String[] args) {

        // Statische Methoden sollten auf der Klasse ausgeführt werden NICHT auf einem Objekt
        System.out.println(ZahlenUtility.hex(100));
        System.out.println(ZahlenUtility.oct(100));
        System.out.println(ZahlenUtility.bin(100));

        int zahl = 200;
        System.out.println(ZahlenUtility.bin(zahl));
        System.out.println(bin(zahl));

        //ZahlenUtility zu = new ZahlenUtility(); // Objekt kann nicht erzeugt werden, da Konstruktor privat

    }
}
