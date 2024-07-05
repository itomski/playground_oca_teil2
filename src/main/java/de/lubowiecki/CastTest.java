package de.lubowiecki;

import java.util.Arrays;

public class CastTest {

    // Wird ausgeführt sobald eine Klasse geladen wird
    static {
        //System.out.println(7 / 0); // ExceptionInInitializerError
    }

    // Wird ausgeführt wenn das Objekt instanziert wird (vor dem Konstruktor)
    {

    }

    public static void main(String[] args) {

        String s = "Hallo";
        String s2 = s;

        Object o = s;

        CharSequence cs = s;

        String s3 = (String)o;
        // Integer i1 = (Integer)o; // ClassCastException

        System.out.println("ABCd".compareTo("Cde"));
        System.out.println("Cde".compareTo("Abc"));


        int[]a1 = {2,-1,4,5,2};
        int[]a2 = {2,-1,4,5,3};

        System.out.println(a1[3] + a1[2+1]);

        System.out.print((a1 == a2)+ " "); // Zeigen beide Referenzen auf das gleiche Objekt?
        System.out.print(Arrays.equals(a1, a2)+ " "); // Typ, Größe und Inhalt wird verglichen
        //System.out.print(Arrays.deepEquals(a1, a2)+ " ");

        int i = Integer.parseInt("100xyz");

        final int a = 10; // Compiletimekonstante

        final int b;
        if(a1.length == 3) {
            b = 10; // Runtimekonstante
        }
        else {
            b = 20;
        }

        /*
        | A | B | A AND B | A OR B | A XOR B |
        --------------------------------------
        | 1 | 0 |    0    |    1   |    1    |
        | 0 | 1 |    0    |    1   |    1    |
        | 1 | 1 |    1    |    1   |    0    |
        | 0 | 0 |    0    |    0   |    0    |
        */
    }
}
