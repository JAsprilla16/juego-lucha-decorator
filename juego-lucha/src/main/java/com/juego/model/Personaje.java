package com.juego.model;
import java.util.Random;

public class Personaje implements ICombatiente {
    private String nombre;
    private int puntosDeVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    @Override
    public void atacar(ICombatiente oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(21) + 10;
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca causando " + dano);
    }

    @Override
    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        if (puntosDeVida < 0) puntosDeVida = 0;
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
}