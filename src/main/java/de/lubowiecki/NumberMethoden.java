package de.lubowiecki;

import de.lubowiecki.db.User;

public class NumberMethoden {

    // private int i, j = k, k = j; // k ist noch nicht deklariert und hat noch keinen Standardwert

    public static void main(String[] args) {

        System.out.println(10 % 9);
        System.out.println(Long.remainderUnsigned(10, 3));
        System.out.println(Long.divideUnsigned(10, 3));

        System.out.println(Integer.parseInt("0123"));
        //System.out.println(Integer.parseInt("0b101")); // geht von Dezimal-Format aus
        System.out.println(Integer.decode("0x101"));

        int x = 10, y;
        int a, b;

        StringBuilder sb = new StringBuilder();
        sb.append("Moin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(22);
        System.out.println(sb.capacity());
        sb.setLength(2);
        sb.trimToSize(); // Schneidet die capacity auf benötigte Größe zu
        System.out.println(sb.capacity());


    }

    public static void add(final int a, final int b) {

    }

    public static User add(final User u) {
        //u = new User();
        u.setLastname("Peter");
        return u;
    }
}
