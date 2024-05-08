import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        assertScoreForGuess(score, Letter.INCORRECT);
    }
    @Test
    public void oneCorrectLetter(){
        var word = new Word("A");
        var score = word.guess("A");
        assertScoreForGuess(score,Letter.CORRECT);
    }
    @Test
    public void secondLetterWrongPosition(){
        var word = new Word("AR");
        var score = word.guess("ZA");
        assertScoreForGuess(score,Letter.INCORRECT,Letter.PART_CORRECT);
    }
    @Test
    public void allScoreCombinations(){
        var word = new Word("ARI");
        var score = word.guess("ZAI");
        assertScoreForGuess(score,Letter.INCORRECT,Letter.PART_CORRECT,Letter.CORRECT);
    }
    private void assertScoreForGuess(Score score, Letter... expectedScores){
        for(int position=0; position < expectedScores.length;position++){
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}


