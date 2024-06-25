package de.lubowiecki.uebung;

public class U7Strings {

    // Schreibe eine Anwendung die vom User einen (längeren) Text entgegen nicht.
    // Danach kann er ein Wort oder Buchstaben eingeben und bekommt die Positon ausgegeben.
    // Wenn es mit Text vorkommt, soll danach der gleiche Text ausgegeben werden, allerding das
    // gesuchte Wort soll duch das gleiche Wort in Großbuchstaben ersetzt werden

    // str.indexOf("A") // erstes Vorkommen
    // str.lastIndexOf("A") // letztes Vorkommen

    public static void main(String[] args) {

        String s = "Hallo Welt";
        int pos = s.indexOf("Welt");
        if(pos >= 0)
            System.out.println("Wort wurde an Pos " + pos + " gefunden");


        String zahl = String.valueOf(100); // Wandelt 100 in String um
        zahl = 100 + ""; // Wandelt ebenfalls 100 in String um
    }
}
