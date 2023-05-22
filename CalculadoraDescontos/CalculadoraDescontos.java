package CalculadoraDescontos;

import java.util.Scanner;

public class CalculadoraDescontos {

    Scanner sc = new Scanner(System.in);

    public void Calcular20() {
        System.out.println("Qual o valor do produto?");
        double precoProduto = sc.nextDouble();
        System.out.println("Será aplicado 20% de desconto");
        final int desconto20 = 20;
        double precoComDesconto = precoProduto - (precoProduto * desconto20 / 100);
        System.out.println("O Preço com desconto é: " + precoComDesconto + " Reais");
    }

    public void Calcular30() {
        System.out.println("Qual o valor do produto?");
        double precoProduto = sc.nextDouble();
        System.out.println("Será aplicado 30% de desconto");
        final int desconto30 = 30;
        double precoComDesconto = precoProduto - (precoProduto * desconto30 / 100);
        System.out.println("O Preço com desconto é: " + precoComDesconto + " Reais");
    }
}
