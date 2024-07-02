package de.lubowiecki;

import java.util.Arrays;
import java.util.List;

public class ArraysTest3 {

    public static void main(String[] args) {

        int[] arr = {1,7,99,18,22,19,100,7,15,-5,22,-65};

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //Arrays.fill(arr, 10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // [-65, -5, 1, 7, 7, 15, 18, 19, 22, 22, 99, 100]
        // Voraussetzung für binarySearch ist die Sortierung der Elemente
        int pos = Arrays.binarySearch(arr, 18);
        System.out.println(pos);

        // negative pos zeigt, dass ein Wert nicht gefunden wurde
        pos = Arrays.binarySearch(arr, 21); // würde normalerweise auf pos 8 stehen
        System.out.println(pos); // wenn nicht gefunden dann negativ pos -1

        List<String> namen1 = Arrays.asList("Peter", "Carol", "Bruce", "Steve"); // Java 8
        List<String> namen2 = List.of("Peter", "Carol", "Bruce", "Steve"); // Ab Java 9

        System.out.println(arr.length);
        arr = Arrays.copyOf(arr, arr.length * 2 + 2);
        System.out.println(Arrays.toString(arr));

    }
}
