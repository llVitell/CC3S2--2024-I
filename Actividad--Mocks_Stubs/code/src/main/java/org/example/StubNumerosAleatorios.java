package org.example;

public class StubNumerosAleatorios implements NumerosAleatorios{
    public int RESULT = 0;
    @Override
    public int obtenerNumeroAleatorio(int min, int max) {
        return RESULT;
    }
}
