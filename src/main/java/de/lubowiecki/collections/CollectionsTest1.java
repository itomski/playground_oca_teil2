package de.lubowiecki.collections;

import java.util.*;

public class CollectionsTest1 {

    public static void main(String[] args) {

        List<String> namen = List.of("Peter", "Carol", "Bruce", "Scott");

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        System.out.println();

        for (String s : namen) {
            System.out.println(s);
        }

        System.out.println();

        namen.forEach(s -> System.out.println(s));

        System.out.println();

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(100); // Methode von Collection
        zahlen.add(0, 200); // Überladene Methode einer List

        zahlen.addAll(Arrays.asList(200, 300, 400));
        // zahlen.addAll(List.of(200, 300, 400)); // List.of gibt es seit Java 1.9

        System.out.println();

        zahlen.retainAll(Arrays.asList(800, 900, 400));

        System.out.println(zahlen);


        // Listen
        // Arbeiten mit einem Index
        // Einfügereihenfolge
        // erlaubt Duplikate und null

        // ArrayList
        // Schneller wahlfreier Zugriff
        // Langsame Veränderungen mittendrin

        // LinkedList
        // Langsamer wahlfreier Zugriff
        // Schnelle Veränderungen mittendrin

        zahlen = new LinkedList<>(zahlen); // Wechsel von ArrayList auf LinkedList

        zahlen = new ArrayList<>(zahlen); // Wechsel von LinkedList auf ArrayList
    }
}
