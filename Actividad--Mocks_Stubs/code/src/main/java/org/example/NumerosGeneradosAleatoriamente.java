package org.example;
import java.util.Random;
public class NumerosGeneradosAleatoriamente implements NumerosAleatorios{
    private Random random;
    @Override
    public int obtenerNumeroAleatorio(int min, int max) {
        if(min>max){
            throw new IllegalArgumentException("Rango inválido");
        }
        return random.nextInt((max-min)+1)+min;
    }
}
