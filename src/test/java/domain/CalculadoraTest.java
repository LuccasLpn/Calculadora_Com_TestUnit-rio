package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Testing Numero1")
    public void testandoNumero1(){
        calculadora.setNumero1(10.0);
        Double numero1 = calculadora.getNumero1();
        Assertions.assertNotNull(numero1);
        Assertions.assertNotEquals(5,numero1);
        Assertions.assertEquals(10, numero1);
    }


    @Test
    @DisplayName("Testing Numero2")
    public void testandoNumero2(){
        calculadora.setNumero2(20.0);
        Double numero1 = calculadora.getNumero2();
        Assertions.assertNotNull(numero1);
        Assertions.assertNotEquals(5,numero1);
        Assertions.assertEquals(20, numero1);
    }

    @Test
    @DisplayName("Testing Numero1 isNull")
    public void testandoNumero1Empty(){
        Double numero1 = calculadora.getNumero1();
        Assertions.assertNull(numero1);
    }

    @Test
    @DisplayName("Testing Numero2 isNull")
    public void testandoNumero2Null(){
        Double numero2 = calculadora.getNumero2();
        Assertions.assertNull(numero2);
    }




}