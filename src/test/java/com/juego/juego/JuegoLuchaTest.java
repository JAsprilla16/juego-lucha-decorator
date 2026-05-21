package com.juego.juego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class JuegoLuchaTest {

    @Test
    void mainDebeEjecutarseSinErrores() {

        String input = "1\n2\n";

        System.setIn(
                new java.io.ByteArrayInputStream(
                        input.getBytes()
                )
        );

        assertDoesNotThrow(() -> {
            JuegoLucha.main(new String[]{});
        });
    }
}