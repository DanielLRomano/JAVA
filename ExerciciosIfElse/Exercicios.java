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

    public void Exercicio8() {

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero digitado é par.");
        } else {
            System.out.println("O numero digitado é impar.");
        }
    }

    public void Exercicio9() {

        System.out.println("Informe sua nota: ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Tem direito a fazer prova de recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }

    public void Exercicio10() {

        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }
    }

    public void Exercicio11() {

        System.out.println("Informe seu salario: ");
        double salario = sc.nextDouble();

        if (salario <= 1280) {
            double aumento = (salario * 20) / 100;
            double salarioAumento = salario + aumento;
            System.out.println("Salario antes do reajuste: " + salario);
            System.out.println("Foi aplicado 20% de aumento.");
            System.out.println("O valor do aumento foi de: " + aumento);
            System.out.println("Seu salario apos o aumento será de: " + salarioAumento);
        } else if (salario >= 1281 && salario <= 1700) {
            double aumento = (salario * 15) / 100;
            double salarioAumento = salario + aumento;
            System.out.println("Salario antes do reajuste: " + salario);
            System.out.println("Foi aplicado 15% de aumento.");
            System.out.println("O valor do aumento foi de: " + aumento);
            System.out.println("Seu salario apos o aumento será de: " + salarioAumento);
        } else if (salario >= 1701 && salario <= 2500) {
            double aumento = (salario * 10) / 100;
            double salarioAumento = salario + aumento;
            System.out.println("Salario antes do reajuste: " + salario);
            System.out.println("Foi aplicado 10% de aumento.");
            System.out.println("O valor do aumento foi de: " + aumento);
            System.out.println("Seu salario apos o aumento será de: " + salarioAumento);
        } else {
            double aumento = (salario * 5) / 100;
            double salarioAumento = salario + aumento;
            System.out.println("Salario antes do reajuste: " + salario);
            System.out.println("Foi aplicado 5% de aumento.");
            System.out.println("O valor do aumento foi de: " + aumento);
            System.out.println("Seu salario apos o aumento será de: " + salarioAumento);
        }
    }

    public void Exercicio12() {

        System.out.println("Informe o quanto recebe por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Informe quantas horas trabalhou no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        double sindicato = (salario * 3) / 100;
        double inss = (salario * 10) / 100;
        double fgts = (salario * 11) / 100;

        if (salario <= 900) {
            System.out.println("Segue abaixo seu folha de pagamento: ");
            System.out.println("Salario bruto: R$ " + salario);
            System.out.println("Contribuição Sindical (3%): " + sindicato);
            System.out.println("IR: ISENTO.");
            System.out.println("INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            double descontos = sindicato + inss;
            System.out.println("Total de descontos: " + descontos);
            double salarioLiquido = salario - sindicato - inss;
            System.out.println("Salario Liquido: R$ " + salarioLiquido);
        } else if (salario >= 901 && salario <= 1500) {
            double ir = (salario * 5) / 100;
            double descontos = sindicato + inss + ir;
            double salarioLiquido = salario - descontos;
            System.out.println("Segue abaixo seu folha de pagamento: ");
            System.out.println("Salario bruto: R$ " + salario);
            System.out.println("Contribuição Sindical (3%): " + sindicato);
            System.out.println("IR (5%): " + ir);
            System.out.println("INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: " + descontos);
            System.out.println("Salario Liquido: R$ " + salarioLiquido);
        } else if (salario >= 1501 && salario <= 2500) {
            double ir = (salario * 10) / 100;
            double descontos = sindicato + inss + ir;
            double salarioLiquido = salario - descontos;
            System.out.println("Segue abaixo seu folha de pagamento: ");
            System.out.println("Salario bruto: R$ " + salario);
            System.out.println("Contribuição Sindical (3%): " + sindicato);
            System.out.println("IR (10%): " + ir);
            System.out.println("INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: " + descontos);
            System.out.println("Salario Liquido: R$ " + salarioLiquido);
        } else {
            double ir = (salario * 20) / 100;
            double descontos = sindicato + inss + ir;
            double salarioLiquido = salario - descontos;
            System.out.println("Segue abaixo seu folha de pagamento: ");
            System.out.println("Salario bruto: R$ " + salario);
            System.out.println("Contribuição Sindical (3%): " + sindicato);
            System.out.println("IR (20%): " + ir);
            System.out.println("INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: " + descontos);
            System.out.println("Salario Liquido: R$ " + salarioLiquido);
        }
    }
}
