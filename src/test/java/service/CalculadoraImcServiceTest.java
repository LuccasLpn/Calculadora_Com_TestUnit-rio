package service;

import domain.CalculadoraImc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraImcServiceTest {


    @Test
    @DisplayName("Testing Imc")
    public void testandoImc(){
        CalculadoraImcService imc = new CalculadoraImcService();
        double calculoImc = imc.calculoImc(100, 1.82);
        Assertions.assertNotNull(calculoImc);
        Assertions.assertNotEquals("29", calculoImc);
        Assertions.assertEquals(30.189590629151066, calculoImc);

    }

    @Test
    @DisplayName("Testing Magreza")
    void testandoMagreza(){
        CalculadoraImcService imc = new CalculadoraImcService();
        String magreza = imc.magreza();
        Assertions.assertNotNull(magreza);
        Assertions.assertNotEquals("Obesidade", magreza);
        Assertions.assertEquals("Magreza", magreza);
    }

    @Test
    @DisplayName("Testing Normal")
    void testandoNormal(){
        CalculadoraImcService imc = new CalculadoraImcService();
        String normal = imc.normal();
        Assertions.assertNotNull(normal);
        Assertions.assertNotEquals("Obesidade", normal);
        Assertions.assertEquals("Normal", normal);
    }

    @Test
    @DisplayName("Testing SobrePeso")
    void testandoSobrePeso(){
        CalculadoraImcService imc = new CalculadoraImcService();
        String sobrePeso = imc.sobrePeso();
        Assertions.assertNotNull(sobrePeso);
        Assertions.assertNotEquals("Obesidade", sobrePeso);
        Assertions.assertEquals("SobrePeso", sobrePeso);
    }

    @Test
    @DisplayName("Testing Obesidade")
    void testandoObesidade(){
        CalculadoraImcService imc = new CalculadoraImcService();
        String obesidade = imc.obesidade();
        Assertions.assertNotNull(obesidade);
        Assertions.assertNotEquals("Magreza", obesidade);
        Assertions.assertEquals("Obesidade", obesidade);
    }

    @Test
    @DisplayName("Testing V")
    void testandoV(){
        CalculadoraImcService imc = new CalculadoraImcService();
        imc.setV(30);
        double testV = imc.getV();
        Assertions.assertNotNull(testV);
        Assertions.assertNotEquals(25, testV);
        Assertions.assertEquals(30, testV);
    }

}