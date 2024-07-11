package de.lubowiecki;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>(List.of("Peter", "Carol", "Bruce", "Steve", "Scott", "Natasha"));

        for (String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        // Consumer: void accept(T t);
        // Die Lambdas implementieren die abstrakte Methode
        namen.forEach(n -> System.out.println(n.toUpperCase()));
        //namen.forEach(n -> n.toUpperCase() + "ABC"); // return ist ein String
        namen.forEach(n -> {
            String str = n.toUpperCase() + "ABC"; // kein return = void
        });

        try {
            Path pfad = Paths.get("data.txt");
            if(!Files.exists(pfad))
                Files.createFile(pfad);

            BufferedWriter writer = Files.newBufferedWriter(pfad, StandardOpenOption.APPEND);

            namen.forEach(n -> {
                try {
                    writer.append(n);
                    writer.flush();
                }
                catch(IOException e) {
                    System.out.println("Problem beim Schreiben von: " + n);
                }
            });
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
