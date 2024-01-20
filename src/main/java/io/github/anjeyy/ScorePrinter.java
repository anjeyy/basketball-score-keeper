package io.github.anjeyy;

public class ScorePrinter {

    private ScorePrinter() {
        throw new UnsupportedOperationException("No instance allowed.");
    }

    public static String pretty(int score) {
        String scoreAsString = String.valueOf(score);
        int zeroPaddingLength = Math.max(0, 3 - scoreAsString.length());
        String zeroPaddings = "0".repeat(zeroPaddingLength);
        return zeroPaddings + scoreAsString;
    }
}
