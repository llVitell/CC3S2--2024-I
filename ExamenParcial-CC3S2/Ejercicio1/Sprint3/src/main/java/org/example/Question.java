package org.example;
public class Question {
    public String description;
    public String[] options;
    public String correctAnswer;

    public Question(String description, String[] options, String correctAnswer){
        this.description = description;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
