package de.lubowiecki;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {

    public static void main(String[] args) {

        // T get();
        Supplier<Integer> w6 = () -> (int)(Math.random() * 6) + 1;
        Supplier<Integer> w10 = () -> (int)(Math.random() * 10) + 1;
        Supplier<Integer> w20 = () -> (int)(Math.random() * 20) + 1;

        /*
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w10.get());
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w20.get());
        */

        Stream.generate(w6)
                .forEach(z -> System.out.println(z));


        Dice ww6 = () -> (int)(Math.random() * 6) + 1;
        Dice ww10 = () -> (int)(Math.random() * 10) + 1;
        Dice ww20 = () -> (int)(Math.random() * 20) + 1;

        System.out.println(ww6.roll());

    }
}

interface Dice {
    int roll();
}
