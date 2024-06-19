package org.example;

import java.util.List;

public class Tower implements TowerFactory{
    private int damage;
    private int range;
    private int fireRate;

    public Tower(int damage, int range, int fireRate){
        this.damage = damage;
        this.range = range;
        this.fireRate = fireRate;
    }
    public int getDamage() {
        return damage;
    }
    public int getFireRate() {
        return fireRate;
    }
    public int getRange() {
        return range;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }
    public void setRange(int range) {
        this.range = range;
    }
    @Override
    public boolean attack(List<Enemy> enemies){
        return true;
    }
}
