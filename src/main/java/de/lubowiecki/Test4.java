package de.lubowiecki;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test4 {

    public static void main(String[] args) {

        /*
        double[] arr;
        arr = new double[]{10.5, 7.18};

        try {
            machWas();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        machWasAnderes();
        */

        int[] arr = {2,4,7,19};

        int i = 0;
        for (; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int j : arr) {
            System.out.println(j);
        }

        machWasGanzAnderes();

    }

    public static void machWas() throws IOException {
        System.out.println("Moin");
    }

    public static void machWasAnderes() throws NullPointerException {
        System.out.println("Moin");
    }

    public static void machWasGanzAnderes() {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }
        catch(RuntimeException e) {
            e.printStackTrace();
            e = new ArrayIndexOutOfBoundsException("Der Index passt nicht");
            throw e;
        }

        try {

        }
        catch(RuntimeException e) {
            // RuntimeException und ihre Kindklassen können IMMER gefangen werden
        }

        try {

        }
        catch(Exception e) {
            // CheckedException
        }

        /*
        try {

        }
        catch(IOException e) {
            // IOException muss im try auftauchen können!!!
        }
        */

        int x = 10;

        while(10 == x) {
            x--;
        }

        while((x = 10) <= 1) {
            x--;
        }

    }

    public static void doSomething() throws IOException {

        try {} catch (Exception e){}
        try {} finally {}

        try(Writer out = new FileWriter("...")) {}

        class LocalClass {

        }

    }

    class SubClass {

    }

}
