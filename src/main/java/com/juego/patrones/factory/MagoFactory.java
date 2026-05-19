package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.strategy.DefensivoStrategy;

public class MagoFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje(
                "Mago",
                80,
                35,
                8,
                20,
                new DefensivoStrategy()
        );
    }
}