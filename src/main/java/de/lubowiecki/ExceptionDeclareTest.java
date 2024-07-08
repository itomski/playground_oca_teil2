package de.lubowiecki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionDeclareTest {

    public static void main(String[] args) {
        new ExceptionDeclareTest().start();
    }

    private void start() {
        System.out.println("start first");


        /* // checked
        try {
            a();
        } catch (IOException e) {
            System.out.println("Problem");
        }
        */

        // unchecked
        try {
            aa();
        } catch (Exception e) {
            System.out.println("Problem");
        }
        System.out.println("ende first");
    }

    private void a() throws IOException {
        System.out.println("start a");
        b();
        System.out.println("ende a");
    }

    private void b() throws IOException {
        System.out.println("start b");
        c();
        System.out.println("ende b");
    }

    private void c() throws IOException {
        System.out.println("start c");

        Path path = Paths.get("data/content.txt");
        List<String> zeilen = Files.readAllLines(path); // Checked Exception
        System.out.println(zeilen);

        System.out.println("ende c");
    }

    private void aa() {
        System.out.println("start aa");
        bb();
        System.out.println("ende aa");
    }

    private void bb() {
        System.out.println("start bb");
        cc();
        System.out.println("ende bb");
    }

    private void cc() {

        // Unbehandelte UncheckedExceptions steigen automatisch zum Aufrufer auf

        System.out.println("start cc");
        //try {
            String s = null;
            System.out.println(s.toUpperCase()); // NullPointerException
        //}
        //catch (NullPointerException ex) {
        //    System.out.println("s ist kein String-Objekt");
        //}
        System.out.println("ende cc");
    }

}
