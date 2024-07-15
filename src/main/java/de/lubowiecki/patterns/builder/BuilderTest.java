package de.lubowiecki.patterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hallo");
        sb.append(" ").append("Welt").append("\n");

        System.out.println(sb.toString());

        sb.append("...");

        System.out.println(sb.toString());

        System.out.println("----------------------");

        Fahrzeug f1 = new Fahrzeug("HH:AB123", "VW", "Golf", Antrieb.DIESEL, Getriebe.SCHALTUNG, 2019);
        Fahrzeug f2 = new Fahrzeug("HH:XY567", "VW", "Golf", Antrieb.DIESEL, Getriebe.SCHALTUNG, 2019);
        Fahrzeug f3 = new Fahrzeug("HH:GH112", "VW", "Golf", Antrieb.DIESEL, Getriebe.AUTOMATIK, 2019);

        System.out.println();

        // Ein Builder bietet uns die Möglichkeit an, viele gleichartige Objekte zu erzeugen, ohne jedes mal
        // alle Informationen neu vorgeben zu müssen

        FahrzeugBuilder fb = new FahrzeugBuilder();
        fb.setAntrieb(Antrieb.DIESEL);
        fb.setGetriebe(Getriebe.AUTOMATIK).setMarke("Volvo").setTyp("V70").setBaujahr(2018);

        f1 = fb.setKennzeichen("HH:AB123").build();
        System.out.println(f1);
        f2 = fb.setKennzeichen("HH:XY567").build();
        System.out.println(f2);
        f3 = fb.setAntrieb(Antrieb.ELEKTRO).build();
        System.out.println(f3);

    }
}
