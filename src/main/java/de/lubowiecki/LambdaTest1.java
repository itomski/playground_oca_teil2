package de.lubowiecki;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest1 {

    public static void main(String[] args) {

        // (a, b) -> b.compareTo(a)

        String s = "Hallo";
        run(s);

        List<Integer> zahlen = new ArrayList<>();
        zahlen.addAll(List.of(1,7,9,22,19,-1,-22, 100,101));
        zahlen.removeIf(i -> i < 0 || i > 100);
        zahlen.removeIf(i -> {
            int a = 0;
            int b = 100;
            return i < a || i > b;
        });
        zahlen.removeIf(i -> true);
        System.out.println(zahlen);

        System.out.println();

        zahlen = new ArrayList<>();
        zahlen.addAll(List.of(1,7,9,22,19,-1,-22, 100,101));
        for (int i = 0; i < zahlen.size(); i++) {
            if(zahlen.get(i) < 0 || zahlen.get(i) > 100) {
                zahlen.remove(i);
            }
        }

        System.out.println(zahlen);

        zahlen = new ArrayList<>();
        zahlen.addAll(List.of(1,7,9,22,19,-1,-22, 100,101));
        for (int i : zahlen) {
            if(i < 0 || i > 100) {
                //zahlen.remove(Integer.valueOf(i)); // ConcurrentModificationException
            }
        }

        System.out.println();

        zahlen = new ArrayList<>();
        zahlen.addAll(List.of(1,7,9,22,19,-1,-22, 100,101));
        Iterator<Integer> itr = zahlen.iterator();

        while(itr.hasNext()) {
            int i = itr.next();
            if(i < 0 || i > 100) {
                itr.remove();
            }
        }

        System.out.println(zahlen);

        List<String> namen = new ArrayList<>();

        // boolean test(T t);
        Predicate<Integer> p = i -> true;
        p = i -> i < 100;
        p = (i) -> i < 100 && i > 0;

        // Jedes Lambda basiert auf einem Interface was beschreibt, was die Anforderungen an das Labda sind

        // Das FunctionInterface (Basis für einen Lambda-Ausdruck) braucht eine abstrakte Methode

    }

    public int vergleichen(LocalDate a, LocalDate b) {
        return b.compareTo(a);
    }

    public static void run(String obj) {
        System.out.println(obj.toUpperCase());
    }
}
