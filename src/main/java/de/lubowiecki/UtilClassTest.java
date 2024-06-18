package de.lubowiecki;

public class UtilClassTest {

    public static void main(String[] args) {


        // Statische Methode wird direkt auf der Klasse ausgeführt und verarbeitet die Parameter
        double erg = MathUtils.add(10.0, 20.0);
        System.out.println(erg);


        /*
        MathUtils utils = new MathUtils(); // Macht keinen Sinn, da die Klasse eine Instanzeigenschaften hat
        double erg2= utils.add(10.0, 20.0);
        System.out.println(erg2);
        */
    }
}
