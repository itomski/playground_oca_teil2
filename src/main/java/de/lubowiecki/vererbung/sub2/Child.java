package de.lubowiecki.vererbung.sub2;

import de.lubowiecki.vererbung.sub1.Parent;

public class Child extends Parent {

    public static void main(String[] args) {
        Child c = new Child();
        c.machWas();
    }

    private void machWas() {
        // Um die Vererbung zu nutzen muss über ein Objekt von Child auf zahl zugegriffen werden
        System.out.println(zahl); // Hier wird die Vererbung genutz = protected ist sichtbar

        //Parent p = new Parent();
        //System.out.println(p.zahl); // Hier wird die Vererbung NICHT genutz = protected nicht sichtbar

        int i = 100;
        class LocalSub {

            public LocalSub() {
                int j = 0;
                System.out.println(i); // muss final oder effektiv final (wird nicht geändert) sein
            }
        }


    }

    private class Sub { // Innere Klasse

    }
}
