package de.lubowiecki;

public class MethodTest {

    public static void main(String[] args) {

        B3 b = new B3();
        b.machWas();

    }

}

class A3 {

    public void machWas() { // final hat keine Auswirkungen auf Überladen
        System.out.println("A3:machWas");
    }
}

class B3 extends A3 {

    // Überschreiben = Eine geerbte Methode ersetzen
    @Override
    public void machWas() {
        System.out.println("B3:machWas");
    }

    // Überladen = Eine zurätzliche Methode mit anderen Parametern definieren
    public void machWas(int i) {
        System.out.println("B3:machWas mit int");
    }
}