package Java.EstruturaDecisaoIf;

import java.util.Scanner;

public class DecisaoIf {

    Scanner sc = new Scanner(System.in);

    // Decisão IF desencadeada
    public void CalcularDescontoIf() {

        System.out.println("Informe o valor do produto:");
        double precoProduto = sc.nextDouble();

        double percentualDesconto = 0.0;

        if (precoProduto >= 100) {
            percentualDesconto = 5.0;
        }
        if (precoProduto >= 200) {
            percentualDesconto = 10.0;
        }
        if (precoProduto >= 300) {
            percentualDesconto = 15.0;
        }

        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;

        System.out.println("O produto sairá por R$" + precoComDesconto);
    }

    // Decisão IF encadeada
    public void DecisaoIfElse() {

        System.out.println("Informe o valor do produto:");
        double precoProduto = sc.nextDouble();

        double percentualDesconto;

        if (precoProduto >= 300) {
            percentualDesconto = 15.0;
        } else if (precoProduto >= 200) {
            percentualDesconto = 10.0;
        } else if (precoProduto >= 100) {
            percentualDesconto = 5.0;
        } else {
            percentualDesconto = 0.0;
            System.out.println("Nenhum desconto será aplicado");
        }

        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;

        System.out.println("O produto sairá por R$" + precoComDesconto);
    }
}
