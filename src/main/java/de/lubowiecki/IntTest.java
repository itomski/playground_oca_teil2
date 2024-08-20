package de.lubowiecki;

import java.util.Arrays;

public class IntTest {

    public static void main(String[] args) {

        byte b1, b2, b3;
        int i1 = 100, i2 = i1, i3 = 120;
        //System.out.println(i2);

        int x1;
        int x2;
        int x3 = x2 = x1 = 5;

        long l1, l2[]; // long, long-Array
        long[] l3, l4; // beides long-Array
        long[] l5, l6[]; // long-Array, 2d long-Array

        int[] arr = {2,6,4,5,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, -1));

        int[] j = new int[10]; // 10 ist die Größe
        //System.out.println(j[10]); // index geht von 0 bis 9

        String s = "Moin Moin";
        s = null;
        System.out.println(s.toLowerCase());

        final int k = 10; // Compiletime-Konstante

        final int l;
        l = 20; // Runtime-Konstante

        /*
        if(k < 100) {

        }
        else if(k < 50) {

        }
        */
    }
}
