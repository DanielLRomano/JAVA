package Exercicio2AplicacaoPOO;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random rd = new Random(0);
        Scanner sc = new Scanner(System.in);

        Agenda pessoas[] = new Agenda[10];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe seu nome: ");
            pessoas[0] = new Agenda(sc.nextLine(), rd.nextInt(99), rd.nextFloat(2));
        }

        
        System.out.println("Informe o nome que deseja buscar informações: ");
        String bPessoas = sc.nextLine();
        int i = 0;

        while (bPessoas.equals(pessoas[i].getNome())) {
                System.out.println("A pessoa está na posição " + i + " da Agenda");
            }
            i++;
        }
    }
