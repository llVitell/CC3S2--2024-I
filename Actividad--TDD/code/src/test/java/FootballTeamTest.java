import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FootballTeamTest {
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 3, 10 })
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }
}