package de.lubowiecki;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        machWas(arr[2]); // Ein int Wert aus dem Array als Parameter
        machWas(arr); // Gesamtes Array als Parameter

    }

    public static void machWas(int i) {
        System.out.println("INT: " + i);
    }

    public static void machWas(int[] i) {
        System.out.println("INT ARRAY: " + Arrays.toString(i));
    }


}
