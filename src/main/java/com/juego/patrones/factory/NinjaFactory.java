package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.builder.PersonajeBuilder;

import com.juego.patrones.strategy.CriticoStrategy;

public class NinjaFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new PersonajeBuilder()
        .setNombre("Ninja")
        .setPuntosDeVida(90)
        .setAtaque(35)
        .setDefensa(10)
        .setVelocidad(25)
        .setEstrategia(new CriticoStrategy())
        .build();
    }
}