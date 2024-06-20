package de.lubowiecki.uebung.fussball;

public class FlussballTest {

    public static void main(String[] args) {

        Spieler s1 = new Spieler("Chistiano", "Ronaldo", 12);
        Spieler s2 = new Spieler("Max", "Mustermann", 10);
        Spieler s3 = new Spieler("Peter", "Parker", 22);
        //System.out.println(s1);

        System.out.println();

        Team t1 = new Team("HSV", 20);
        t1.add(s1);
        t1.add(s3);
        t1.add(s2);

        t1.zeigeKader();
        System.out.println(t1.getName());

        System.out.println();

        Ball ball = new Ball();

        /*
        ball.setSpieler(s1); // Spieler s1 hat den Ball
        System.out.println(ball);

        ball.setSpieler(s2);
        System.out.println(ball);
        */

        s1.ballAnnehmen(ball);
        System.out.println(s1.hatBall());
        System.out.println(ball.getSpieler());

        System.out.println();

        s1.ballPassen(s2);
        System.out.println(s1.hatBall());
        System.out.println(s2.hatBall());
        System.out.println(ball.getSpieler());

        System.out.println();

        s2.ballPassen(s3);
        System.out.println(s2.hatBall());
        System.out.println(s3.hatBall());
        System.out.println(ball.getSpieler());
    }
}
