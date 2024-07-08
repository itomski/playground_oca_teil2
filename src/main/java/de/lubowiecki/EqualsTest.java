package de.lubowiecki;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

    public static void main(String[] args) {

        Person p1 = new Person("Peter");
        Person p2 = new Person("Peter");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        // Zwei als gleich geltenden Objekte sollten den gleichen Hashcode liefern
        // equals und hashCode sollten auf den gleichen Eigenschaften basieren

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println();
        System.out.println(p1.equals(null));

        System.out.println();

        String s1 = new String("Hallo");
        String s2 = new String("Hallo");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // Bei primitiven Datentypen vergleicht == immer den Inhalt(Wert)
        // equals gibt es für primitive Datantypen nicht

        System.out.println();

        Set<Person> personen = new HashSet<>();
        personen.add(p1);
        personen.add(new Person("Bruce"));
        personen.add(p2);

        System.out.println(personen);

    }
}
