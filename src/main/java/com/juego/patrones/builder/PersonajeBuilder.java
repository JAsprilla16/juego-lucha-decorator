package com.juego.patrones.builder;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.EstrategiaAtaque;

public class PersonajeBuilder {

    private String nombre;
    private int puntosDeVida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private EstrategiaAtaque estrategia;

    public PersonajeBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonajeBuilder setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
        return this;
    }

    public PersonajeBuilder setAtaque(int ataque) {
        this.ataque = ataque;
        return this;
    }

    public PersonajeBuilder setDefensa(int defensa) {
        this.defensa = defensa;
        return this;
    }

    public PersonajeBuilder setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        return this;
    }

    public PersonajeBuilder setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
        return this;
    }

    public Personaje build() {

        return new Personaje(
                nombre,
                puntosDeVida,
                ataque,
                defensa,
                velocidad,
                estrategia
        );
    }
}