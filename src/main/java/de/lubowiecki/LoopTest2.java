package de.lubowiecki;

public class LoopTest2 {

    public static void main(String[] args) {

        int x;
        for(x = 0; x++ < 2; x++ /* x wird vor dem nächsten Vergleich verändert */) System.out.println(x + " im loop");
        System.out.println(x + " nach dem loop");

        LoopTest2 lt2 = new LoopTest2(10);

    }

    public LoopTest2(int x) {
    }
}
