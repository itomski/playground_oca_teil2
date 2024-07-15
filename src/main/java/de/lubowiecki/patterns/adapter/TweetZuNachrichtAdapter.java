package de.lubowiecki.patterns.adapter;

public class TweetZuNachrichtAdapter implements Nachricht {

    private Tweet tweet;

    public TweetZuNachrichtAdapter(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public void verarbeiten() {
        // tweet.posten();
        System.out.println("------ SEND NACHRICHT ------");
        System.out.println("------ FROM: " + tweet.getAutor());
        System.out.println("------ TO: " + tweet.getGruppe());
        System.out.println("------ BODY: " + tweet.getTitel() + "\n" + tweet.getInhalt());
        System.out.println();

    }
}
