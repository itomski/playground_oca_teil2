package de.lubowiecki;

import java.util.Random;

public class ZufallsauswahlTest {

    public static void main(String[] args) {

        String[] namen = {"Peter", "Bruce", "Carol", "Scott", "Natasha", "Steve"};

        Random rand = new Random();
        int i = rand.nextInt(namen.length);

        System.out.println(namen[i]);

    }
}
