package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraImcTest {

    CalculadoraImc imc = new CalculadoraImc();


    @Test
    @DisplayName("Testing Altura")
    void TestandoAltura(){
        imc.setAltura(1.82);
        double altura = imc.getAltura();
        Assertions.assertNotEquals(1.55, altura);
        Assertions.assertNotNull(altura);
        Assertions.assertEquals(1.82, altura);
    }

    @Test
    @DisplayName("Testing Peso")
    void TestandoPeso(){
        imc.setPeso(100);
        double peso = imc.getPeso();
        Assertions.assertNotEquals(80, peso);
        Assertions.assertNotNull(peso);
        Assertions.assertEquals(100, peso);
    }


    @Test
    @DisplayName("Testing Peso Null")
    void TestandoPesoNull(){
        double peso = imc.getPeso();
        Assertions.assertNotNull(peso);
        Assertions.assertEquals(0.0, peso);
    }

    @Test
    @DisplayName("Testing Altura Null")
    void TestandoAlturaNull(){
        double altura = imc.getAltura();
        Assertions.assertNotNull(altura);
        Assertions.assertEquals(0.0, altura);
    }



}