package org.example;

import java.util.Scanner;

public class Game {
    private IWordSelector wordSelector;
    private IHintGenerator hintGenerator;
    private int intentos;

    public Game(IWordSelector wordSelector, IHintGenerator hintGenerator, int intentos){
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
        this.intentos = intentos;
    }
    public void start(){
        String word = wordSelector.selectWord();
        String hint = hintGenerator.generateHint(word);
        System.out.println("Pista: " + hint);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IWordSelector wordSelector = new WordSelector();
        IHintGenerator hintGenerator = new HintGenerator();
        IFeedBackGenerator feedBackGenerator = new FeedBackGenerator();
        int intentos = 10;
        Game game = new Game(wordSelector,hintGenerator, intentos);
        game.start();
        System.out.println("Adivina una letra: ");
        do {
            String guess = scanner.nextLine();
            intentos--;
            System.out.println("Feedback: " + feedBackGenerator.generateFeedback(guess));
        }while (intentos >= 0);

    }
}
