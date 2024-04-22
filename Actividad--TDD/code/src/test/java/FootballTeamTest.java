import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
public class FootballTeamTest {
    private static final int GAMES_WON = 5;
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(GAMES_WON);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(GAMES_WON);
    }
}

