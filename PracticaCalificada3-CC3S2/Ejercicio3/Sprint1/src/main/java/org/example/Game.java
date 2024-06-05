package org.example;

public class Game {
    private IWordSelector wordSelector;
    private IHintGenerator hintGenerator;

    public Game(IWordSelector wordSelector, IHintGenerator hintGenerator){
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
    }
    public boolean start(){
        String word = wordSelector.selectWord();
        String hint = hintGenerator.generateHint(word);
        if(hint == null || word == null){
            throw new IllegalArgumentException("No se pudo inicializar la partida");
        }
       else{
            return true;
        }
    }

    public static void main(String[] args){
        IWordSelector wordSelector = new WordSelector();
        IHintGenerator hintGenerator = new HintGenerator();
        Game game = new Game(wordSelector,hintGenerator);
        game.start();
    }
}
