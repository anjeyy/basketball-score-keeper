package io.github.anjeyy;

public class BasketballScore {

    private int score = 0;

    private BasketballScore() {}

    public static BasketballScore create() {
        return new BasketballScore();
    }

    public void freeThrow() {
        score += 1;
    }

    public void twoPointFieldGoal() {
        score += 2;
    }

    public void threePointFieldGoal() {
        score += 3;
    }

    public int score() {
        return score;
    }
}
