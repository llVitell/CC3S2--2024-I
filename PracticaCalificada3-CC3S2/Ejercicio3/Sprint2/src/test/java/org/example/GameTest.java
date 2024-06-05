package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GameTest {
    Game game;
    IWordSelector wordSelector;
    IHintGenerator hintGenerator;
    IFeedBackGenerator feedBackGenerator;
    int intentos = 10;

    @BeforeEach
    void start(){
        wordSelector = new WordSelector();
        hintGenerator = new HintGenerator();
        feedBackGenerator = new FeedBackGenerator();
        game = new Game(wordSelector,hintGenerator,intentos);
    }

    @Test
    void wordSelectorShouldSelectAWord(){
        assertThat(wordSelector.selectWord()).isEqualTo("example");
    }

    @Test
    void hintGeneratorShouldReturnAHint(){
        assertThat(hintGenerator.generateHint("test")).isEqualTo("The word has 4 letters");
    }
    @Test
    void feedBackGeneratorShouuldReturnFeedback(){
        assertThat(feedBackGenerator.generateFeedback("r")).isEqualTo("feedback");
    }

}