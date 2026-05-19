package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.strategy.AgresivoStrategy;

public class GuerreroFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje(
                "Guerrero",
                120,
                25,
                15,
                10,
                new AgresivoStrategy()
        );
    }
}