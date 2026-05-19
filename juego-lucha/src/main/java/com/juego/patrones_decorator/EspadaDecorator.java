package com.juego.patrones_decorator;
import java.util.Random;
import com.juego.model.ICombatiente;

public class EspadaDecorator extends PersonajeDecorator {

    private Random rand = new Random();
    private double probabilidad = 0.5; // 50%

    public EspadaDecorator(ICombatiente personaje) {
        super(personaje);
    }

    @Override
    public void atacar(ICombatiente oponente) {
        // Ataque base SIEMPRE ocurre
        personaje.atacar(oponente);

        // Probabilidad de activar espada
        if (rand.nextDouble() < probabilidad) {
            int danoExtra = 10;
            oponente.recibirDano(danoExtra);
            System.out.println(getNombre() + " activa espada (+10 daño)");
        } else {
            System.out.println(getNombre() + " intenta usar espada pero falla");
        }
    }
}