package de.lubowiecki.testen;

import java.util.Random;

public class DiceCup {

    private Random rand = new Random();

    private int size = 6;

    public DiceCup() {
    }

    public DiceCup(int size) {
        this.size = size;
    }

    public int roll() {
        return rand.nextInt(size) + 1;
    }
}
