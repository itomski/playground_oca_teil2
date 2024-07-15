package de.lubowiecki;

import java.util.function.Predicate;

public class AnonymeKlassen {

    public static void main(String[] args) {

        //Machbar m1 = new Machbar();


        Machbar m1 = new Machbar() { // Eine Klasse ohne Namen die Machbar inplementiert wird sofort instanziert

            @Override
            public void machEs() {
                System.out.println("machEs");
            }

            @Override
            public void machWasAnderes() {
                System.out.println("machWasAnderes");
            }
        };

        m1.machEs();


        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.toLowerCase().equals("hallo");
            }
        };

        Predicate<String> p2 = s -> s.toLowerCase().equals("hallo");

    }
}

interface Machbar {

    void machEs();
    void machWasAnderes();

    default void machWasGanzAnderes() {
        System.out.println("machWasGanzAnderes");
    }

}
