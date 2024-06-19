package org.example;

public class Map {
    public String[][] map;
    public int size;
    public Map(int size){
        this.size = size;
        this.map = new String[size][size];
    }
    public boolean isValidPosition(int x, int y){
        return true;
    }

    public void placeTower(Tower tower, int x, int y) {
        map[x][y] = "B";
    }
}
