package de.lubowiecki.uebung;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class U14Lamdas {

    // Schreibe 3 Functional interfaces
    // 1. Für eine Mathematische Operation nimmt 2 double Parameter entgegen und gibt einen double zurück
    // 2. Für eine String-Manipulation: nimmt 1 String Parameter entgegen und gibt den geänderten String zurück
    // 3. Für eine Meldung: nimmt 1 String Parameter entgegen (die Meldung) und gibt diese
    // mit aktuellem Datum und Uhrzeit aus

    // Teste jedes der Interfaces mit 3 unterschiedlichen Lambdas
    // Beim 3. Interface verwende unterschiedliche Formate für die Ausgabe

    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation modulo = (a, b) -> a % b;
        MathOperation pow = (a, b) -> Math.pow(a, b);

        System.out.println(add.execute(10, 15));
        System.out.println(modulo.execute(10, 15));
        System.out.println(pow.execute(10, 15));

        StringManipulation upper = s -> s.toUpperCase();
        StringManipulation lower = s -> s.toLowerCase();
        StringManipulation clean = s -> s.trim().replace("Dreck", "####");

        System.out.println(upper.change("Hallo"));
        System.out.println(lower.change("Hallo"));
        System.out.println(clean.change("    So ein Dreck!   "));

        Printer p1 = s -> System.out.println(LocalDate.now().format(CustomDateTimeFormatter.DATE_DE_FMT) + ": " + s);

        Printer p2 = s -> System.out.println(LocalDate.now()
                .format(CustomDateTimeFormatter.DATE_EN_FMT) + ": " + s);

        Printer p3 = s -> {
            String date = LocalDateTime.now().format(CustomDateTimeFormatter.DATE_TIME_DE_FMT);
            System.out.println(date + ": " + s);
        };

        String str = "Das ist " +
                "das Haus von " +
                "Nikigr" +
                "aus";

        p1.print("Das ist die Lösung!");
        p2.print("Das ist die Lösung!");
        p3.print("Das ist die Lösung!");


        Predicate p = (x) -> x.equals(null);
        p.test(new Object());

        Predicate<String> ps = (x) -> x.toLowerCase().equals("moin");
        ps.test("hallo welt");

    }
}

@FunctionalInterface
interface MathOperation {
    double execute(double a, double b);
}

@FunctionalInterface
interface StringManipulation {
    String change(String input);
}

@FunctionalInterface
interface Printer {
    void print(String input);
}

interface CustomDateTimeFormatter {

    DateTimeFormatter DATE_DE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter DATE_EN_FMT = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    DateTimeFormatter DATE_TIME_DE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

}


