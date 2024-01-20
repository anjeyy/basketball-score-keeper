package io.github.anjeyy;

public class ScoreKeeper {

    private int teamScoreA = 0;
    private int teamScoreB = 0;

    private ScoreKeeper() {}


    public static ScoreKeeper start() {
        return new ScoreKeeper();
    }

    public String score() {
        String prettyTeamScoreA = prettyPrint(teamScoreA);
        String prettyTeamScoreB = prettyPrint(teamScoreB);
        return "%s:%s".formatted(prettyTeamScoreA, prettyTeamScoreB);
    }

    private String prettyPrint(int score) {
        String scoreAsString = String.valueOf(score);
        StringBuilder stringBuilder = new StringBuilder(3);
        for (int i = scoreAsString.length(); i < 3; i++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(scoreAsString);
        return stringBuilder.toString();
    }

    public void scoreTeamA1() {
        teamScoreA = teamScoreA + 1;
    }

    public void scoreTeamA2() {
        teamScoreA = teamScoreA + 2;
    }

    public void scoreTeamA3() {
        teamScoreA = teamScoreA + 3;
    }

    public void scoreTeamB1() {
        teamScoreB = teamScoreB + 1;
    }

    public void scoreTeamB2() {
        teamScoreB = teamScoreB + 2;
    }

    public void scoreTeamB3() {
        teamScoreB = teamScoreB + 3;
    }
}
