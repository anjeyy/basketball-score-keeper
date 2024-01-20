package io.github.anjeyy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketballScoreTest {

    @Test
    void shouldReturnScoreOfFreeThrow() {
        BasketballScore basketballScore = BasketballScore.create();

        basketballScore.freeThrow();
        int actualScore = basketballScore.score();

        Assertions.assertThat(actualScore).isEqualTo(1);
    }

    @Test
    void shouldReturnScoreOfTwoPointFieldGoal() {
        BasketballScore basketballScore = BasketballScore.create();

        basketballScore.twoPointFieldGoal();
        int actualScore = basketballScore.score();

        Assertions.assertThat(actualScore).isEqualTo(2);
    }

    @Test
    void shouldReturnScoreOfThreePointFieldGoal() {
        BasketballScore basketballScore = BasketballScore.create();

        basketballScore.threePointFieldGoal();
        int actualScore = basketballScore.score();

        Assertions.assertThat(actualScore).isEqualTo(3);
    }

}
