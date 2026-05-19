package com.juego.model;

public interface ICombatiente {
    void atacar(ICombatiente oponente);
    void recibirDano(int dano);
    boolean estaVivo();
    String getNombre();
    int getPuntosDeVida();
}
