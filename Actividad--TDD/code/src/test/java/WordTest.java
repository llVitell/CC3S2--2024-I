import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("pruebas");
        var score = word.guess("p");
        var result = score.letter();
        assertThat(result).isEqualTo(Letter.CORRECT);
    }
}


