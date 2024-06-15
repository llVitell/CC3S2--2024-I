public class Word {

    private final String word;

    public Word(String correctWord) {
        this.word = correctWord;
    }

    public Score guess(String attempt) {
        var score = new Score(attempt);
        score.assess(attempt);
        System.out.println(score);
        return score;
    }
}
