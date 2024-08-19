package io.github.hopbit.scoreboard.lib.model;

import java.time.LocalDateTime;
import java.util.Objects;

import io.github.hopbit.scoreboard.lib.exceptions.ExceptionMessage;
import io.github.hopbit.scoreboard.lib.model.enums.Country;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Match {

    @NonNull
    private Country homeTeam;
    @NonNull
    private Country awayTeam;
    private Score score = new Score();
    private LocalDateTime startDate = LocalDateTime.now();

    public Match(@NonNull Country homeTeam, @NonNull Country awayTeam) {
        if (homeTeam == awayTeam) {
            throw new IllegalArgumentException(ExceptionMessage.MATCH_COUNTRIES_CANNOT_BE_THE_SAME);
        }
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void setHomeTeam(Country homeTeam) {
        if (homeTeam == getAwayTeam()) {
            throw new IllegalArgumentException(ExceptionMessage.MATCH_COUNTRIES_CANNOT_BE_THE_SAME);
        }
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Country awayTeam) {
        if (getHomeTeam() == awayTeam) {
            throw new IllegalArgumentException(ExceptionMessage.MATCH_COUNTRIES_CANNOT_BE_THE_SAME);
        }
        this.awayTeam = awayTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Match match = (Match) o;
        return getHomeTeam().equals(match.getHomeTeam()) &&
                getAwayTeam().equals(match.getAwayTeam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam, score, startDate);
    }
}
