package io.github.hopbit.scoreboard.lib.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import io.github.hopbit.scoreboard.lib.exceptions.ExceptionMessage;
import io.github.hopbit.scoreboard.lib.model.enums.Country;

public class MatchTest {

    private static final Integer DEFAULT_VALUE = 0;

    @Test
    public void shouldCreateMatchWithDefaultValues() {
        Match match = new Match(Country.ARGENTINA, Country.BRAZIL);
        assertEquals(DEFAULT_VALUE, match.getScore().getHomeTeamScore());
        assertEquals(DEFAULT_VALUE, match.getScore().getAwayTeamScore());
    }

    @Test
    public void shouldThrowIfMatchHasSameCountries() {
        Match match = new Match(Country.ARGENTINA, Country.AUSTRALIA);
        assertThrows(IllegalArgumentException.class, () -> new Match(Country.ARGENTINA, Country.ARGENTINA), ExceptionMessage.MATCH_COUNTRIES_CANNOT_BE_THE_SAME);
        assertThrows(IllegalArgumentException.class, () -> {
            match.setAwayTeam(match.getHomeTeam());
            match.setHomeTeam(match.getAwayTeam());
        }, ExceptionMessage.MATCH_COUNTRIES_CANNOT_BE_THE_SAME);
    }
}
