package io.github.anjeyy;

public class ScorePrinter {

    private ScorePrinter() {
        throw new UnsupportedOperationException("No instance allowed.");
    }

    public static String printScore(BasketballScore homeTeam, BasketballScore awayTeam) {
        return printScore(homeTeam.score(), awayTeam.score());
    }

    public static String printScore(int homeTeam, int awayTeam) {
        String prettyTeamScoreA = pretty(homeTeam);
        String prettyTeamScoreB = pretty(awayTeam);
        return "%s:%s".formatted(prettyTeamScoreA, prettyTeamScoreB);
    }

    private static String pretty(int score) {
        String scoreAsString = String.valueOf(score);
        int zeroPaddingLength = Math.max(0, 3 - scoreAsString.length());
        String zeroPaddings = "0".repeat(zeroPaddingLength);
        return zeroPaddings + scoreAsString;
    }

}
