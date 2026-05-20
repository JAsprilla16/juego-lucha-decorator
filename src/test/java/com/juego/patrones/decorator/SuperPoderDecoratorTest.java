package com.juego.patrones.decorator;

import com.juego.model.ICombatiente;
import com.juego.model.Personaje;
import com.juego.patrones.strategy.CriticoStrategy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SuperPoderDecoratorTest {

    @Test
    void superPoderDebeAtacar() {

        Personaje personaje = new Personaje(
                "Ninja",
                100,
                25,
                5,
                10,
                new CriticoStrategy()
        );

        ICombatiente enemigo = mock(ICombatiente.class);

        SuperPoderDecorator superPoder =
                new SuperPoderDecorator(personaje);

        superPoder.atacar(enemigo);

        verify(enemigo, atLeastOnce()).recibirDano(anyInt());
    }
}