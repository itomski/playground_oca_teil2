package de.lubowiecki;

public class UeberschreibenTest {
    public static void main(String[] args) {

        machWas(); // #1
        machWas(true); // #2
        machWas(25); // #3

        // 1. passende Methode
        // 2. primitive widening
        // 3. autoboxing
        // 4. komplex widening
        // 5. Var-Args

        StringBuilder sb = new StringBuilder();
        sb.append("hi"); // String-Variante wird verwendet

    }

    public static void machWas() { // #1
        System.out.println("Leer");
    }

    public static void machWas(boolean on) { //#2
        System.out.println("bool");
    }

//    private static String machWas(int on) { //#3
//        System.out.println("int");
//        return "int Variante";
//    }

//    private static void machWas(double on) { //#4
//        System.out.println("double");
//    }

//    private static void machWas(Integer on) { //#5
//        System.out.println("Integer");
//    }

//    private static void machWas(Number on) { //#6
//        System.out.println("Number");
//    }

    private static void machWas(int... on) { //#10
        System.out.println("int Vararg");
    }

}
