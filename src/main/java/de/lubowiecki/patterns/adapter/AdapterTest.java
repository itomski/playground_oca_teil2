package de.lubowiecki.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        // Zwei Klassen die zueinender nicht kompatibel sind, können durch einen Adapter
        // mit einander interagieren

        Server server = new Server();

        EMail eMail = new EMail("peter.parker@shild.org", "bruce.banner@schield.org", "Es geht los...");
        server.versenden(eMail);

        SMS sms = new SMS("0172/33445566", "0161/889900123", "Das ist ja klasse! Das sollten wir auf jeden Fall machen, wenn du wieder in Hamburg bist! Oma wird sich freuen.");
        server.versenden(sms);

        Tweet tweet = new Tweet("Peter Parker", "#montag", "Montag früh...", "Bla bla bla...");
        //server.versenden(tweet);
        server.versenden(new TweetZuNachrichtAdapter(tweet));

    }
}
