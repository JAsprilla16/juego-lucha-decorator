package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.builder.PersonajeBuilder;

import com.juego.patrones.strategy.AgresivoStrategy;

public class GuerreroFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new PersonajeBuilder()
        .setNombre("Guerrero")
        .setPuntosDeVida(120)
        .setAtaque(25)
        .setDefensa(15)
        .setVelocidad(10)
        .setEstrategia(new AgresivoStrategy())
        .build();
    }
}