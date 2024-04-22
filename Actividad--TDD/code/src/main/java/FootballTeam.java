public class FootballTeam implements Comparable<FootballTeam> {
    int gamesWon;
    public FootballTeam(int gamesWon){
        if (gamesWon < 0){
                throw new IllegalArgumentException("No es posible tener menos de 0 juegos ganados");
        }
        this.gamesWon = gamesWon;
    }
    public int getGamesWon() {
        return gamesWon;
    }
    @Override
    public int compareTo(FootballTeam otherTeam){
        if (gamesWon > otherTeam.getGamesWon()) {
            return 1;
        } else if (gamesWon < otherTeam.getGamesWon()) {
            return -1;
        }
        return 0;
    }
}

