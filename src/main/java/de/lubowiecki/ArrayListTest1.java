package de.lubowiecki;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest1 {

    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<>(); // Standard Größe des internen Arrays = 10
        namen.add("Peter");
        System.out.println(namen.get(0));

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(123); // Element wird an die nächste freie Stelle gepackt
        System.out.println(zahlen.get(0) + 10);

        zahlen.add(0, 901); // Element wird an die gewünschte Stelle gepackt
        // zahlen.add(10, 810); // Error: Index muss vorhanden oder der nächste freie sein

        System.out.println("-------------");

        String[] arr = new String[0];

        ArrayList<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Carol");
        list.add("Natasha");

        //arr = list.toArray(arr); // Überträgt die Elemente der Liste in das Array
        // Wenn das Array nicht groß genug ist, wird ein neues, passendes erzeugt
        arr = list.toArray(arr); // Überträgt die Elemente der Liste in das Array
        // arr = list.toArray(); // Error: oArray() produziert ein Object[]
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(5);
        zahlen2.add(7);
        zahlen2.add(18);
        zahlen2.add(99);

        Integer[] zahlen3 = zahlen2.toArray(new Integer[0]); // Der Parameter wird hier nur zu Typermittlung verwendet


        List l1 = new ArrayList<Integer>();
        l1.add(3); // Autoboxing von int auf Integer und komplex widening von Integer auf Object
        l1.add("Hallo"); // komplex widening von String auf Object
        l1.add(new Buch("..."));
        //System.out.println(l1.get(0) + l1.get(1)); // + für Object geht nicht!

        // Enums werden von JVM instanziert
        Monat m = Monat.FEB;
        System.out.println(m); // String FEB
        System.out.println(m.ordinal()); // Position von FEB in der Aufzählung

    }
}


