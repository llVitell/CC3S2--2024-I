import org.example.Question;
import org.example.Quiz;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    public void quiestionsLoadedCorrectly(){
        // Arrange
        Quiz quizTest = new Quiz();
        // Act
        Question questionTest = new Question("Cual es la capital de Francia", new String[]{"Madrid", "Londres", "Paris"},"Paris");
        quizTest.loadQuestion(questionTest);
        // Assert
        assertThat(quizTest).isNotNull();
    }

    @Test
    public void answerValidatedCorrectly(){
        // Arrange & Act
        Question questionTest = new Question("Cual es la capital de Francia", new String[]{"Madrid", "Londres", "Paris"},"Paris");
        // Assert
        assertThat(questionTest.correctAnswer).isEqualTo("Paris");
    }

    @Test
    public void scorePrecisionSystem(){
        // Arrange
        Quiz quizTest = new Quiz();
        Question questionTest = new Question("Cual es la capital de Francia", new String[]{"Madrid", "Londres", "Paris"},"Paris");
        // Act
        quizTest.loadQuestion(questionTest);
        quizTest.checkAnswer();
        // Assert
        assertThat(Quiz.score).isEqualTo(1);
    }
    @Test
    public void showResultsShouldWork(){
        // Arrange
        Quiz quizTest = new Quiz();
        Question questionTest = new Question("Cual es la capital de Francia", new String[]{"Madrid", "Londres", "Paris"},"Paris");
        // Act
        quizTest.loadQuestion(questionTest);
        quizTest.checkAnswer();
        quizTest.showResults();
        // Assert
        assertThat(quizTest.showResults()).isEqualTo(Quiz.score);
    }
}
