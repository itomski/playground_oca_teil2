package de.lubowiecki;

import java.util.ArrayList;

public class SwitchTest2 {

    public static void main(String[] args) {

        char c = 'B';

        final char x = 'C'; // Compiletime-Konstante

        final char y;
        y = 'C'; // Runtime-konstante

        switch(c) {
            case 'A':
                System.out.println("AAAAAA");

            case 'B':
            case x:
                System.out.println("BBBB");
                break;

            default:
                System.out.println("DDDDDD");
                break;
        }

        // Seit Java 14
        switch(c) {
            case 'A':
                System.out.println("AAAAAA");


            case 'B', 'C':
                System.out.println("BBBB");
                break;

            default:
                System.out.println("DDDDDD");
                break;
        }

        // Bei -> wird auf beark verzichtet
        switch(c) {
            case 'A' -> System.out.println("AAAAAA");

            case 'B', 'C' -> System.out.println("BBBB");

            default -> System.out.println("DDDDDD");
        }

        // switch mit Rückgabe
        String output = switch(c) {
            case 'A' -> "AAAAAA";

            case 'B', 'C' -> "BBBBBB";

            case 'D' -> {
                String z = "DDD";
                yield z.concat("DDD"); // gleichbedeutend return
            }

            default -> "#######";
        };

        System.out.println(output);

        // Seit Java 10
        // var i = 100; // automatisch ein int
        // var j = 100.0; // automatisch ein double

        var list = new ArrayList<>();
        // ArrayList<Object> list = new ArrayList<>();
        // List<String> list = new ArrayList<>();


    }
}
