package com.juego.patrones.strategy;

import java.util.Random;

public class CriticoStrategy implements EstrategiaAtaque {

    @Override
    public int calcularDano(int ataqueBase) {

        Random rand = new Random();

        boolean critico = rand.nextBoolean();

        if (critico) {

            System.out.println("💥 ¡Golpe crítico!");

            return ataqueBase * 2;
        }

        return ataqueBase;
    }
}