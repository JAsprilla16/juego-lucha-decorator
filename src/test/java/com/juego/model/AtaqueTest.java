package com.juego.model;

import com.juego.patrones.strategy.AgresivoStrategy;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AtaqueTest {

    @Test
    void personajeDebeAtacarAOponente() {

        Personaje atacante = new Personaje(
                "Guerrero",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        ICombatiente oponente = mock(ICombatiente.class);

        atacante.atacar(oponente);

        verify(oponente, atLeastOnce()).recibirDano(anyInt());
    }
}