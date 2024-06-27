package de.lubowiecki;

public class OperatorTest {


    public static void main(String[] args) {

        int i = 22;
        int erg = (10 + 17) * ++i;
        //      27  * 23

        i = 1;
        erg = ++i + i++ + ++i;
        // 2 + 2 + 4
        System.out.println(erg);

        i = 1;
        i = i++; // Durch Neuzuweisung geht die Vormerkung für das post-increment verloren
        System.out.println(i);

        System.out.println();

        i = 1;
        int j = 1;
        j = i++;
        System.out.println(i);

        String s = "Hallo";
        int z = 10;
        System.out.println(s + z + 2); // Hallo102

        System.out.println(z + 2 + s); // 12Hallo

        System.out.println(s + 2 * z); // Hallo20

        //System.out.println(z * 2 * s); // Error: Der Einzige Operator für String ist +

        int a = 10;
        int b = 12;
        int c = 18;

        // Relationale-Ops
        if (a > b) System.out.println("a ist größer als b");
        if (a < b) System.out.println("a ist kleiner als b");
        if (a <= b) System.out.println("a ist kleiner-gleich b");
        if (a >= b) System.out.println("a ist größer-gleich b");
        if (a == b) System.out.println("a ist gleich b");
        if (a != b) System.out.println("a ist NICHT gleich b");

        // Logische-Ops
        if (a > b && b < c) System.out.println("...."); // Beide Vergleichen müssen ein true ergeben, dann true
        if (a > b || b < c) System.out.println("...."); // Eine Seite muss true ergeben, dann true

        // XOR - Exclusiv-Oder
        if (a > b ^ b < c) System.out.println("...."); // Nur eine der Seite darf true ergeben, dann true

        System.out.println();

        a = 3;
        b = 2;
        c = 3;
        if (a < ++b && ++b == c) {
            System.out.println("HIER!!!!");
        }
        System.out.println(a);
        System.out.println(b);

        String s2 = "Hallo Welt";

        // &&: Führt nur den zweiten Vergleich aus, wenn der erste true ergibt
        if (s2 != null && s2.length() > 2) {
            System.out.println("String ist ok!");
        }

        // &: Führt immer beide Seiten aus
        if (s2 != null & s2.length() > 2) {
            System.out.println("String ist ok!");
        }

        System.out.println(a == 3 ? "OK" : "Nicht OK");
    }

}
