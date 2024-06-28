package de.lubowiecki;

public class VererbungTest1 {

    public static void main(String[] args) {

        C2 c2 = new C2();
        B2 b2 = c2;


    }

}

class A2 {

    int zahl1;

    public A2() {
        super();
        System.out.println("A2");
    }
}

class B2 extends A2 {

    int zahl2;

    public B2() {
        //super();
        System.out.println("B2");
    }
}

class C2 extends B2 {

    int zahl3;

    public C2() {
        super();
        System.out.println("C2");
    }
}