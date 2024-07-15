package de.lubowiecki.patterns.composite;

public class CompositeTest {

    // Eine betimmte Aktion für eine einzelnes Objekt kann auch auf eine Gruppe von Objekten angewandt werden

    public static void main(String[] args) {

        Kreis k1 = new Kreis(10, 20, 100);
        System.out.println(k1);

        //k1.setX(0);
        //k1.setY(0);
        k1.move(0, 0);
        System.out.println(k1);

        System.out.println();

        Rechteck r1 = new Rechteck(15, -17, 200, 25);
        System.out.println(r1);

        r1.move(0, 0);
        System.out.println(r1);

        // GeometrischeForm f1 = new GeometrischeForm(10, 15); // Klasse ist abstrakt. Keine direkte Instanzierung möglich

        System.out.println();

        ElementGroup gr1 = new ElementGroup(k1, r1);
        System.out.println(gr1);
        gr1.add(new Kreis(10, 25, 150));
        System.out.println(gr1);

        gr1.move(200, 200);
        System.out.println(gr1);

        System.out.println();

        ElementGroup gr2 = new ElementGroup();
        gr2.add(new Rechteck(10, 15, 200, 150));
        System.out.println(gr2);
        gr2.add(gr1); // ElementGroup ist auch ein MovableElement
        System.out.println(gr2);

        gr2.move(-10,-10);
        System.out.println(gr2);
    }
}
