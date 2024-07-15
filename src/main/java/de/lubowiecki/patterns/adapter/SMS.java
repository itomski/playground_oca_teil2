package de.lubowiecki.patterns.adapter;

public class SMS implements Nachricht {

    private String fromNr;
    private String toNr;
    private String content;

    private final int MAX_LENGTH = 102;


    public SMS(String fromNr, String toNr, String content) {
        this.fromNr = fromNr;
        this.toNr = toNr;
        if(content.length() > MAX_LENGTH) {
            this.content = content.substring(0, MAX_LENGTH) + "...";
        }
        else {
            this.content = content;
        }
    }

    @Override
    public void verarbeiten() {
        System.out.println("------ SEND SMS ------");
        System.out.println("------ FROM: " + fromNr);
        System.out.println("------ TO: " + toNr);
        System.out.println("------ CONTENT: " + content);
        System.out.println();
    }
}
