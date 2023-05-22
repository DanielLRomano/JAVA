package EstruturaDecisaoIf;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DecisaoIf objeto1 = new DecisaoIf();

        System.out.println("Informe qual metodo deseja utilizar (1 ou 2):");
        int metodo = sc.nextInt();

        if (metodo == 1) {
            objeto1.CalcularDescontoIf();
        } else if (metodo == 2) {
            objeto1.DecisaoIfElse();
        } else {
            System.out.println("Favor selecionar o metodo 1 ou 2");
        }
    }
}
