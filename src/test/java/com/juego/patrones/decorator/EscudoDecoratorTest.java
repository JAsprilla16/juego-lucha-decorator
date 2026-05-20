package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.DefensivoStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EscudoDecoratorTest {

    @Test
    void escudoDebeReducirDanio() {

        Personaje personaje = new Personaje(
                "Mago",
                100,
                15,
                10,
                5,
                new DefensivoStrategy()
        );

        EscudoDecorator escudo = new EscudoDecorator(personaje);

        escudo.recibirDano(20);

        assertTrue(escudo.getPuntosDeVida() > 80);
    }
}