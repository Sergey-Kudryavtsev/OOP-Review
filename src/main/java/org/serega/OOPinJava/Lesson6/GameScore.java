package org.serega.OOPinJava.Lesson6;

public class GameScore {
    protected static int totalScore = 0;

    public static void addPoints(int points) {
        totalScore += points;
        System.out.println("Количество очков добавлено: " + points + "\nОбщий счет: " + totalScore);
        System.out.println("");
    }
    public static int getTotalScore() {
        return totalScore;
    }
}
