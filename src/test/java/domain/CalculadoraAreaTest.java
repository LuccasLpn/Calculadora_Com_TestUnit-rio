package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraAreaTest {

    CalculadoraArea calculadoraArea = new CalculadoraArea();

    @Test
    @DisplayName("Testando Raio Null")
    void testandoRaioNull(){
        Double raio = calculadoraArea.getRaio();
        Assertions.assertNull(raio);

    }

    @Test
    @DisplayName("Testando lado Null")
    void testandoladoNull(){
        Double lado = calculadoraArea.getLado();
        Assertions.assertNull(lado);

    }

    @Test
    @DisplayName("Testando base Null")
    void testandoBaseNull(){
        Double base = calculadoraArea.getBase();
        Assertions.assertNull(base);
    }

    @Test
    @DisplayName("Testando Altura Null")
    void testandoAlturaNull(){
        Double altura = calculadoraArea.getAltura();
        Assertions.assertNull(altura);
    }

    @Test
    @DisplayName("Testando Raio")
    void testandoRaio(){
        calculadoraArea.setRaio(5.0);
        Double raio = calculadoraArea.getRaio();
        Assertions.assertNotNull(raio);
        Assertions.assertNotEquals(4, raio);
        Assertions.assertEquals(5, raio);
    }

    @Test
    @DisplayName("Testando lado")
    void testandolado(){
        calculadoraArea.setLado(5.0);
        Double lado = calculadoraArea.getLado();
        Assertions.assertNotNull(lado);
        Assertions.assertNotEquals(4, lado);
        Assertions.assertEquals(5, lado);
    }

    @Test
    @DisplayName("Testando base")
    void testandoBase(){
        calculadoraArea.setBase(5.0);
        Double base = calculadoraArea.getBase();
        Assertions.assertNotNull(base);
        Assertions.assertNotEquals(4, base);
        Assertions.assertEquals(5, base);
    }


    @Test
    @DisplayName("Testando Altura")
    void testandoAltura(){
        calculadoraArea.setAltura(1.82);
        Double altura = calculadoraArea.getAltura();
        Assertions.assertNotNull(altura);
        Assertions.assertNotEquals(1.55, altura);
        Assertions.assertEquals(1.82, altura);
    }

}