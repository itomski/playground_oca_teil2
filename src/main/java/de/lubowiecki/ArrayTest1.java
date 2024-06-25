package de.lubowiecki;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] arr1 = {2,7,8,9,22,17}; // Nur bei gleichzeitiger Dekalartion und Initialisierung möglich
        //arr1 = {1,8,7}; // Error! Variable ist bereits deklariert
        arr1 = new int[]{1,8,7}; // Ok!
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr2));

        double[] arr3 = new double[8];
        System.out.println(Arrays.toString(arr3));

        boolean[] arr4 = new boolean[8];
        System.out.println(Arrays.toString(arr4));

        String[] arr5 = new String[8];
        System.out.println(Arrays.toString(arr5));

        Integer[] arr6 = new Integer[8];
        System.out.println(Arrays.toString(arr6));

        // System.out.println(arr4[10]); // ArrayIndexOutOfBoundsException
        // System.out.println(arr4[-10]); // ArrayIndexOutOfBoundsException
        arr3[5] = 10.5;
        // arr3[10] = 17.5; // ArrayIndexOutOfBoundsException

        // Die Referenz wird auf ein Array mit 100 Elementen gesetzt
        // Das alte Array hinter arr3 steht für GS zur Verfügung
        arr3 = new double[5];

        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        System.out.println();

        for (double d : arr3) {
            System.out.println(d);
        }

        // arr3 = new double[-5]; // NegativeArraySizeException

        // ArrayIndexOutOfBoundsException: Es wird auf eine Position zugegriffen, die es nicht gibt
        // NegativeArraySizeException: Array wird mit einer negativen Größe erzeugt

        printValues(5,7,8);

        int[] arr = {5,7,8,9};
        printValues(arr);
        printValues(new int[]{5,7,8,9});
        printValues(new int[]{});  // Array wird auch benötigt, wenn 0 Elementen übergeben werden

        System.out.println();
        printValues2(new int[]{5,7,8,9}); // Kann ein Array entgegennehmen
        printValues2(); // Kann leer aufgerufen werden
        printValues2(7,9); // Kann Einzelwerte (0...n) entgegennehmen
        printValues2(7,9,22,18,99,7,6,1,2,5,44);

        System.out.println();

        int[] randoms = generateRandoms(10);
        printValues2(randoms);


    }

    // benötigt eine feste Anzahl an Werten (3)
    public static void printValues(int a, int b, int c) { // Methodenparameter sind Pflichtparameter
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    // kann eine variable Anzahl an Werten bekommen
    // Ein Array MUSS übergeben werden. Anzahl der Werte im Array ist aber variable
    public static void printValues(int[] werte) {
        for (int i : werte) {
            System.out.println(i);
        }
    }

    public static void printValues2(int... werte) {
        for (int i : werte) {
            System.out.println(i);
        }
    }

    /*
    // Varags immer ans Ende der Parameterliste
    public static void printValues2(int x, int... werte) { // x ist Pflichtparameter
        for (int i : werte) {
            System.out.println(i);
        }
    }
    */

    // Eine Methode kann mehrere Werte gleichen Typs als Array zurückgeben
    public static int[] generateRandoms(int anzahl) {
        Random rand = new Random();
        int i = 0;
        int[] randoms = new int[anzahl];
        while(i < anzahl) {
            randoms[i] = rand.nextInt(100) + 1;
            i++;
        }
        return randoms;
    }
}
