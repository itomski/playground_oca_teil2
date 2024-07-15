package de.lubowiecki;

public class InterfaceTest2 {

    public static void main(String[] args) {
        System.out.println(I2.i);
        I2.machWas();
        I1.machWas();
    }
}

interface I1 {

    int i = 100; // statische Eigenschaft wird an das Kindinterface vererbt

    static void machWas() { // statische Methoden werden NICHT an das Kindinterface vererbt
        System.out.println("I1");
    }
}

interface I2 extends I1 {

    static String machWas() {
        System.out.println("I2");
        return null;
    }

}
