package de.lubowiecki.generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        // List<String> namen = new ArrayList<String>();
        List<String> namen = new ArrayList<>(); // Ab Java 1.7 möglich

        // Ohne Angabe, ist der generische Typ automatisch Object
        // RAW-Typ ist Object
        List elements = new ArrayList(); // Unsichere Verwendung
        elements.add("Moin");
        elements.add(123);

        Object o1 = elements.get(1);
        String s1 = (String)o1;
        System.out.println(s1.toUpperCase());

        Object o2 = "Moin"; // Upcasting (atomatisch)
        o2 = 123;


        // RAW-Typ ist Object
        List elements2 = new ArrayList<String>();

        // Wird ein generischer Typ eingegeben, dann muss er auf beiden Seiten gleich sein
        // List<String> elements3 = new ArrayList<Object>();

    }
}
