package com.juego.patrones.decorator;

import com.juego.model.ICombatiente;
import com.juego.model.Personaje;
import com.juego.patrones.strategy.AgresivoStrategy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class EspadaDecoratorTest {

    @Test
    void espadaDebeAumentarAtaque() {

        Personaje personaje = new Personaje(
                "Guerrero",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        ICombatiente enemigo = mock(ICombatiente.class);

        EspadaDecorator espada = new EspadaDecorator(personaje);

        espada.atacar(enemigo);

        verify(enemigo, atLeastOnce()).recibirDano(anyInt());
    }
}