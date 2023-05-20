package ExerciciosJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Informe o numero de linhas da Matriz:");
        int l = sc.nextInt();
        System.out.println("Informe o numero de colunas da Matriz:");
        int c = sc.nextInt();

        int m[][] = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = rd.nextInt(10);
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("==============================");

        for (int i = 0; i < l; i++) {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                if (i > j) {
                    m[i][j] = 1;
                } else if (i == j) {
                    m[i][j] = 0;
                } else if (j > i) {
                    m[i][j] = 2;
                } else {
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }

    }

    public void exercicio2() {

        int numeroSorteado = rd.nextInt(1001);
        boolean tenteNovamente = true;
        int contador = 0;

        while (tenteNovamente) {
            System.out.println("Informe um palpite de 0 a 1000");
            int palpite = sc.nextInt();
            if (numeroSorteado == palpite) {
                System.out.println("Acertou!");
                tenteNovamente = false;
            } else {
                System.out.println("Tente novamente!");
                contador++;
                if (numeroSorteado > palpite) {
                    System.out.println("O palpite é MENOR que o numero sorteado.");
                } else {
                    System.out.println("O palpite é MAIOR que o numero sorteado.");
                }
                System.out.println("===================================================");
            }
        }
        System.out.println("Você acertou em " + (contador + 1) + " tentativas");
    }

    public void exercicio3() {

        int nVetor = rd.nextInt(900) + 100;
        int vetor[] = new int[nVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(2, 101);
        }

        for (int i = 0; i < vetor.length; i++) {
            int resto = i % 2;
            if (resto == 0) {
                System.out.println("Os numeros pares do vetor são " + vetor[i]);
            }
        }
        System.out.println("==============================================================");

        for (int i = 0; i < vetor.length; i++) {
            int resto = i % 2;
            if (resto == 1) {
                System.out.println("Os numeros impares do vetor são " + vetor[i]);
            }
        }

        int impar = 0;
        int par = 0;

        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 1) {
                impar++;
            }
        }
        System.out.println("Tem " + impar + " numeros impares nas posições pares do vetor.");

        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("Tem " + par + " numeros pares nas posições impares do vetor.");

    }
}
