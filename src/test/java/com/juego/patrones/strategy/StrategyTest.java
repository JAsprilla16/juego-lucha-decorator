package com.juego.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    @Test
    void agresivoDebeAumentarDano() {

        AgresivoStrategy estrategia =
                new AgresivoStrategy();

        int dano = estrategia.calcularDano(20);

        assertEquals(30, dano);
    }

    @Test
    void defensivoDebeReducirDano() {

        DefensivoStrategy estrategia =
                new DefensivoStrategy();

        int dano = estrategia.calcularDano(20);

        assertEquals(15, dano);
    }

    @Test
    void criticoDebeCalcularDano() {

        CriticoStrategy estrategia =
                new CriticoStrategy();

        int dano = estrategia.calcularDano(20);

        assertTrue(dano == 20 || dano == 40);
    }
}