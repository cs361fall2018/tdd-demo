package cs361;

public class Game {

    private int currentScore = 0;

    public int score(int roll) {
        currentScore += roll;
        return currentScore;
    }

}
