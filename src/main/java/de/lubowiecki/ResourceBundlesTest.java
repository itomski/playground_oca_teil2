package de.lubowiecki;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundlesTest {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.ENGLISH);
        Locale loc = Locale.getDefault();
        final String PATH = "assets/" + loc.getLanguage();
        System.out.println(PATH + "/welcome.jpg");

        ResourceBundle bundle = ResourceBundle.getBundle("lang.texte");

        Scanner scanner = new Scanner(System.in);

        System.out.println(bundle.getString("welcome"));

        System.out.print(bundle.getString("question.name") + ": ");
        String name = scanner.next();

        System.out.print(bundle.getString("question.age") + ": ");
        int age = scanner.nextInt();

        System.out.print(bundle.getString("question.location") + ": ");
        String location = scanner.next();

        System.out.println(bundle.getString("label.name") + ": " + name);
        System.out.println(bundle.getString("label.age") + ": " + age);
        System.out.println(bundle.getString("label.location") + ": " + location);

    }
}
