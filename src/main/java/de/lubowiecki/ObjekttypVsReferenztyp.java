package de.lubowiecki;

public class ObjekttypVsReferenztyp {

    public static void main(String[] args) throws Exception {

        Parent p1 = new Parent();
        System.out.println(p1.zahl);
        p1.zeigeWert();
        p1.zeigeObjWert();

        System.out.println();

        Parent p2 = new Child();
        System.out.println(p2.zahl);
        p2.zeigeWert();
        p2.zeigeObjWert();

    }
}

class Parent {

    public int zahl = 10;

    public static void zeigeWert() {
        System.out.println(10);
    }

    void zeigeObjWert() throws Exception {
        System.out.println(100);
    }
}

class Child extends Parent {

    public int zahl = 20;

    public static void zeigeWert() {
        System.out.println(20);
    }

    @Override
    public void zeigeObjWert() {
        System.out.print(200);
        System.out.println(", zahl: " + zahl);
    }
}
