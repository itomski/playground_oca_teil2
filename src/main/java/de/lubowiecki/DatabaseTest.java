package de.lubowiecki;

import java.sql.*;
import java.util.Scanner;

import org.sqlite.core.Codes;

public class DatabaseTest {

    public static void main(String[] args) {

        final String URL = "jdbc:sqlite:sample.db";

        try {
            Connection connection = DriverManager.getConnection(URL); // Verbindung zu DB wird aufgebaut

            printUsers(connection);
            //saveUser(connection);
        }
        catch (SQLException e) {
            System.out.println("Verbindung zu der Datenbank konnte nicht aufgebaut werden.");
        }
    }

    public static void printUsers(Connection connection) {

        final String SQL = "SELECT * FROM users";

        try {
            Statement statement = connection.createStatement(); // Anfrage

            ResultSet results = statement.executeQuery(SQL); // Anfrage wird an die DB geschickt
            // ResultSet enthält die abgefragten Daten

            while (results.next()) { // Daten werden Zeile für Zeile verarbeitet
                System.out.println(results.getString("firstname")); // Zugriff auf eine bestimmte Zelle
                System.out.println(results.getString("lastname"));
                System.out.println();
            }
        }
        catch (SQLException e) {
            System.out.println("Problem beim Zugriff auf die Daten.");
        }
    }

    public static void saveUser(Connection connection) {

        final String SQL = "INSERT INTO users (id, firstname, lastname) VALUES(null, '%s', '%s')";

        try {
            Statement statement = connection.createStatement(); // Anfrage

            Scanner scanner = new Scanner(System.in);

            System.out.print("Vorname: ");
            String firstname = scanner.next();
            System.out.print("Nachname: ");
            String lastname = scanner.next();

            int count = statement.executeUpdate(String.format(SQL, firstname, lastname)); // Anfrage wird an die DB geschickt
            // count wird die Anzahl gespeicherter Datensätze festgehalten
            if(count == 1) {
                System.out.println("Gespeichert");
            }
        }
        catch (SQLException e) {
            System.out.println("Problem beim Schreiben von Daten.");
        }
    }
}
