package de.lubowiecki;

public class LoopTest1 {

    public static void main(String[] args) {


        int ar[ ][ ] = {{1,0},{-4},{3,1}};

        f1: for(int[] a : ar) {
            for (int x = 0; x < a.length; x++) {
                if(a[x] < 0) break f1;
                System.out.print(a[x]);
            }
        }

        int a = 100;

        xyz: {
            System.out.println("A");
            if(a == 100) break xyz; // Kann nur einen umgebenden Block abbrechen
            System.out.println("B");
        }

        //int i, j;
        int i = 20, j = 40;
        //int[] i, j;
        //int i, j[]; // j ist ein 1d-int-Array
        //int[] i, j[]; // i ist ein 1d-int-Array, j ist ein 2d-int-Array

        final boolean y = false; // Compiletime-Konstante

        //final boolean y;
        //y = false; // Runtimetime-Konstante

        //boolean y = false;

        /* y ist IMMER false
        while(y) { // ist gleichebedeutend mit if(false) {
            System.out.println(i);
        }
        */

        if(y == false) { // ist gleichebedeutend mit if(false) {
            System.out.println(i);
        }

        int x = 100;

        if(x < 200) return;

        /*
        while(y == false) { // ist gleichebedeutend mit if(false) {
            System.out.println(i);
        }
        */

        int[][] ar2 = {{1,2}, {3,4}, {5,6}};
        System.out.println(ar2); // Das ganze 2d-int-Array
        System.out.println(ar2[1][0]); // 3
        int z = 1;
        System.out.println(ar2[z]); // {3,4}

        for(int z2 : ar2[0]) { // die Laufvariable (z2) muss im Loop deklariert sein
            //...
        }

        int z2 = 0;
        for(; z2 < ar2[0].length; z2++) { // die Zählervariable (z2) kann auch außerhalb des Loopü deklariert sein
            //...
        }

    }
}
