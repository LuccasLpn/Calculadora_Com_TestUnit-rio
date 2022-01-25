package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

class CalculadoraAreaServiceTest {

    CalculadoraAreaService areaService = new CalculadoraAreaService();
    DecimalFormat fmt = new DecimalFormat("0.0");


    @Test
    @DisplayName("Testando Resultado CalculoRaio")
    void testandoCalculoRaio(){
        double calculoRaio = areaService.calculoRaio(2.5);
        String format = fmt.format(calculoRaio);
        Assertions.assertNotEquals(19,format);
        Assertions.assertNotNull(format);
        Assertions.assertEquals("19,6", format);
    }

    @Test
    @DisplayName("Testando Resultado CalculoQuadrado")
    void testandoCalculoQuadrado(){
        double calculoQuadrado = areaService.calculoQuadrado(4);
        String format = fmt.format(calculoQuadrado);
        Assertions.assertNotEquals(16,format);
        Assertions.assertNotNull(format);
        Assertions.assertEquals("16,0", format);
    }

    @Test
    @DisplayName("Testando Resultado CalculoRetangulo")
    void testandoCalculoRetangulo(){
        double calculoRetangulo = areaService.calculoRetangulo(2, 4);
        String format = fmt.format(calculoRetangulo);
        Assertions.assertNotEquals(9,format);
        Assertions.assertNotNull(format);
        Assertions.assertEquals("8,0", format);
    }




}