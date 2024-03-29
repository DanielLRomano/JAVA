package Exercicio3AplicacaoPOO;

import javax.swing.JOptionPane;

public class Elevador {

    int capacidadeMax;
    int nMaxAndar;
    int andarAtual;
    int capacidadeAtual;

    public Elevador(int capacidadeMax, int nMaxAndar) {
        this.capacidadeMax = capacidadeMax;
        this.nMaxAndar = nMaxAndar;
        capacidadeAtual = 0;
        andarAtual = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public int entrar() {
        if (capacidadeAtual < capacidadeMax) {
            capacidadeAtual++;
        } else {
            JOptionPane.showMessageDialog(null, "Capacidade Máxima atingida \n Não vai subir ninguem!!");
        }
        return capacidadeAtual;
    }

    public int sair() {
        if (capacidadeAtual > 0) {
            capacidadeAtual--;
        } else {
            JOptionPane.showMessageDialog(null, "Não tem ninguem no elevador.");
        }
        return capacidadeAtual;
    }

    public int acao(int nAndares) {
        if (nAndares <= nMaxAndar && nAndares >= 0 && nAndares != andarAtual) {
            andarAtual = nAndares;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um andar válido.");
        }
        return andarAtual;
    }

    public void iniciar() {
        andarAtual = 0;
        capacidadeAtual = 0;
    }

}
