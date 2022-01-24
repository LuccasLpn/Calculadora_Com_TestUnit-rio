package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora {

    Scanner sc = new Scanner(System.in);

    Double numero1;
    Double numero2;

    public final void entradaDeNumeros(){
        System.out.println("Digite Um Numero: ");
        setNumero1(sc.nextDouble());
        System.out.println("Digite Um Numero: ");
        setNumero2(sc.nextDouble());
    }

}
