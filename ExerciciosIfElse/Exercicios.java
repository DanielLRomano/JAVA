package Java.ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {

        System.out.println("Informe o valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.println("Informe o valor 2: ");
        double valor2 = sc.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor1 == valor2) {
            System.out.println("Favor informar valores diferentes.");
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }

    public void Exercicio2() {

        System.out.println("Informe o ano em que nasceu: ");
        int anoNascimento = sc.nextInt();

        if (anoNascimento <= 1953) {
            System.out.println("Seu voto é facultativo.");
        } else if (anoNascimento <= 2005 && anoNascimento >= 1954) {
            System.out.println("Seu voto é obrigatorio.");
        } else if (anoNascimento <= 2007 && anoNascimento >= 2006) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Você ainda não pode votar.");
        }
    }

    public void Exercicio3() {

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void Exercicio4() {

        System.out.println("Informe quantas maças você comprou: ");
        double quantidadeMaca = sc.nextDouble();

        double valorMaca = 0.30;

        if (quantidadeMaca >= 12) {
            valorMaca = 0.25;
            double valorCompra = quantidadeMaca * valorMaca;
            System.out.println("O valor da sua compra foi de: R$ " + valorCompra);
        } else {
            double valorCompra = quantidadeMaca * valorMaca;
            System.out.println("O valor da sua compra foi de: R$ " + valorCompra);
        }
    }

    public void Exercicio5() {

        System.out.println("Digite um numero inteiro: ");
        int A = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int B = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int C = sc.nextInt();
        if ((A < B) && (B < C)) {
            System.out.println("Os numeros digitados na ordem crescente são: " + A + "," + B + "," + C);
        } else if ((B < A) && (A < C)) {
            System.out.println("os numeros digitados na ordem crescente são: " + B + "," + A + "," + C);
        } else if ((C < A) && (A < B)) {
            System.out.println("os numeros digitados na ordem crescente são: " + C + "," + A + "," + B);
        } else if ((A < C) && (C < B)) {
            System.out.println("os numeros digitados na ordem crescente são: " + A + "," + C + "," + B);
        } else if ((B < C) && (C < A)) {
            System.out.println("os numeros digitados na ordem crescente são: " + B + "," + C + "," + A);
        } else if ((C < B) && (B < A)) {
            System.out.println("os numeros digitados na ordem crescente são: " + C + "," + B + "," + A);
        } else {
            System.out.print("");
        }
    }

    public void Exercicio6() {

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe seu sexo (1 para feminino 2 para masculino): ");
        int sexo = sc.nextInt();

        if (sexo == 1) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        } else if (sexo == 2) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        } else {
            System.out.println("Favor digitar 1 ou 2 para o sexo.");
        }
    }

    public void Exercicio7() {

        System.out.println("Informe a nota 1: ");
        int nota1 = sc.nextInt();

        System.out.println("Informe a nota 2: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;

        System.out.println("A media do aluno foi de: " + media);

        System.out.println("Informe a frequencia: ");
        int frequencia = sc.nextInt();

        System.out.println("A frequencia do aluno foi de: " + frequencia);

        if (media >= 50 && frequencia >= 75) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
