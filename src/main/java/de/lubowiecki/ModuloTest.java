package de.lubowiecki;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Predicate;

public class ModuloTest {

    public static void main(String[] args) {

        int x = 10;
        int y = -10;

        System.out.println(x % 3);
        System.out.println(x % -3);
        System.out.println(y % 3);
        System.out.println(y % -3);

        System.out.println("----------");

        System.out.println(x * 3);
        System.out.println(x);

        System.out.println(x *= 3); // x = (int)(x * 3)
        System.out.println(x);

        var _x = 100;
        // var _ = 100;

        Xyz2 xyz = new Xyz2(){};

        //String s = (String)(new Object());

        System.out.println();

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.valueOf(100).doubleValue());


        LocalDate ld = LocalDate.of(2022, 10, 15);
        ld = ld.plusDays(10);
        System.out.println(ld);

        Locale.setDefault(Locale.US);
        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("MMM");
        System.out.println(ld.format(FMT));

        System.out.println();

        String s2 = "Moin";
        s2 = s2.concat(" Moin");


        Period p = Period.of(1, 2, 0);
        System.out.println(p);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

        int z = 1;

        System.out.println(z == 0 ? "0" : (z > 0 ? ">" : "<"));

        Predicate<String> pred1 = s -> s.toLowerCase().equals("moin");
        System.out.println(pred1.test("MOIN"));

        //Predicate pred2 = s -> s.toLowerCase().equals("moin");
        //System.out.println(pred2.test("MOIN"));


    }
}

interface Xyz2 {
}

class Abc1 {

    public Abc1(int x) {
        super();
    }

    public Abc1() {
        this(100);
    }
}

class Cde1 extends Abc1 {

    public Cde1() {
        super(10);
    }

    public Cde1(int j) {
        super(j);
    }

    public Cde1(int j, int k) {
        super(j + k);
    }
}
