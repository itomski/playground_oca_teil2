package de.lubowiecki;

public class PersonTest2 { // top level class

    class Xyz { // nestetd class

    }

    static int x = 100;

    public static void main(String[] args) {

        //int args = 10; // Error: Redeklaration

        // wenn keine Konstruktoren in der Klasse deklariert sind wird ein default-Konstruktor bereitgestellt
        Person p1 = new Person();
        System.out.println(p1);

        System.out.println();
        Person p2 = new Person("Peter");
        System.out.println(p2);

        System.out.println();
        Person p3 = new Person("Bruce", 25);
        System.out.println(p3);

        p3 = null; // Objekt hinter p3 ist für GC verfügbar
        p2 = new Person(); // Das alte Objekt hinter p2 ist für GC verfügbar

        int i = 10;
        System.out.println(--i);
        System.out.println(i--);

        System.out.println();

        for(int x = 20; x < 50; x++)
            x++;

        System.out.println(x);

        int j = 0;

        if(true) {
            j = 100;
        }

        int z = 0;
        do {
            if(true) {
                z = z++;
            }
        } while(z < 100);

        System.out.println(j);

    }

}
