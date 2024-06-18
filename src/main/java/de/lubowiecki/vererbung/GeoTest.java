package de.lubowiecki.vererbung;

public class GeoTest {

    public static void main(String[] args) {

        /*
        GeometrischeForm gf1 = new GeometrischeForm(); // Error: Abstrakte Klasse darf nicht instanziert werden
        gf1.setX(10);
        gf1.setY(20);
        gf1.print();
        System.out.println();
        */

        Kreis k1 = new Kreis();
        k1.setX(30);
        k1.setY(75);
        k1.radius = 100;
        k1.print();

        System.out.println();

        Rechteck r1 = new Rechteck();
        r1.setX(20);
        r1.setY(90);
        r1.setLaenge(100);
        r1.setBreite(100);
        r1.print();

        System.out.println();

        Quadrat q1 = new Quadrat();
        q1.setX(120);
        q1.setY(190);
        q1.setLaenge(100);
        q1.print();
        q1.setBreite(120);
        q1.print();

        System.out.println();

        System.out.println(k1 instanceof Kreis);
        System.out.println(k1 instanceof AbstractGeometrischeForm);
        System.out.println(k1 instanceof Object);

        Kreis k2 = new Kreis();
        AbstractGeometrischeForm agf1 = new Kreis();
        Object o1 = new Kreis();

        //Quadrat q2 = new Kreis(); // Keine IS-A-Beziehung
        AbstractGeometrischeForm obj = new Kreis();
        obj = new Quadrat();
        obj = new Rechteck();

        // Referenztyp: AbstractGeometrischeForm
        // Objekttyp: Rechteck
        obj.print();
        obj = new Kreis();
        obj.print();

        System.out.println();

        showForm(new Kreis());
        showForm(new Rechteck());
        showForm(new Quadrat());
    }

    public static void showForm(AbstractGeometrischeForm obj) {
        obj.print();
    }
}
