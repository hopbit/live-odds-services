package io.github.hopbit.scoreboard.lib.model;

import io.github.hopbit.scoreboard.lib.exceptions.ExceptionMessage;
import io.github.hopbit.scoreboard.lib.exceptions.ValidateException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ScoreTest {

    @Test
    public void shouldThrowIfScoreIsLessThenZero() {
        assertThrows(ValidateException.class, () -> new Score(-1, 0), ExceptionMessage.SCORE_CANNOT_BE_LESS_THEN_ZERO);
        assertThrows(ValidateException.class, () -> new Score(0, -1), ExceptionMessage.SCORE_CANNOT_BE_LESS_THEN_ZERO);
        assertThrows(ValidateException.class, () -> new Score(-1, -1), ExceptionMessage.SCORE_CANNOT_BE_LESS_THEN_ZERO);
    }
}
