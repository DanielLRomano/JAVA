package Java.AtividadeGrupo;

import java.util.Scanner;

public class exercicio {

    Scanner sc = new Scanner(System.in);

    public void exercicioGrupo() {

        System.out.println("Favor informar seus dados abaixo.");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Sexo M para masculino e F para feminino: (Maiúscula)");
        char sexo = sc.next().charAt(0);

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        double pesoIdealM = (72.7 * altura) - 58;
        double pesoIdealF = (62.1 * altura) - 44.7;
        double imc = 0;

        if (sexo == 'M') {
            System.out.println("Seu peso ideal é: " + pesoIdealM + "kg");
            imc = pesoIdealM;
        } else if (sexo == 'F') {
            System.out.println("Seu peso ideal é: " + pesoIdealF + "kg");
            imc = pesoIdealF;
        } else {
            System.out.println("Favor inserir M ou F para que possa ser calculado seu peso ideal.");
        }

        if (peso > pesoIdealM && sexo == 'M') {
            double percaPeso = peso - pesoIdealM;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealM && sexo == 'M') {
            double ganhaPeso = pesoIdealM - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        if (peso > pesoIdealF && sexo == 'F') {
            double percaPeso = peso - pesoIdealF;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealF && sexo == 'F') {
            double ganhaPeso = pesoIdealF - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        double nivel = 0;

        if (imc < 20) {
            System.out.println("Sua Classificação é de Abaixo do Peso");
            System.out.println("ATIVIDADE DIFICIL - Voce precisa ganhar massa muscular ");
            nivel = 3;

        } else if (imc > 20 && imc < 27) {
            System.out.println("Sua Classificação Está Dentro do Normal");
            System.out.println("ATIVIDADE MODERADA - Voce pode melhorar a capacidade em aerobica");
            nivel = 2;

        } else if (imc > 27) {
            System.out.println("Sua Classificação é de Acima do Peso");
            System.out.println("ATIVIDADE LEVE - Voce precisa melhorar a resistencia e perder peso  ");
            nivel = 1;
        }

        int faixaEtaria = 0;
        if (idade > 16 && idade <= 25) {
            System.out.println("Sua faixa etária é : IDADE I");
            faixaEtaria = 1;
        } else if (idade > 25 && idade <= 35) {
            System.out.println("Sua faixa etária é : IDADE II");
            faixaEtaria = 2;
        } else if (idade > 35 && idade <= 45) {
            System.out.println("Sua faixa etária é : IDADE III");
            faixaEtaria = 3;
        } else if (idade > 45 && idade <= 55) {
            System.out.println("Sua faixa etária é : IDADE IV");
            faixaEtaria = 4;
        } else if (idade > 55 && idade <= 65) {
            System.out.println("Sua faixa etária é : IDADE V");
            faixaEtaria = 4;
        } else if (idade > 65) {
            System.out.println("Sua faixa etária é : IDADE VI");
            faixaEtaria = 6;
        } else {
            System.out.println("Coloque uma idade acima de 16 anos.");
        }

        if (nivel == 3 && (faixaEtaria == 2 || faixaEtaria == 3)) {
            System.out.println("Faça Musculação Intensa");
        }
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4)) {
            System.out.println("Faça Musculação Moderada");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Musculação leve");
        }
        if (nivel == 3 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4))
            System.out.println("Faça Luta");
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Dança");
        }
        if (nivel == 3 && (faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Pilates");
        }
        if (nivel == 2 && (faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4 || faixaEtaria == 5)) {
            System.out.println("Faça Corrida");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Ioga");
        }
    }
}
