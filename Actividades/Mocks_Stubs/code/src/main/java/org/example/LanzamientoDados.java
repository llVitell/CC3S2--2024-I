package org.example;

public class LanzamientoDados {
    private NumerosAleatorios numerosAleatorios ;
    public LanzamientoDados(NumerosAleatorios numerosAleatorios){
        this.numerosAleatorios = numerosAleatorios;
    }
    public int lanzarDados(int min, int max){
       return numerosAleatorios.obtenerNumeroAleatorio(min,max);
    }
}
