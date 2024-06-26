package de.lubowiecki;

public class MultiArraysTest {

    public static void main(String[] args) {

        double[][] arr1 = {
                            {1.0, 2.0, 3.5},
                            {7.8, 2.9, 22.1},
                            {17.99, 18.20, 33.0}
                          };

        arr1 = new double[3][3];

        arr1 = new double[][] {
                                {1.0, 2.0},
                                {7.8, 2.9, 22.1},
                                {17.99}
                            };

        arr1 = new double[3][];
        arr1[0] = new double[]{1.0, 2.0};
        arr1[1] = new double[]{7.8, 2.09, 22.1};
        arr1[2] = new double[]{17.99};

        System.out.println(arr1[1][1]);
        arr1[1][1] = 10.8;

        Object o = new int[]{7,8,99,15};
        System.out.println(((int[])o)[3]);
        System.out.println(((byte[])o)[3]); // ClassCastException: Das Objekt auf dem Heap hat einen anderen Typ

        //double[] arr2 = new int[]{7,8,9}; // int-Array kann nicht automatisch zu double-Array erweitert werden

    }
}
