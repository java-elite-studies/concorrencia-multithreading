package com.eldermoraes.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ExemploInicialTest {

    @Test
    void deveExecutarMainSemErros() {
        assertDoesNotThrow(() -> ExemploInicial.main(new String[0]));
    }
}
