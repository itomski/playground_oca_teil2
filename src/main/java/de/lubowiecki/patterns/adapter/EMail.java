package de.lubowiecki.patterns.adapter;

public class EMail implements Nachricht {

    private String von;
    private String an;
    private String inhalt;


    public EMail(String von, String an, String inhalt) {
        this.von = von;
        this.an = an;
        this.inhalt = inhalt;
    }

    @Override
    public void verarbeiten() {
        System.out.println("------ SEND E-MAIL ------");
        System.out.println("------ FROM: " + von);
        System.out.println("------ TO: " + an);
        System.out.println("------ BODY: " + inhalt);
        System.out.println();
    }
}
