package de.lubowiecki.patterns.adapter;

public class Tweet {

    private String autor;
    private String gruppe;
    private String titel;
    private String inhalt;

    public Tweet(String autor, String gruppe, String titel, String inhalt) {
        this.autor = autor;
        this.gruppe = gruppe;
        this.titel = titel;
        this.inhalt = inhalt;
    }

    public void posten() {
        System.out.println("------ POSTE TWEET ------");
        System.out.println("------ AUTOR: " + autor);
        System.out.println("------ GRUPPE: " + gruppe);
        System.out.println("------ TITEL: " + titel);
        System.out.println("------ INHALT: " + inhalt);
        System.out.println();
    }

    public String getAutor() {
        return autor;
    }

    public String getGruppe() {
        return gruppe;
    }

    public String getTitel() {
        return titel;
    }

    public String getInhalt() {
        return inhalt;
    }
}
