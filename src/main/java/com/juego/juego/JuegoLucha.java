package com.juego.juego;

import java.util.Scanner;

import com.juego.model.ICombatiente;

import com.juego.patrones.decorator.EspadaDecorator;
import com.juego.patrones.decorator.EscudoDecorator;
import com.juego.patrones.decorator.SuperPoderDecorator;

import com.juego.patrones.factory.GuerreroFactory;
import com.juego.patrones.factory.NinjaFactory;
import com.juego.patrones.factory.MagoFactory;
import com.juego.patrones.factory.PersonajeFactory;

public class JuegoLucha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== JUEGO DE LUCHA =====");
        System.out.println("1. Guerrero");
        System.out.println("2. Ninja");
        System.out.println("3. Mago");

        // Selección jugador 1
        System.out.print("Jugador 1 elige personaje: ");
        int opcion1 = scanner.nextInt();

        // Selección jugador 2
        System.out.print("Jugador 2 elige personaje: ");
        int opcion2 = scanner.nextInt();

        // Crear personajes usando Factory
        ICombatiente jugador1 =
            crearPersonaje(opcion1);

        ICombatiente jugador2 =
            crearPersonaje(opcion2);

        System.out.println("\n¡Comienza la batalla!");
        System.out.println(jugador1.getNombre()
                + " VS "
                + jugador2.getNombre());

        System.out.println("----------------------");

        // Combate
        while (jugador1.estaVivo()
                && jugador2.estaVivo()) {

            jugador1.atacar(jugador2);

            if (jugador2.estaVivo()) {
                jugador2.atacar(jugador1);
            }

            System.out.println("HP "
                    + jugador1.getNombre()
                    + ": "
                    + jugador1.getPuntosDeVida());

            System.out.println("HP "
                    + jugador2.getNombre()
                    + ": "
                    + jugador2.getPuntosDeVida());

            System.out.println("----------------------");
        }

        // Ganador
        if (jugador1.estaVivo()) {
            System.out.println("🏆 "
                    + jugador1.getNombre()
                    + " gana!");
        } else {
            System.out.println("🏆 "
                    + jugador2.getNombre()
                    + " gana!");
        }

        scanner.close();
    }

    // Método para crear personajes
    private static ICombatiente crearPersonaje(int opcion) {

        PersonajeFactory factory;

        switch (opcion) {

            case 1:
                factory = new GuerreroFactory();

                return
                    new EscudoDecorator(
                        new EspadaDecorator(
                            factory.crearPersonaje()
                        )
                    );

            case 2:
                factory = new NinjaFactory();

                return new SuperPoderDecorator(
                    new EspadaDecorator(
                        factory.crearPersonaje()
                    )
                );

            case 3:
                factory = new MagoFactory();

                return new SuperPoderDecorator(
                    new EscudoDecorator(
                        factory.crearPersonaje()
                    )
                );

            default:
                System.out.println("Opción inválida. Se asigna Guerrero.");

                factory = new GuerreroFactory();

                return factory.crearPersonaje();
        }
    }
}