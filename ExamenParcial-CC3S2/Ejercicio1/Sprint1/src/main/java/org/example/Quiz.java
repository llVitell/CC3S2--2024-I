package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Quiz {
    private final List<Question> questions = new ArrayList<>();
    public static int score = 0;
    public void loadQuestion(Question question){
        questions.add(question);
    }
    public void showQuestions(){
        System.out.println(questions);
    }
    public void checkAnswer(){
        var userInput = "Paris";
        if(questions.get(0).correctAnswer.equals(userInput)){
            score++;
        } else {
            System.out.println("Respuesta incorrecta");
        }
    }
    public int showResults(){
        return score;
    }
}
