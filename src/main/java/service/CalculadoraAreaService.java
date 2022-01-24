package service;

import domain.CalculadoraArea;

import java.text.DecimalFormat;

public class CalculadoraAreaService {


    CalculadoraArea area = new CalculadoraArea();
    DecimalFormat fmt = new DecimalFormat("0.0");

    public double calculoRaio(double raio){
        double area = Math.PI * raio * raio;
        System.out.println(fmt.format(area));
        return area;
    }

    public double calculoQuadrado(double lado){
        double calculo = lado * lado;
        System.out.println(fmt.format(calculo));
        return calculo;
    }

    public double calculoRetangulo(double base, double altura) {
        double retangulo = base * altura;
        System.out.println(fmt.format(retangulo));
        return retangulo;
    }

}
