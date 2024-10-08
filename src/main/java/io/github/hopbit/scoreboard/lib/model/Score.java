package io.github.hopbit.scoreboard.lib.model;

import io.github.hopbit.scoreboard.lib.exceptions.ExceptionMessage;
import io.github.hopbit.scoreboard.lib.exceptions.ValidateException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Score {
    private Integer homeTeamScore = 0;
    private Integer awayTeamScore = 0;

    public Score(Integer homeTeamScore, Integer awayTeamScore) {
        if (homeTeamScore < 0 || awayTeamScore < 0) {
            throw new ValidateException(ExceptionMessage.SCORE_CANNOT_BE_LESS_THEN_ZERO);
        }
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

}
