package org.example;

public class Enemy implements EnemyFactory{
    private int speed;
    private int health;
    private int reward;
    public Enemy(int speed, int health, int reward) {
        this.speed = speed;
        this.health = health;
        this.reward = reward;
    }
    public int getHealth() {
        return health;
    }
    public int getSpeed() {
        return speed;
    }
    public int getReward() {
        return reward;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setReward(int reward) {
        this.reward = reward;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
