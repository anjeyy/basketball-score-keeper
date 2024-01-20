package io.github.anjeyy;

public class ScoreKeeper {

    private final BasketballScore homeTeamScore;
    private final BasketballScore awayTeamScore;

    private ScoreKeeper() {
        homeTeamScore = BasketballScore.create();
        awayTeamScore = BasketballScore.create();
    }


    public static ScoreKeeper start() {
        return new ScoreKeeper();
    }

    public String score() {
        return ScorePrinter.printScore(homeTeamScore.score(), awayTeamScore.score());
    }

    public void scoreTeamA1() {
        homeTeamScore.freeThrow();
    }

    public void scoreTeamA2() {
        homeTeamScore.twoPointFieldGoal();
    }

    public void scoreTeamA3() {
        homeTeamScore.threePointFieldGoal();
    }

    public void scoreTeamB1() {
        awayTeamScore.freeThrow();
    }

    public void scoreTeamB2() {
        awayTeamScore.twoPointFieldGoal();
    }

    public void scoreTeamB3() {
        awayTeamScore.threePointFieldGoal();
    }
}
