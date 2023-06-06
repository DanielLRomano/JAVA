package Exercicio3AplicacaoPOO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Elevador elevador1 = new Elevador(10, 10);

        elevador1.iniciar();
        boolean ligado = true;
        int atuacao = 0;

        while (ligado) {
            System.out.println(
                    "Escolha a ação do elevador: \n" + "1. Entrar pessoa \n" + "2. Descer pessoa \n"
                            + "3. Escolha um andar \n" + "4. Desligar \n" + "=======================");
            atuacao = sc.nextInt();
            switch (atuacao) {
                case 1:
                    System.out.println("Capacidade: " + elevador1.entrar());
                    break;
                case 2:
                    System.out.println("Capacidade: " + elevador1.sair());
                    break;
                case 3:
                    System.out.println(
                            "Andar: " + elevador1
                                    .acao(Integer.parseInt(JOptionPane.showInputDialog("Informe o andar desejado"))));
                    break;
                case 4:
                    ligado = false;
                    break;
            }
        }

    }
}
