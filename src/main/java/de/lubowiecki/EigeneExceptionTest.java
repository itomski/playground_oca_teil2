package de.lubowiecki;

import java.util.Scanner;

public class EigeneExceptionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie alt bist du? ");

        try {
            int alter = checkAlter(scanner.nextInt());
            System.out.println("Dein Alter von " + alter + " passt!");
        }
        catch (ZuJungException e) {
            System.out.println("Dein alter passt nicht! Du bist zu jung.");
        }
        catch (ZuAltException e) {
            System.out.println("Dein alter passt nicht! Du bist zu alt.");
        }

    }

    public static int checkAlter(int alter) {

        if(alter < 0) {
            throw new ZuJungException();
        }
        else if (alter > 150) {
            throw new ZuAltException();
        }
        return alter;
    }
}

class ZuJungException extends RuntimeException {
    public ZuJungException() {
        super("Du bist zu jung");
    }
}

class ZuAltException extends RuntimeException {
    public ZuAltException() {
        super("Du bist zu alt");
    }
}
