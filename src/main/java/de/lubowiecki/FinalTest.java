package de.lubowiecki;

public class FinalTest {

    public static void main(String[] args) {

        final int i = 100;
        System.out.println(i);
        // i = 200; // Error: ist final

        final Person p = new Person();
        //p = new Person(); // Error: ist final
        p.name = "Bruce";

        final String s = "Moin"; // Strings sind immutable (nicht änderbar)
    }
}
