package org.serega.OOPinJava.Lesson6;

public class Player {
    private String name;
    private int personalScore;

    public Player(String name, int personalScore) {
        this.name = name;
        this.personalScore = personalScore;
        System.out.println("Имя: " + name + " Личный счет: " + personalScore);
        GameScore.addPoints(personalScore);
    }
}
