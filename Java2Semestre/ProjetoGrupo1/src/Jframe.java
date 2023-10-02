package ProjetoGrupo1.src;

import javax.swing.JFrame;

public class Jframe extends JFrame {
    public Jframe() {
        super("Calculadoras");
        this.add(new Jtabbedpane());
        // set frame
        this.setBounds(600, 100, 500, 500);
        this.setVisible(true);
    }

}
