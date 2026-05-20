package com.juego.patrones.builder;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AgresivoStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    void builderDebeCrearPersonajeCorrectamente() {

        Personaje personaje = new PersonajeBuilder()
                .setNombre("Kratos")
                .setPuntosDeVida(100)
                .setAtaque(20)
                .setDefensa(10)
                .setVelocidad(5)
                .setEstrategia(new AgresivoStrategy())
                .build();

        assertEquals("Kratos", personaje.getNombre());
        assertEquals(100, personaje.getPuntosDeVida());
    }
}