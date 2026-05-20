package com.juego.patrones.factory;

import com.juego.model.Personaje;

import com.juego.patrones.builder.PersonajeBuilder;

import com.juego.patrones.strategy.DefensivoStrategy;

public class MagoFactory implements PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {

        return new PersonajeBuilder()
        .setNombre("Mago")
        .setPuntosDeVida(80)
        .setAtaque(40)
        .setDefensa(8)
        .setVelocidad(20)
        .setEstrategia(new DefensivoStrategy())
        .build();
    }
}