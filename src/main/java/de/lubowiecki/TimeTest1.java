package de.lubowiecki;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeTest1 {

    public static void main(String[] args) {

        Period week = Period.ofWeeks(1);
        LocalDate heute = LocalDate.now();
        LocalDate wm = LocalDate.of(2026, 6, 11);
        System.out.println(heute.plus(week));
        System.out.println(heute.minus(week));

        Period abstand = Period.between(heute, wm);
        System.out.println(abstand);

        String s = "Moin";
        s = s.toUpperCase();
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Whizlab");
        /*
        char[]ch = new char[4];
        System.out.println(Arrays.toString(ch));
        sb.getChars(1, 5, ch, 1);
        System.out.println(Arrays.toString(ch));
        */
        sb.insert(1, 100l);
        String s2 = null;
        sb.insert(10, s2);
        System.out.println(sb);

        String s3 = new String();
        System.out.println(s3);

        System.out.println(String.join("...", "Peter", "Carol", "Bruce"));

        Stream<String> stream = Stream.of("A", "B", "C", "D");
        String str = stream.collect(Collectors.joining("-", "#", "@"));
        System.out.println(str);

        /*
        Object o = new Object();
        o.hashCode();
        */

        LocalDate ld = LocalDate.of(2015, -1, 29);

    }
}
