package de.lubowiecki.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) throws IOException {


        // IO

        File file = new File("datei.txt");

        if(!file.exists()) {
            System.out.println("Datei nicht da.");
            file.createNewFile();
        }

        //try(OutputStream out = new FileOutputStream(file)) {
        try(OutputStream out = new BufferedOutputStream(new FileOutputStream("datei.txt"))) {

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // NIO
        Path path = Paths.get("datei.txt");

        if(!Files.exists(path)) {
            System.out.println("Datei nicht da.");
            Files.createFile(path);
        }

        try(Writer out = Files.newBufferedWriter(path)) {

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
