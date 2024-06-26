package de.lubowiecki;

public class StackTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        ZahlenContainer obj = new ZahlenContainer(15);
        int c = machWas();

        int[] arr1 = new int[1_000_000]; // Speicherbedarf = 1_000_000 * 32 bit bis zum Ende von main

        {
            int[] arr2 = new int[1_000_000]; // Speicherbedarf = 1_000_000 * 32 bit bis zum Ende des Blocks
            System.out.println(arr2[10]);
        } // Block wird beendet = arr2 wird entfernt

        System.out.println(arr1[10]);
        //System.out.println(arr2[10]); // Error: arr2 hier out-of-scope

        int x = 100;
    }

    public static int machWas() {
        int a = 30;
        int b = 40;
        ZahlenContainer obj = new ZahlenContainer(22);
        int c = machWasAnderes();
        return 80;
    }

    public static int machWasAnderes() {
        int a = 50;
        int b = 60;
        ZahlenContainer obj = new ZahlenContainer(150);
        obj.getZahl();
        obj.getZahl();
        obj.getZahl();
        obj.getZahl();
        return 70;
    }
}