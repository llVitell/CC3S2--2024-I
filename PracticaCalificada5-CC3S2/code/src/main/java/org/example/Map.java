package org.example;

public class Map {
    private char[][] map = {
            {' ', ' ', 'C', ' ', ' '},
            {' ', 'C', ' ', ' ', ' '},
            {'C', ' ', ' ', 'C', 'B'},
            {' ', ' ', 'C', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '}
    };
    public boolean isValidPosition(int x, int y) {
        return x >= 0 && y >= 0 && x < map.length && y < map[0].length && map[x][y] == ' ';
    }
    public void placeTower(Tower tower,int x, int y){
        if(isValidPosition(x,y)){
            map[x][y] = 'T';
        }
    }
    public void showMap() {
        StringBuilder mapOutput = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                mapOutput.append("'").append(map[i][j]).append("' ");
            }
            mapOutput.append("\n");
        }
        System.out.print(mapOutput.toString());
    }
}
