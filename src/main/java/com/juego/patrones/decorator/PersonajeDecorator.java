package com.juego.patrones.decorator;
import com.juego.model.ICombatiente;

public abstract class PersonajeDecorator implements ICombatiente {
    protected ICombatiente personaje;

    public PersonajeDecorator(ICombatiente personaje) {
        this.personaje = personaje;
    }

    public void atacar(ICombatiente oponente) {
        personaje.atacar(oponente);
    }

    public void recibirDano(int dano) {
        personaje.recibirDano(dano);
    }

    public boolean estaVivo() {
        return personaje.estaVivo();
    }

    public String getNombre() {
        return personaje.getNombre();
    }

    public int getPuntosDeVida() {
        return personaje.getPuntosDeVida();
    }
}