import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    @Test
    public void oneIncorrectLetter() {
        // Arrange
        var word = new Word("A");
        var score = word.guess("Z");
        var result = score.letter(0);

        // Act

        word.guess("Z");
        // Assert
        assertThat(result).isEqualTo(Letter.INCORRECT);
    }
}
