package de.lubowiecki;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesTest {

    private static final String PATH = System.getProperty("user.home");

    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "config.xml";

    public static void main(String[] args) {

        try {
            Properties prop = read();
            System.out.println(prop);
            System.out.println(prop.getProperty("db.user"));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties read() throws IOException {

        try(InputStream in = new FileInputStream(PATH + "/" + FILE_NAME)) {

            Properties prop = new Properties();
            // prop.load(in);
            prop.loadFromXML(in);
            return prop;
        }
    }

    private static void write() throws IOException {
        try(OutputStream out = new FileOutputStream(PATH + "/" + FILE_NAME)) {

            System.out.println("Gib bitte deine Zugangsdaten ein.");

            Properties prop = new Properties();
            System.out.print("URL: ");
            prop.setProperty("db.url", scanner.next());
            System.out.print("Port: ");
            prop.setProperty("db.port", scanner.next());
            System.out.print("User: ");
            prop.setProperty("db.user", scanner.next());
            System.out.print("Passwort: ");
            prop.setProperty("db.password", scanner.next());

            //prop.store(out, null);
            prop.storeToXML(out, null);
        }
    }
}
