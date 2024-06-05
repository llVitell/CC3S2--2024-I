package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    Game game;
    IWordSelector wordSelector;
    IHintGenerator hintGenerator;
    @BeforeEach
    public void start(){
        wordSelector = new WordSelector();
        hintGenerator = new HintGenerator();
        game = new Game(wordSelector,hintGenerator);
    }

    @Test
    public void wordSelectorShouldSelectAWord(){
        assertThat(wordSelector.selectWord()).isEqualTo("example");
    }

    @Test
    public void hintGeneratorShouldReturnAHint(){
        assertThat(hintGenerator.generateHint("test")).isEqualTo("The word has 4 letters");
    }
    @Test
    public void gameShouldStart(){
        assertThat(game.start()).isEqualTo(true);
    }


}