package org.example;

import org.example.towers.TowerFactory;

import java.util.Collections;
import java.util.List;

public class Tower{
    private int damage;
    private int range;
    private int fireRate;
    private int x;
    private int y;
    public Tower(int damage, int range, int fireRate){
        this.damage = damage;
        this.range = range;
        this.fireRate = fireRate;
    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void attack(List<Enemy> enemies) {
        // Precondicion
        if(enemies.isEmpty()){
            throw new IllegalArgumentException("No puede ser una lista vacia");
        }

        for(Enemy enemy: enemies){
            double distance = Math.sqrt(Math.pow(this.x - enemy.getX(),2)+Math.pow(this.y-enemy.getY(),2));
            if(distance <= this.range){
                enemy.setHealth(enemy.getHealth()-this.damage);
            }
        }
        // Postcondicion
        for(Enemy enemy: enemies){
            double distance = Math.sqrt(Math.pow(this.x - enemy.getX(),2)+Math.pow(this.y-enemy.getY(),2));
            if(distance <= this.range){
                int previousHealth = 100;
                int expectedHealth = previousHealth - this.damage;
                if(enemy.getHealth() != expectedHealth){
                    throw new IllegalArgumentException("No se ataca");
                }
            }
        }
    }
}
