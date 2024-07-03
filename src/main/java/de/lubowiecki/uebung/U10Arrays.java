package de.lubowiecki.uebung;

public class U10Arrays {

    /*
       Schreibe eine eigene StringArrayList Klasse.
       Es können Elemente mit add(String s) hinzugefügt werden.
       Beim Instanzieren ist das interne String-Array 10 Elemente groß.
       Wird ein 11 Element hinzugefügt wird das interne Array verdoppelt.
       Jedes mal, wenn das Array zu klein ist, wird es beim hinzufügen vergrößert (verdoppelt)
       Es gibt eine get(int index) die ein Element an passender Position zurückgibt
     */

    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();
        list.add("Peter");
        list.add("Bruce");
        list.add("Carol");
        list.add("Max");
        list.add("Natasha");
        list.add("Scott");
        list.add("Tony");
        list.add("Tina");
        list.add("Britta");
        list.add("Klaus");
        list.add("Bob");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.get(25));

        System.out.println(list);

        System.out.println("------------------");

        GenericArrayList<Integer> zahlen = new GenericArrayList<>();
        zahlen.add(1);
        zahlen.add(7);
        zahlen.add(19);

        System.out.println(zahlen.get(0));
        System.out.println(zahlen.get(1));

    }

}
