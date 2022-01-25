package service;

import domain.Calculadora;
import domain.CalculadoraArea;
import domain.CalculadoraImc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.Utils;

import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Service {

    CalculadoraImc imc = new CalculadoraImc();
    Calculadora calculadora = new Calculadora();
    CalculadoraArea calculadoraArea = new CalculadoraArea();
    CalculadoraAreaService AreaService = new CalculadoraAreaService();
    CalculadoraService calculadoraService = new CalculadoraService();
    CalculadoraImcService imcService = new CalculadoraImcService();
    Scanner sc = new Scanner(System.in);
    Utils utils = new Utils();

    public void testing(){
        int s = sc.nextInt();
        switch (s){
            case 1:
                utils.segundaOpcao();
                int n = sc.nextInt();
                switch (n){
                    case 1:
                        calculadora.entradaDeNumeros();
                        calculadoraService.soma(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 2:
                        calculadora.entradaDeNumeros();
                        calculadoraService.subtracao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 3:
                        calculadora.entradaDeNumeros();
                        calculadoraService.divisao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 4:
                        calculadora.entradaDeNumeros();
                        calculadoraService.multiplicacao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 5:
                        calculadora.entradaDeNumeros();
                        calculadoraService.potencia(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                }

                break;

            case 2:
                imc.entradaDeDados();
                imcService.calculoImc(imc.getPeso(), imc.getAltura());
                break;
            case 3:
/*                calculadoraArea.opçao();
                int x = sc.nextInt();
                switch (x){
                    case 1:
                        calculadoraArea.entradaDeDadosRaio();
                        AreaService.calculoRaio(calculadoraArea.getRaio());
                        break;
                    case 2:
                        calculadoraArea.entradaDeDadosQuadrado();
                        AreaService.calculoQuadrado(calculadoraArea.getLado());
                        break;
                    case 3:
                        calculadoraArea.entradaDeDadosRetangulo();
                        AreaService.calculoRetangulo(calculadoraArea.getBase(),calculadoraArea.getAltura());
                        break;
                }*/

                break;
        }
    }
}
