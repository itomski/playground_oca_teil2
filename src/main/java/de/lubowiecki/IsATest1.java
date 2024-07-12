package de.lubowiecki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsATest1 {

    public static void main(String[] args) {

        // Referenz kann vom Typ einer Klasse, einer abstrakten Klassen oder eines Interface sein

        // Das Objekt muss in einer IS-A Beziehung zum Referenztyp stehen
        Object o1 = new String("Abc");

        // Objekte auf dem Heap ändern ihren Typ nicht!!!!

        Number n1 = Integer.valueOf(200); // Jeder Integer IST eine Number!
        Object o2 = n1; // Jede Number ist ein Objekt!
        //Integer i1 = n1; // Error: Nicht jede Number ist ein Integer!
        Integer i1 = (Integer)n1; // Ok, wenn auf dem Heap wirklich ein Integer liegt
        Double d1 = (Double)n1; // Auf dem Heap liegt ein Integer daher ClassCastException

        int i = 100;
        double d = i; // 100.0
        int j = (int)d; // die Kopie verliert Informationen (100)

        List<String> namen1 = Arrays.asList("Peter", "Bruce", "Carol"); // fixed size liste
        namen1 = new ArrayList<>(); // <> nutzt den generischen Typ der Variable

        //List namen2 = new ArrayList(); // Generischer Typ von List ist Object
        //List namen2 = new ArrayList<>(); // Generischer Typ von List ist Object

        // ArrayList<String> namen2 = Arrays.asList("Peter", "Bruce", "Carol"); // Error - nicht jede Liste ist eine ArrayList

        // Jede ArrayList ist eine List
        // Nicht jede List ist eine ArrayList

        //Student s = new Mensch(); // Error: Nicht jeder Mensch ist ein Student

        //Mensch m = new Student(); // Ok: Jeder Student ist ein Mensch
        // Die Besonderheiten eines Studenten sind über eine Mensch-Referenz nicht sichtbar

        // printList(namen1); // Error: List IS-NOT ArrayList!
        printList((ArrayList<String>)namen1); // Ok, wenn hinter namen1 wirklich eine ArrayList ist

        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("Peter");
        liste2.add("Bruce");

        printOtherList(liste2); // Ok: ArrayList IS-A List

    }

    public static void printList(ArrayList<String> list) {
        System.out.println(list);
    }

    public static void printOtherList(List<String> list) {
        System.out.println(list);
    }
}
