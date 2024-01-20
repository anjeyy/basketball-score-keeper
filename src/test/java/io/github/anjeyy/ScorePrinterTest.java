package io.github.anjeyy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ScorePrinterTest {

    @Test
    void shouldPrettyPrintBasketballSingleScore() {
        String singleScore = ScorePrinter.pretty(0);
        Assertions.assertThat(singleScore).isEqualTo("000");
    }

    @Test
    void shouldPrettyPrintBasketballDoubleScore() {
        String doubleScore = ScorePrinter.pretty(12);
        Assertions.assertThat(doubleScore).isEqualTo("012");
    }

    @Test
    void shouldPrettyPrintBasketballTripleScore() {
        String doubleScore = ScorePrinter.pretty(112);
        Assertions.assertThat(doubleScore).isEqualTo("112");
    }
}
