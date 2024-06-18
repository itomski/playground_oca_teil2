package de.lubowiecki;

public class PersonTest {

    public static void main(String[] args) {

        System.out.println(Person.typ);

        //System.out.println(Person.name); // ist in der Klasse nicht verfügbar
        // Zuerst muss ein Objekt gebaut werden
        // Person p1 = Referenzvariable
        // new Person() = Instanzierung
        Person p1 = new Person();
        System.out.println(p1.name); // Über das Objekt aufrufbar

        Person p2 = new Person();
        System.out.println(p2.name);

        System.out.println();

        p1.name = "Peter";
        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println();

        // Klasseneigenschaften können über das Objekt oder Klasse angesprochen werden
        // In beiden Fällen wird aber die Eigenschaft aus der Klasse gelesen
        System.out.println(p1.typ);
        System.out.println(p2.typ);
        System.out.println(Person.typ);

        System.out.println();
        // typ ist als Eigenschaft nur 1x in der Klasse verfügbar
        p1.typ = "Klingone"; // Änderung wird in der Klasse durchgeführt und betrifft alle
        System.out.println(p1.typ);
        System.out.println(p2.typ);
        System.out.println(Person.typ);

        // Wenn die Methode in gleichen Klasse gefunden wird und statisch ist
        // dann ist der Aufruf gleichbedeutend mit PersonTest.machWasAnderes();
        machWasAnderes();

        //machWas(); // Objekt ist nicht verfügbar
        PersonTest pt = new PersonTest();
        pt.machWas(); // OK, wird auf einem Objekt ausgeführt
    }

    // Instanzmethode
    void machWas() { // Instanzmethode
        System.out.println("Instanz");
    }

    void machWasGanzAnderes() { // Instanzmethode
        System.out.println("Instanz");

        // Wenn die Methode in gleichen Objekt gefunden wird
        // dann ist der Aufruf gleichbedeutend mit this.machWas(); (this = das aktuell verwendete Objekt)
        machWas();
    }

    // Klassenmethode
    static void machWasAnderes() {
        System.out.println("statisch");
    }

}
