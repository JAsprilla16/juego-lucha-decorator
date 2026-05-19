package com.juego.model;

import java.util.Random;

import com.juego.patrones.strategy.EstrategiaAtaque;

public class Personaje implements ICombatiente {

    private String nombre;
    private int puntosDeVida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private EstrategiaAtaque estrategia;

    public Personaje(String nombre,
                      int puntosDeVida,
                      int ataque,
                      int defensa,
                      int velocidad,
                      EstrategiaAtaque estrategia) 
    {

        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.estrategia = estrategia;
    }

    @Override
    public void atacar(ICombatiente oponente) {

        Random rand = new Random();

        int danoBase = rand.nextInt(ataque) + 5;

        int dano = estrategia.calcularDano(danoBase);

        oponente.recibirDano(dano);

        System.out.println(nombre + " ataca causando " + dano);
    }

    @Override
    public void recibirDano(int dano) {

        dano -= defensa;

        if (dano < 0) {
            dano = 0;
        }

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    @Override
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}