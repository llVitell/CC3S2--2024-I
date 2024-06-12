package org.example;

public class Main {
    public static void main (String[] args){
        NumerosAleatorios generador = new NumerosGeneradosAleatoriamente();
        LanzamientoDados game = new LanzamientoDados(generador);
        game.lanzarDados(0,6);
    }
}
