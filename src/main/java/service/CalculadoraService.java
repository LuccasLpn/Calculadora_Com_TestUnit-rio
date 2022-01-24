package service;

import domain.Calculadora;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalculadoraService {

    DecimalFormat fmt = new DecimalFormat("0.0");

    public double soma(double numero1, double numero2){

        double v = numero1 + numero2;
        System.out.println(fmt.format(v));
        return v;
    }
    public double subtracao(double numero1, double numero2){
        double v = numero1 - numero2;
        System.out.println(fmt.format(v));
        return v;
    }
    public double divisao(double numero1, double numero2){
        double v = numero1 / numero2;
        if (numero2 == 0){
            System.out.println("Divisão por Zero");
        }
        System.out.println(fmt.format(v));
        return v;
    }
    public double multiplicacao(double numero1, double numero2){
        double v = numero1 * numero2;
        System.out.println(fmt.format(v));
        return v;
    }
    public double potencia(double numero1, double numero2){
        double v = Math.pow(numero1,numero2);
        System.out.println(fmt.format(v));
        return v;
    }

}