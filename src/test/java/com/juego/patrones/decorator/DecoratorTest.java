package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AgresivoStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void espadaDecoratorDebeCrearseCorrectamente() {

        Personaje personaje = new Personaje(
                "Guerrero",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        EspadaDecorator espada = new EspadaDecorator(personaje);

        assertNotNull(espada);
    }

    @Test
    void escudoDecoratorDebeCrearseCorrectamente() {

        Personaje personaje = new Personaje(
                "Tanque",
                100,
                15,
                20,
                3,
                new AgresivoStrategy()
        );

        EscudoDecorator escudo = new EscudoDecorator(personaje);

        assertNotNull(escudo);
    }

    @Test
    void superPoderDecoratorDebeCrearseCorrectamente() {

        Personaje personaje = new Personaje(
                "Mago",
                80,
                30,
                5,
                10,
                new AgresivoStrategy()
        );

        SuperPoderDecorator poder =
                new SuperPoderDecorator(personaje);

        assertNotNull(poder);
    }

    @Test
    void decoratorDebeMantenerNombre() {

        Personaje personaje = new Personaje(
                "Ninja",
                90,
                25,
                8,
                15,
                new AgresivoStrategy()
        );

        EspadaDecorator espada = new EspadaDecorator(personaje);

        assertEquals("Ninja", espada.getNombre());
    }

    @Test
    void decoratorDebeMantenerVida() {

        Personaje personaje = new Personaje(
                "Heroe",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        EscudoDecorator escudo = new EscudoDecorator(personaje);

        assertEquals(100, escudo.getPuntosDeVida());
    }

    @Test
    void espadaDebeAtacarAOponente() {

        Personaje atacante = new Personaje(
                "Guerrero",
                100,
                20,
                10,
                5,
                new AgresivoStrategy()
        );

        Personaje enemigo = new Personaje(
                "Enemigo",
                100,
                15,
                5,
                5,
                new AgresivoStrategy()
        );

        EspadaDecorator espada =
                new EspadaDecorator(atacante);

        espada.atacar(enemigo);

        assertTrue(enemigo.getPuntosDeVida() < 100);
    }

    @Test
    void escudoDebeRecibirDano() {

        Personaje personaje = new Personaje(
                "Tanque",
                100,
                15,
                20,
                3,
                new AgresivoStrategy()
        );

        EscudoDecorator escudo =
                new EscudoDecorator(personaje);

        escudo.recibirDano(20);

        assertTrue(escudo.getPuntosDeVida() <= 100);
    }

    @Test
    void multiplesDecoratorsDebenFuncionar() {

        Personaje personaje = new Personaje(
                "Boss",
                150,
                30,
                20,
                10,
                new AgresivoStrategy()
        );

        EspadaDecorator espada =
                new EspadaDecorator(personaje);

        EscudoDecorator escudo =
                new EscudoDecorator(espada);

        assertNotNull(escudo);
    }
}