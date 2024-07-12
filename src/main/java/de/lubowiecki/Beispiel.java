package de.lubowiecki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Beispiel {

    int value;
    Beispiel(int value) {
        this.value = value;
    }
     public String toString(){ return ""+value; }
    public static void main (String[] args) {
        Beispiel[] dataArr = new Beispiel[]{new Beispiel(1), new Beispiel(2), new Beispiel(3), new Beispiel(4)};

        // List.of(...) und Arrays.asList(...) erzeugen eine Fixed-Size Liste

        //List<Beispiel> dataList = Arrays.asList(dataArr);
        List<Beispiel> dataList = new ArrayList<>(Arrays.asList(dataArr));
        for (Beispiel element : dataList) {
            dataList.removeIf((Beispiel d) -> {
                return d.value % 2 == 0;
            });
            //System.out.println("Removed " + d + ", ");
        }

        int j = 100;

        // Innerhalb der Lamdas können auch Variablen benutzt werden, die außerhalb deklariert sind
        Predicate<String> pred = x -> x.length() < j;

        // Wird eine Variable von Außerhalb im Lambda verwendet muss diese final oder effektiv final sein
        // effektiv final = Variable ist nicht final, wird aber nicht geändert!!!!

        pred.test("Hallo");
    }

    public void machWas(int i) {
        System.out.println("..."); return;
    }

    public int machWasAnderes() {
        return 100; // Rückgabe ist Pflicht
    }

}

/*
// in JavaScript

function xyz(a, func) {
    System.out.println(func(a));
}

xyz(100, function(zahl) { return zahl * zahl});

xyz(50, function(zahl) { return zahl + 2000});

*/

/*
// in Java

interface Func {
    int run(int i);
}

public void execute(int i, Func func) {
    System.out.println(func.run(i))
}

execute(100, (zahl) -> zahl * zahl});
execute(50, (zahl) -> { return zahl + 2000; });

*/