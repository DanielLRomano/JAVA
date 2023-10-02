import java.util.Scanner;

public class exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Informe um numero:");
        int numero = sc.nextInt();

        if (numero > 10) {
            System.out.println("O numero é maior que 10!");
        } else if (numero == 10) {
            System.out.println("O numero é 10!");
        } else {
            System.out.println("O numero é menor que 10!");
        }
    }

    public void exercicio2() {

        System.out.println("Informe o valor que recebe por hora:");
        double valorHora = sc.nextDouble();

        double salario = valorHora * 200;
        double valorHoraExtra = valorHora * 1.5;

        System.out.println("Quantas horas trabalhou no mes ?");
        double horasTrabalhadas = sc.nextDouble();

        if (horasTrabalhadas > 200) {
            System.out.println("Seu salario é :" + salario);
            double horaExtra = horasTrabalhadas - 200;
            System.out.println("Você fez " + horaExtra + " Horas extras.");
            double valorExtra = horaExtra * valorHoraExtra;
            double salarioTotal = valorExtra + salario;
            System.out.println("Seu salario com o acrescimo das horas extras é de: " + salarioTotal);
        } else {
            System.out.println("Seu salario é: " + salario);
        }
    }

    public void exercicio3() {

        System.out.println("Informe seu salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe quanto vendeu este mes: ");
        double valorVendas = sc.nextDouble();

        if (valorVendas <= 2500) {
            double comissao = (valorVendas * 3) / 100;
            double salarioTotal = salarioFixo + comissao;
            System.out.println("Seu salario total é de: " + salarioTotal);
        } else {
            double comissao = (valorVendas * 5) / 100;
            double salarioTotal = salarioFixo + comissao;
            System.out.println("Seu salario total é de: " + salarioTotal);
        }
    }

    public void exercicio4() {

        System.out.println("Digite o numero da sua conta:");
        int nConta = sc.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do seu debito");
        double debito = sc.nextDouble();

        System.out.println("digite o valor do seu credito");
        double credito = sc.nextDouble();

        double saldoAtual = (saldo - debito) + credito;

        if (saldoAtual >= 0) {
            System.out.println("Seu numero da conta é: " + nConta);
            System.out.println("Seu saldo está positivo");
        } else {
            System.out.println("Seu numero da conta é: " + nConta);
            System.out.println("Seu saldo está negativo");
        }
    }

    public void exercicio5() {

        System.out.println("Digite o primeiro valor");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor");
        double valor3 = sc.nextDouble();

        if (valor1 > valor2 && valor2 > valor3) {
            System.out.println("O maior valor é:" + valor1);

        } else if (valor2 > valor1 && valor1 > valor3) {
            System.out.println("O maior valor é:" + valor2);

        } else if (valor3 > valor2 && valor2 > valor1) {
            System.out.println("O maior valor é:" + valor3);

        } else if (valor3 > valor1 && valor1 > valor2) {
            System.out.println("O maior valor é:" + valor3);
        } else if (valor1 > valor2 && valor3 > valor2) {
            System.out.println("O maior valor é:" + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }

    public void exercicio6() {

        System.out.println("Informe a quantidade de litros vendidos");
        double litros = sc.nextDouble();
        System.out.println("Informe o tipo de combustivel, sendo A alcool e G gasolina");
        char tipo = sc.next().charAt(0);

        if (tipo == 'A' && litros <= 20) {
            double valorLitro = 3.9;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 3) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'A' && litros > 20) {
            double valorLitro = 3.9;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 5) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'G' && litros <= 20) {
            double valorLitro = 5.3;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 4) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'G' && litros > 20) {
            double valorLitro = 5.3;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 6) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else {
            System.out.println("Informe uma letra correta");
        }
    }

    public void exercicio7() {

        System.out.println("Informe o nome do produto");
        String nome = sc.nextLine();

        System.out.println("Informe a quantidade");
        int quantidade = sc.nextInt();

        System.out.println("Informe o preço unitario");
        double preco = sc.nextDouble();

        double precoTotal = quantidade * preco;

        if (quantidade <= 5) {
            double desconto = (precoTotal * 2) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + " produtos");
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else if (quantidade > 5 && quantidade <= 10) {
            double desconto = (precoTotal * 3) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + nome);
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else if (quantidade > 10) {
            double desconto = (precoTotal * 5) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + " produtos");
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else {
            System.out.println("Informe o que foi pedido");
        }
    }
}
