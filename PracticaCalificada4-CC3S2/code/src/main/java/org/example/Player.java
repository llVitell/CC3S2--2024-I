package org.example;

public class Player {
    private int score;
    private int baseHealth;
    public Player(){
        this.score = 0;
        this.baseHealth = 100;
    }
    public void setScore(int points){
        this.score += points;
    }
    public int getScore(){
        return score;
    }
    public void deductHealth(int damage){
        this.baseHealth -= damage;
    }
    public int getBaseHealth(){
        return baseHealth;
    }
    public void updateScoreAndHealth(Enemy enemy, boolean defeated){

    }
}
