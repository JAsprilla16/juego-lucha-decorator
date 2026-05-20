package com.juego.patrones.factory;

import com.juego.model.Personaje;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void guerreroFactoryDebeCrearPersonaje() {
        Personaje personaje = new GuerreroFactory().crearPersonaje();

        assertEquals("Guerrero", personaje.getNombre());
    }

    @Test
    void ninjaFactoryDebeCrearPersonaje() {
        Personaje personaje = new NinjaFactory().crearPersonaje();

        assertEquals("Ninja", personaje.getNombre());
    }

    @Test
    void magoFactoryDebeCrearPersonaje() {
        Personaje personaje = new MagoFactory().crearPersonaje();

        assertEquals("Mago", personaje.getNombre());
    }
}