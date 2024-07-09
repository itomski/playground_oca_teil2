package de.lubowiecki;

import java.io.IOException;

public class CheckedUncheckedTest2 {

    public static void main(String[] args) throws Exception {

        try {
            machWasChecked(); // Muss behandelt oder deklariert werden!
        }
        catch (Exception e) {
            System.out.println("Problem");
        }

        try {
            machWasUnchecked(150); // Können behandelt oder deklariert werden. Müssen aber nicht!
        }
        catch (Exception e) {
            System.out.println("Array Problem");
        }

        try {
            System.out.println("Hallo");
        }
        //catch(IOException e) { // im try besteht keine Möglichkeit, dass IOException auftaucht
        // im catch prüfen alle Checked Exceptions (außer Exception), ob sie im try auftauchen können
        //}
        catch(Exception e) { // Alle RuntimeExceptions und Exception können immer im catch verwendet werden
        }



        try {
            String str = null;
            System.out.println(str.toLowerCase());
        }
        catch(NullPointerException e) { // zuerst die Kindklassen
            System.out.println("NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException e) { // Multicatch
            System.out.println("Probleme mit dem Array");
        }
        catch(RuntimeException e) { // danach die Elternklassen
            System.out.println("RuntimeException");
        }


        try {
            // wird ausgeführt bis eine Exception geworfen wird
        }
        catch(RuntimeException e) {
            // wird ausgeführt wenn eine Exception geworfen wurde
        }
        finally {
            // wird immer ausgeführt
        }


        try {
            String str = null;
            str.toUpperCase();
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            // e.printStackTrace();
            // throw new Exception("Bla bla bla", e);
        }

        System.out.println();

        // machWasAnderes(null); // NullPointerException
        // machWasAnderes("Hallo"); // ClassCastException

        Object[] data = {};
        //machWasAnderes(data); // ArrayIndexOutOfBoundsException

        Exception e = new NullPointerException("...");

        int i = Integer.parseInt("123");
        System.out.println(i);

        try {
            i = Integer.parseInt("abc");
            System.out.println(i);
        }
        /*
        catch(NumberFormatException ex) {
            System.out.println("Keine Zahl");
        }
        */
        catch(IllegalArgumentException ex) {
            System.out.println("Argument passt nicht!");
        }
    }

    public static void machWasChecked() throws Exception {
        System.out.println("machWasChecked");
    }

    public static void machWasUnchecked(int pos) throws RuntimeException {
        System.out.println("machWasUnchecked");
        int[] arr = new int[100];
        System.out.println(arr[pos]);
    }

    public static void machWasAnderes(Object obj)  {
        Object[] arr = (Object[])obj;
        System.out.println(arr[1]);
    }

    // Eine Methode mit einem Rückgabetyp MUSS entweder einen passenden Wert zurückgeben
    // ODER eine Exception werfen

    public static int[] machWasGanzAnderes(String... args)  {
        // Nimmt Strings entgegen und liefert ein arrray gefüllt mit den Längen der Wörter
        throw new UnsupportedOperationException("Ist noch nicht eingebaut...");
        //return null;
    }
}
