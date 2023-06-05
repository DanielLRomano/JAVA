package ExerciciosAplicacaoPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Informe seu nome: ");
        pessoa1.setNome(sc.nextLine());
        System.out.println("Informe o dia em que nasceu: ");
        pessoa1.setdNascismento(sc.nextInt());
        System.out.println("Informe o mês em que nasceu: ");
        pessoa1.setmNascismento(sc.nextInt());
        System.out.println("Informe o ano em que nasceu: ");
        pessoa1.setaNascismento(sc.nextInt());
        System.out.println("Informe sua altura: ");
        pessoa1.setAltura(sc.nextDouble());

        System.out.println("============================================");
        pessoa1.imprimir();
        

    }

}
