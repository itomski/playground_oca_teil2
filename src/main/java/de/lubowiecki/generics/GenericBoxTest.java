package de.lubowiecki.generics;

import de.lubowiecki.db.User;

import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.time.LocalDate;

public class GenericBoxTest {

    public static void main(String[] args) {

        GenericBox<String> box1 = new GenericBox<>();
        box1.setContent("Papier");
        //box1.setContent((String)"Papier");
        //box1.setContent((String)123);
        System.out.println(box1.getContent().toUpperCase());

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.setContent(123);
        System.out.println(box2.getContent().doubleValue());

        GenericBox<User> benutzer = new GenericBox<>();

        // Generische Typen sind IMMER komplex (immer Objekte)

        Function<String, LocalDate> strToLocalDate = s -> LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate ld = strToLocalDate.apply("15.02.2022");
    }
}
