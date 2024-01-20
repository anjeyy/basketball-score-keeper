package io.github.anjeyy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreKeeperTest {

    @Test
    void shouldDisplayScore() {
        ScoreKeeper scoreKeeper = ScoreKeeper.start();
        String actualScore = scoreKeeper.score();

        Assertions.assertThat(actualScore).isEqualTo("000:000");
    }

    @Test
    void scoreTeamA() {
        ScoreKeeper scoreKeeper = ScoreKeeper.start();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA3();

        String actualScore = scoreKeeper.score();
        Assertions.assertThat(actualScore).isEqualTo("006:000");
    }

    @Test
    void scoreTeamB() {
        ScoreKeeper scoreKeeper = ScoreKeeper.start();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB3();

        String actualScore = scoreKeeper.score();
        Assertions.assertThat(actualScore).isEqualTo("000:006");
    }

    @Test
    void shouldDisplayScoreFromGame() {
        ScoreKeeper scoreKeeper = ScoreKeeper.start();

        scoreKeeper.scoreTeamA2();

        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamB3();

        scoreKeeper.scoreTeamA3();

        String actualScore = scoreKeeper.score();
        Assertions.assertThat(actualScore).isEqualTo("005:008");
    }

}
