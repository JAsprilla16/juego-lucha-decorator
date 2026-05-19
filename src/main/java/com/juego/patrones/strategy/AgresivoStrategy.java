package com.juego.patrones.strategy;

public class AgresivoStrategy implements EstrategiaAtaque {

    @Override
    public int calcularDano(int ataqueBase) {

        return ataqueBase + 10;
    }
}