package Java.Desafio1;

import java.util.Scanner;

public class desafio1 {

    Scanner sc = new Scanner(System.in);

    public void aprovacao() {

        System.out.println("Informe a primeira nota do Aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota do Aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a frequencia do Aluno: ");
        int frequencia = sc.nextInt();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno foi: " + media);

        System.out.println("A frequêcia do aluno foi: " + frequencia + "%");

        boolean aprovado = media >= 50 && frequencia >= 75;

        if (aprovado == true) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }

        sc.close();
    }
}
