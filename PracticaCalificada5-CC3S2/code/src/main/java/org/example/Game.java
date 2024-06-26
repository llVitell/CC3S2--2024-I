package org.example;

import java.util.List;
import java.util.Scanner;

public class Game {
    Map map;
    Wave wave;
    Player player;
    List<Enemy> enemies;
    public Game(Map map, Player player){
        this.map = map;
        this.player = player;
    }
    public void placeTower(Tower tower, int x, int y){
        if (map.isValidPosition(x, y)) {
            map.placeTower(tower, x, y);
        }
    }
    public void showMap(){
        map.showMap();
    }
    public void setWave(Wave wave) {
        this.wave = wave;
    }
    public void startWave() {
        this.enemies = wave.generateEnemies();
    }
    public List<Enemy> getEnemies() {
        return enemies;
    }
    public static void main (String[] args){
        Map map = new Map();
        Player player = new Player();
        Game game = new Game(map,player);
        game.showMap();
        System.out.println("Puntuación: " + player.getScore());
        System.out.println("Vida de la base: " + player.getBaseHealth());
    }
}
