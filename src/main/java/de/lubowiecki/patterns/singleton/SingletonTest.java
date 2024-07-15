package de.lubowiecki.patterns.singleton;

public class SingletonTest {

    // Erzeugung der Objekte muss kontrolliert werden
    // Es darf zur Laufzeit immer max. ein Objekt der Klasse verfügbar sein

    public static void main(String[] args) {

        EnumSingleton.INSTANCE.setZahl(200);
        System.out.println(EnumSingleton.INSTANCE.getZahl());

        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        EagerSingleton es3 = EagerSingleton.getInstance();

        System.out.println(es1 == es2);
        System.out.println(es1 == es3);

        es1.setZahl(10);
        System.out.println(es2.getZahl());
        es3.setZahl(20);
        System.out.println(es1.getZahl());

        // machWas(es1);
        machWas();

        System.out.println(es2.getZahl());

    }

    /*
    public static void machWas(EagerSingleton es) {
        es.setZahl(100);
    }
    */

    public static void machWas() {
        EagerSingleton.getInstance().setZahl(100);
    }
}
