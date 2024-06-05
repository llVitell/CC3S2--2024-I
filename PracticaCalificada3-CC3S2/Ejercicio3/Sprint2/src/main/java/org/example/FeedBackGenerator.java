package org.example;

public class FeedBackGenerator implements IFeedBackGenerator{
    IWordSelector wordSelector = new WordSelector();
    IHintGenerator hintGenerator = new HintGenerator();
    int intentos = 10;
    Game game = new Game(wordSelector,hintGenerator,intentos);
    @Override
    public String generateFeedback(String guess) {
        if(wordSelector.selectWord().contains(guess)){
            return "Buen intento";
        }
        else{
            return "Mal intento";
        }
    }
}
