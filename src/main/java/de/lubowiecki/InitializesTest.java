package de.lubowiecki;

import java.time.LocalDate;

public class InitializesTest {

    public static void main(String[] args) {
        X1 x1 = new X2();
        X1 x2 = new X2();
        X1 x3 = new X2();
    }
}

class X1 {

    public int i;
    private static int count;

    static {
        System.out.println("SI: X1");
    }

    {
        System.out.println("II: X1");
    }

    public X1() {
        i = ++count;
        System.out.println("C: X1");
    }
}

class X2 extends X1 {

    static {
        System.out.println("SI:X2");
    }


    final LocalDate start;
    {
        System.out.println("II1: X2");
        if (LocalDate.now().isAfter(LocalDate.of(2024, 12, 1))) {
            start = null; //...
        } else {
            start = null; //...
        }
    }

    {
        System.out.println("II2: X2");
    }

    public X2() {
        // super();
        System.out.println("C: X2 -> " + i);

    }
}
