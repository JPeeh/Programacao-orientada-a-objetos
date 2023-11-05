package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PessoaTest {
    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String resultado = pessoa.dizerOla();
        assertEquals("Olá, mundo!", resultado);
    }
}
