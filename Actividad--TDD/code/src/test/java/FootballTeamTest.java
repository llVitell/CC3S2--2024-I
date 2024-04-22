import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FootballTeamTest {
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 3, 10 })
    void constructorShouldSetGamesWon(int nbOfGamesWon){
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }

    @ParameterizedTest
    @ValueSource(ints ={-10,-1})
    void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames){
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {new FootballTeam(illegalNbOfGames);});
    }

    private static final int ANY_NUMBER = 123;
    @Test
    void shouldBePossibleToCompareTeams(){
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertThat(team).isInstanceOf(Comparable.class);
    }

    @Test
    void teamsWithMoreMatchesWonShouldBeGreater(){
        FootballTeam team1 = new FootballTeam(2);
        FootballTeam team2 = new FootballTeam(3);
        assertThat(team2.compareTo(team1)).isGreaterThan(0);
    }

    @Test
    void teamsWithLessMatchesWonShouldBeLesser(){
        FootballTeam team1 = new FootballTeam(2);
        FootballTeam team2 = new FootballTeam(3);
        assertThat(team1.compareTo(team2)).isLessThan(0);
    }

    @Test
    void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);
        assertThat(teamA.compareTo(teamB))
                .isEqualTo(0);
    }

}