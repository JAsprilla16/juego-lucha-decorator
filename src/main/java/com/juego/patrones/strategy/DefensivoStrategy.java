package com.juego.patrones.strategy;

public class DefensivoStrategy implements EstrategiaAtaque {

    @Override
    public int calcularDano(int ataqueBase) {

        return ataqueBase - 5;
    }
}