package de.lubowiecki;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("START");

        try {

            boolean exc = true;

            if(exc) {
                // Exceptions können auch vom Entwickler geworfen werden
                throw new UnsupportedOperationException("Das ist nicht ok!");
            }

            int[] arr = null;
            // Unbehandelte Exceptions führen zum Programmabbruch

            //System.out.println(arr[10]); // NullPointerException

            //arr = new int[-10]; // NegativeArraySizeException

            arr = new int[10];
            //System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

            arr[1] = 7;
            System.out.println(arr[1] / arr[2]); // ArithmeticException

        }
        catch(NullPointerException ex) {
            System.out.println("Das Array ist nicht da!");
        }
        catch(NegativeArraySizeException ex) {
            System.out.println("Das Array kann keine negative Größe haben!");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Das Array hat keine passende Position.");
        }
        catch(Exception ex) { // Hier kann der Rest behandelt werden
            // Wird eine Exception behandelt/gefangen, dann kann das Programm fortgesetz werden
            //System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("ENDE");
    }
}
