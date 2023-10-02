package Exercicio2AplicacaoPOO;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Random rd = new Random(0);
        Scanner sc = new Scanner(System.in);

        Agenda contatos[] = new Agenda[10];

        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Agenda();
            contatos[i].setNome(JOptionPane.showInputDialog("Nome:"));
            contatos[i].setIdade(rd.nextInt(18, 90));
            contatos[i].setAltura(rd.nextFloat(1, 2));
        }

        String nomeBuscado = JOptionPane.showInputDialog("Informe o nome buscado: ");
        int cont = 0;
        boolean procure = true;

        while (procure) {
            if (nomeBuscado.equals(contatos[cont].getNome())) {
                procure = false;
                JOptionPane.showMessageDialog(null,
                        "Idade: " + contatos[cont].getIdade() + "\n Altura: " + contatos[cont].getAltura());
            }
            cont++;
        }

    }
}
