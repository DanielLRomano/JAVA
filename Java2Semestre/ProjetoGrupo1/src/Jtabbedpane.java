package ProjetoGrupo1.src;

import javax.swing.JTabbedPane;

public class Jtabbedpane extends JTabbedPane {
    public Jtabbedpane() {
        super();
        this.add("Calculadora IMC", new Calculadora1());
        this.add("Calculadora Conversora de Moedas", new Calculadora2());
        this.add("Calculadora Simples", new Calculadora3());
    }

}
