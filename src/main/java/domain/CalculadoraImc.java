package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraImc {
    Scanner sc = new Scanner(System.in);

    double altura;
    double peso;

    public void entradaDeDados(){
        System.out.println("Informe Sua Altura ! ");
        this.setAltura(sc.nextDouble());
        System.out.println("Informe Sua peso ! ");
        this.setPeso(sc.nextDouble());
    }
}
