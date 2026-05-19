package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.strategy.CriticoStrategy;

public class NinjaFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje(
                "Ninja",
                90,
                30,
                10,
                25,
                new CriticoStrategy()
        );
    }
}