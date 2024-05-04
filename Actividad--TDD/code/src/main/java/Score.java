public class Score {
    private final String correct;
    private Letter resultado;

    public Score(String correct) {
        this.correct = correct;
    }
    public Letter letter(){
        return resultado;
    }

    public void assess(int position, String attempt){
        if(correct.charAt(position) == attempt.charAt(position)){
            resultado = Letter.CORRECT;
        }
        else { resultado = Letter.INCORRECT ;
        }
    }
}
