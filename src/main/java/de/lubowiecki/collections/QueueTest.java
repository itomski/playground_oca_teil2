package de.lubowiecki.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> namen = new LinkedList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Walter");
        namen.add("Bob");

        System.out.println(namen);

        for(String n : namen) {
            System.out.println(n); // Element wird NICHT entfernt
        }

        System.out.println();

        while(namen.size() > 0) {
            System.out.println(namen.poll()); // Element wird entfernt
        }

        System.out.println(namen);
    }
}
