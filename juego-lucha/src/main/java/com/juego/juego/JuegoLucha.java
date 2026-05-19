package com.juego.juego;
import com.juego.model.ICombatiente;
import com.juego.model.Personaje;
import com.juego.patrones_decorator.SuperPoderDecorator;
import com.juego.patrones_decorator.EscudoDecorator;
import com.juego.patrones_decorator.EspadaDecorator;

public class JuegoLucha {
    public static void main(String[] args) {

        ICombatiente jugador1 =
            new SuperPoderDecorator(
                new EscudoDecorator(
                    new EspadaDecorator(
                        new Personaje("Guerrero")
                    )
                )
            );

        ICombatiente jugador2 =
            new SuperPoderDecorator(
                new Personaje("Ninja")
            );

        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            jugador1.atacar(jugador2);

            if (jugador2.estaVivo()) {
                jugador2.atacar(jugador1);
            }

            System.out.println("HP " + jugador1.getNombre() + ": " + jugador1.getPuntosDeVida());
            System.out.println("HP " + jugador2.getNombre() + ": " + jugador2.getPuntosDeVida());
            System.out.println("----------------------");
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " gana!");
        } else {
            System.out.println(jugador2.getNombre() + " gana!");
        }
    }
}