package de.lubowiecki;

public class ObjektbeziehungTest {

    public static void main(String[] args) {

        Motor motor = new Motor("Elektro", 75);
        Fahrzeug f1 = new Fahrzeug("HH:AB123", 2020, motor); // Motor wird als Parameter übergeben

        System.out.println(f1.getMotor().getAntriebsArt());
        System.out.println(f1.getMotor().getLeistung());

        Rad r1 = new Rad(22, "Hancook");
        Rad r2 = new Rad(22, "Hancook");
        Rad r3 = new Rad(22, "Continental");
        Rad r4 = new Rad(22, "Continental");

        f1.addRad(r1, 0);
        f1.addRad(r2, 1);
        f1.addRad(r3, 2);
        f1.addRad(r4, 3);

    }
}
