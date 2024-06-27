package de.lubowiecki;

public class OperatorTest2 {

    public static void main(String[] args) {

        int x = 10;     // 10  + 11  + 12
        System.out.println(x++ + x++ + x++); // post muss vor der nächsten Verwendung der Variable erfolgen
        System.out.println(x);

        System.out.println();

        final int y = 10; // Compiletime-Konstante
        System.out.println(y);

        final int z;
        z = 20; // Runtime-Konstante
        System.out.println(z);


        int input = 100;
        switch(input) {

            case 10:
            case 20:
            case 30:
            case 40:
                System.out.println("...");
                break;

            case 50:
                System.out.println();
                break;
        }

        char c = 'a';
        switch(c) {

            case 'a':
            case 'b':
        }

        Wochentag w = Wochentag.DONNERSTAG;

        switch(w) {

            case MONTAG:
            case MITTWOCH:
            case SAMSTAG:
        }

        /*
        // long, float, double, Objekte (außer String und ENUMs) sind nicht erlaubt!!!!
        long opt = 100;
        switch(opt) {

            case 10l:
            case 20l:
        }
        */

        System.out.println();

        int erg1 = 1 / 2;
        System.out.println(erg1);

        double erg2 = 1.0 / 2.0;
        System.out.println(erg2);

        String erg = (x == 10) ? "x ist 10" : "x ist NICHT 10";

        System.out.println("Das ist das Haus von " + ((x == 10) ? "Peter" : "Bruce"));

        // String s = Referenz (Referenztyp = String)
        // Hallo = (Objekttyp = String)
        String s = "Hallo";

        // o = Referenz (Referenztyp = Object)
        // Hallo = (Objekttyp = String)
        Object o = "Hallo";

        System.out.println(o.equals(s));
        System.out.println(o == s);

        if(x < 10) // nur die nächste anweisung gehört zum if
            System.out.println("Moin"); // gehört zum if
            System.out.println("Moin"); // gehört nicht mehr zum if

        if(x < 10);
            System.out.println("Moin"); // gehört nicht mehr zum if
            System.out.println("Moin"); // gehört nicht mehr zum if

        System.out.println();

        int i = 129;
        int j = 13;
        //    10000001
        // &  00001101
        // =  00000001

        System.out.println(i & j);

        //    10000001
        // |  00001101
        // =  10001101
        System.out.println(i | j);

        //    10000001
        // ^  00001101
        // =  10001100
        System.out.println(i ^ j);

        //    00001101
        // =  00110100
        System.out.println(j << 2);

        //    00001101
        // =  00000011
        System.out.println(j >> 2);

        System.out.println();

        System.out.println('x' + 17);
        System.out.println((int)'x');

    }
}

class Box {

    private double preis;

    public double getPreis() {
        return preis;
    }

    public double getPreisInklMwSt() {
        return preis * 1.19;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}