package de.lubowiecki;

public class IncrementTest {

    public static void main(String[] args) {

        int i = 0;

            //  0   + 1   + 3
        int j = i++ + i++ + ++i;
        System.out.println(j);

        i = 0;

        //  0   + 1   + 2;
        i = i++ + i++ + i++; // Zuweisung auf i überschreibt das letzte Postfix
        System.out.println(i);

        for(int k = 0; k < 10; System.out.println(k))
                k++;

        for(int k = 0; k < 10; k++)
            System.out.println(k);


    }
}
