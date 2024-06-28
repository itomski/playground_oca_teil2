package de.lubowiecki;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    private static boolean DEBUG = false;
    private static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) {

        logger.setLevel(Level.WARNING);

        machWas();
        machWas(8);
        machWas(8, 10, 22);

        System.out.print("ABC");
        System.out.println("ABC");
        System.out.println();

    }

    public static int machWas() {
        //if(DEBUG) System.out.println("ohne parameter");
        logger.log(Level.INFO, "ohne parameter");
        return (int)(Math.random() * 10) + 1;
    }

    public static int machWas(int wert) {
        //if(DEBUG) System.out.println("mit einem parameter");
        logger.log(Level.INFO, "ohne parameter");
        return (int)(Math.random() * wert) + 1;
    }

    public static int[] machWas(int... werte) {
        //if(DEBUG) System.out.println("mit mehreren parametern");
        logger.log(Level.INFO, "ohne parameter");
        int[] arr = new int[werte.length];
        int i = 0;
        for (int wert : werte) {
            arr[i++] = (int)(Math.random() * 10) + 1;
        }
        return arr;
    }
}
