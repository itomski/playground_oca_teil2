package de.lubowiecki;

import java.util.Arrays;

public class ArraysTest2 {

    public static void main(String[] args) {

        int[][] arr = new int[2][];

        //arr[0] = new int[3]{1,2,3}; // oder
        arr[0] = new int[3];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;

        //arr[1] = new int[3]{0,10,20}; // oder
        arr[1] = new int[3];
        arr[1][0] = 0;
        arr[1][1] = 10;
        arr[1][2] = 20;

        System.out.println(Arrays.toString(arr));


        int array[ ] = {2,5,9,5,0,3}; // {0,2,3,5,5,9}
        //Arrays.sort(array); // Sortiert alle Zahlen des Arrays

        // endIndex ist in Java IMMER exclusive (toIndex darf maximal == length sein)
        Arrays.sort(array,2,6); // {2,5,9,5,0,3}
        System.out.print(array[2] + array[5]);

        //int[] arr2 = new int[Integer.MAX_VALUE];

        long l = 10;
        //int[] arr2 = new int[l]; // Compiler-Error: Array-Size MUSS int sein
        //System.out.println(arr2[l]); // Compiler-Error: Index-Position MUSS int sein

        // byte und short promovieren zum Rechnen mind. zum int
        byte b1 = 5;
        byte b2 = 10;
        //byte sum = b1 + b2; // sum muss ein int sein

        int i1 = 20;
        int l1 = 30;

        long sum = b1 + i1 + l1; // sum muss mind. long sein
        long erg = b1 + i1 * l1; // sum muss mind. long sein

        // Lokale Variablen bekommen keine Standardwerte
        int j; // Deklaration. Ohne Initialisierung entfernt der Kompiler sie aus dem Kompilat
        //System.out.println(j); // Error: Vor der Verwendung muss eine lokale Variable initialisiert sein
    }
}
