package com.avanade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(0, calculadora.somar(-2, 2));
        assertEquals(-5, calculadora.somar(-2, -3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(-4, calculadora.subtrair(2, 6));
        assertEquals(0, calculadora.subtrair(5, 5));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-6, calculadora.multiplicar(-2, 3));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(-6, 3));
        assertEquals(0, calculadora.dividir(0, 5));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0));
    }
}
