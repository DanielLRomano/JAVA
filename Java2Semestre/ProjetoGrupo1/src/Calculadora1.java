package ProjetoGrupo1.src;

import javax.swing.*;
import java.awt.*;

public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();
        this.setLayout(new GridLayout(20, 1));

        JLabel label = new JLabel("Informe seu peso: ");
        JTextField peso = new JTextField(15);
        JLabel label1 = new JLabel("Informe sua altura: ");
        JTextField altura = new JTextField(15);
        JButton calcular = new JButton("Calcular");

        this.add(label);
        this.add(peso);
        this.add(label1);
        this.add(altura);
        this.add(calcular);

        calcular.addActionListener(e -> {
            double soma = (Double.parseDouble(peso.getText())
                    / (Double.parseDouble(altura.getText()) * Double.parseDouble(altura.getText())));
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + soma);
        });
    }

}
