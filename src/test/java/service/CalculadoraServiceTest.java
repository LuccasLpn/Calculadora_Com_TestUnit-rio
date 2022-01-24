package service;


import domain.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class CalculadoraServiceTest {


    @Test
    @DisplayName("Testing Soma")
    public void testandoSoma(){
        Locale.setDefault(Locale.US);
        CalculadoraService calculadoraService = new CalculadoraService();
        double soma = calculadoraService.soma(1, 5);
        Assertions.assertNotNull(soma);
        Assertions.assertNotEquals("10", soma);
        Assertions.assertEquals(6, soma);
    }

    @Test
    @DisplayName("Testing subtracao")
    public void testandoSubtracao(){
        Locale.setDefault(Locale.US);
        CalculadoraService calculadoraService = new CalculadoraService();
        double subtracao = calculadoraService.subtracao(5, 1);
        Assertions.assertNotNull(subtracao);
        Assertions.assertNotEquals("10", subtracao);
        Assertions.assertEquals(4, subtracao);
    }

    @Test
    @DisplayName("Testing divisao")
    public void testandoDivisao(){
        Locale.setDefault(Locale.US);
        CalculadoraService calculadoraService = new CalculadoraService();
        double divisao = calculadoraService.divisao(5, 2);
        Assertions.assertNotNull(divisao);
        Assertions.assertNotEquals("10", divisao);
        Assertions.assertEquals(2.5, divisao);
    }

    @Test
    @DisplayName("Testing multiplicacao")
    public void testandoMultiplicacao(){
        Locale.setDefault(Locale.US);
        CalculadoraService calculadoraService = new CalculadoraService();
        double multiplicacao = calculadoraService.multiplicacao(5, 2);
        Assertions.assertNotNull(multiplicacao);
        Assertions.assertNotEquals("10", multiplicacao);
        Assertions.assertEquals(10, multiplicacao);
    }

    @Test
    @DisplayName("Testing potencia")
    public void testandoPotencia(){
        Locale.setDefault(Locale.US);
        CalculadoraService calculadoraService = new CalculadoraService();
        double potencia = calculadoraService.potencia(5, 2);
        Assertions.assertNotNull(potencia);
        Assertions.assertNotEquals("10", potencia);
        Assertions.assertEquals(25, potencia);
    }





}