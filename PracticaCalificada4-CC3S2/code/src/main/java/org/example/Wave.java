package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.EnemyFactory.BasicEnemy;
import static org.example.EnemyFactory.BossEnemy;

public class Wave {
    private List<Enemy> enemies;
    private int waveNumber;
    public Wave (int waveNumber){
        this.waveNumber = waveNumber;
        this.enemies = generateEnemies(waveNumber);
    }
    private List<Enemy> generateEnemies(int waveNumber){
        List<Enemy> enemies = new ArrayList<>();
        for (int i=0; i<waveNumber*5; i++){
            enemies.add(enemyFactory.BasicEnemy());
            if (i % 5 == 0){
                enemies.add(new BossEnemy);
            }
        }
        return enemies;
    }

    public void spawnEnemies(){

    }
}
