package io.github.anjeyy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ScorePrinterTest {

    @Test
    void shouldPrettyPrintBasketballSingleScore() {
        String doubleScore = ScorePrinter.printScore(0, 1);
        Assertions.assertThat(doubleScore).isEqualTo("000:001");
    }

    @Test
    void shouldPrettyPrintBasketballDoubleScore() {
        String doubleScore = ScorePrinter.printScore(8, 21);
        Assertions.assertThat(doubleScore).isEqualTo("008:021");
    }

    @Test
    void shouldPrettyPrintBasketballTripleScore() {
        String doubleScore = ScorePrinter.printScore(98, 101);
        Assertions.assertThat(doubleScore).isEqualTo("098:101");
    }

}
