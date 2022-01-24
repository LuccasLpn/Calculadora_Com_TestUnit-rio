package service;

import domain.CalculadoraImc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalculadoraImcService {

    double v;

    CalculadoraImc imc = new CalculadoraImc();
    DecimalFormat fmt = new DecimalFormat("0.0");


    public double calculoImc(double peso, double altura) {
        v = peso / (altura * altura);
        System.out.println(fmt.format(v));
        return v;
    }

    public String magreza(){
        if(v <= 18.5){
         System.out.println("Magreza");
        }
        return "Magreza";
    }
    public String normal(){
        if(v <= 24.9 & v >= 18.5){
            System.out.println("Normal");
        }
        return "Normal";
    }
    public String sobrePeso(){
        if(v >= 24.9 & v <= 30.0){
            System.out.println("SobrePeso");
        }
        return "SobrePeso";
    }
    public String obesidade(){
        if(v >= 30.0){
            System.out.println("Obesidade");
        }
        return "Obesidade";
    }




}
