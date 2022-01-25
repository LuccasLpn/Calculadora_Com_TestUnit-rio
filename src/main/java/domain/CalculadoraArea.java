package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraArea {

    private Double raio;
    private Double lado;
    private Double base;
    private Double altura;


    Scanner sc = new Scanner(System.in);


    public void entradaDeDadosRaio(){
        System.out.println("Informe o raio ! ");
        this.setRaio(sc.nextDouble());
    }

    public void entradaDeDadosQuadrado(){
        System.out.println("Informe o Lado ! ");
        this.setLado(sc.nextDouble());
    }

    public void entradaDeDadosRetangulo(){
        System.out.println("Informe a Base ! ");
        this.setBase(sc.nextDouble());
        System.out.println("Informe a Altura ! ");
        this.setAltura(sc.nextDouble());
    }

    public void opçao(){
        System.out.println("1 - Calculo de Area Circulo");
        System.out.println("2 - Calculo de Area Quadrado");
        System.out.println("3 - Calculo de Area Retangulo");
    }

}
