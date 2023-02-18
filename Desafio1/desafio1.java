package Java.Desafio1;

import java.util.Scanner;

public class desafio1 {

    Scanner sc = new Scanner(System.in);

    public void aprovacao() {

        System.out.println("Informe sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Informe sua frequencia: ");
        int frequencia = sc.nextInt();

        double media = (nota1 + nota2) / 2;

        boolean aprovado = media >= 50 && frequencia >= 75;

        System.out.println("O aluno foi aprovado: " + aprovado);      
    }
    
}
