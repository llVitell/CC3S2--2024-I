package org.example;

public interface EnemyFactory {
    Enemy BossEnemy = new Enemy(1,100,50);
    Enemy BasicEnemy = new Enemy(1,50,10);
    Enemy FastEnemy = new Enemy(5,20,20);
}
