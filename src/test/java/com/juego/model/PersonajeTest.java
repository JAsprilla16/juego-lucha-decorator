package com.juego.model;

import com.juego.patrones.strategy.AgresivoStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void personajeDebeCrearseCorrectamente() {

        Personaje personaje = new Personaje(
                "Guerrero",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        assertEquals("Guerrero", personaje.getNombre());
        assertEquals(100, personaje.getPuntosDeVida());
    }

    @Test
    public void personajeDebeRecibirDano() {

        Personaje personaje = new Personaje(
                "Ninja",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        personaje.recibirDano(30);

        assertEquals(80, personaje.getPuntosDeVida());
    }

    @Test
    public void personajeDebeMorir() {

        Personaje personaje = new Personaje(
                "Mago",
                50,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        personaje.recibirDano(80);

        assertFalse(personaje.estaVivo());
    }
}