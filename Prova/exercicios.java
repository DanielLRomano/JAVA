package Java.Prova;

import java.util.Scanner;

public class exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Informe dois numeros decimais abaixo.");

        System.out.println("Primeiro Numero:");
        double n1 = sc.nextDouble();

        System.out.println("Segundo numero:");
        double n2 = sc.nextDouble();

        System.out.println("Escolha uma operação. (1 para adição, 2 subtração, 3 divisão e 4 multiplicação)");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            double soma = n1 + n2;
            System.out.println("O resultado da operação é: " + soma);
        } else if (escolha == 2) {
            double sub = n1 - n2;
            System.out.println("O resultado da operação é: " + sub);
        } else if (escolha == 3 && n2 != 0) {
            double div = n1 / n2;
            System.out.println("O resultado da operação é: " + div);
        } else if (escolha == 3 && n2 == 0) {
            System.out.println("Essa operação não pode ser realizada.");
        } else if (escolha == 4) {
            double mult = n1 * n2;
            System.out.println("O resultado da operação é: " + mult);
        } else {
            System.out.println("Escolha um numero de 1 a 4");
        }
    }

    public void exercicio2() {

        System.out.println("Informe seu numero de matricula:");
        int matricula = sc.nextInt();

        int resto = matricula % 4;

        if (resto == 0) {
            System.out.println("Você está no Time do Chris!");
        } else if (resto == 1) {
            System.out.println("Você está no Time do Greg!");
        } else if (resto == 2) {
            System.out.println("Você está no Time do Caruso!");
        } else if (resto == 3) {
            System.out.println("Você está no Time do Jerome!");
        } else {
        }
    }

    public void exercicio3() {

        System.out.println("Informe abaixo quantos kilos comprou de cada fruta. (Morango, Maça ou Banana.)");

        System.out.println("Kilos de Morango: ");
        double kgMorango = sc.nextDouble();

        System.out.println("Kilos de Maça: ");
        double kgMaca = sc.nextDouble();

        System.out.println("Kilos de Banana: ");
        double kgBanana = sc.nextDouble();

        double somaKG = kgMorango + kgMaca + kgBanana;
        double valorMorango = kgMorango * 2.50;
        double valorMaca = kgMaca * 1.80;
        double valorBanana = kgBanana * 1.30;
        double valorTotal = valorMorango + valorMaca + valorBanana;

        if (somaKG > 8 || valorTotal > 25) {
            double desconto = (valorTotal * 10) / 100;
            double valorTotalDesconto = valorTotal - desconto;
            System.out.println("Você teve 10% de desconto na sua compra, seu total é de: " + valorTotalDesconto);
        } else {
            System.out.println("Você não teve desconto na sua compra, o seu total é de: " + valorTotal);
        }
    }
}
