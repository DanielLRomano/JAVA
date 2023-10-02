package ProjetoGrupo1.src;

import java.awt.FlowLayout;

import javax.swing.*;

public class Calculadora2 extends JPanel {

    JRadioButton real;
    JRadioButton real1;
    JRadioButton euro;
    JRadioButton euro1;
    JRadioButton dolar;
    JRadioButton dolar1;
    JTextField resultado;
    JTextField valor1;
    JButton calcular;
    double realDolar;
    double realEuro;
    double realReal;
    double euroDolar;
    double euroReal;
    double euroEuro;
    double dolarEuro;
    double dolarReal;
    double dolarDolar;

    public Calculadora2() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel painel = new JPanel(new FlowLayout(0));
        JPanel painel1 = new JPanel(new FlowLayout(0));

        JLabel label = new JLabel("Informe sua moeda e a quantidade");
        JLabel label3 = new JLabel("Informe a moeda que deseja receber");
        JLabel label4 = new JLabel("Resultado: ");

        valor1 = new JTextField(20);
        resultado = new JTextField(20);
        real = new JRadioButton("Real");
        real1 = new JRadioButton("Real");
        euro = new JRadioButton("Euro");
        euro1 = new JRadioButton("Euro");
        dolar = new JRadioButton("Dolar");
        dolar1 = new JRadioButton("Dolar");
        calcular = new JButton("Calcular");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(real);
        grupo.add(euro);
        grupo.add(dolar);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(real1);
        grupo1.add(euro1);
        grupo1.add(dolar1);

        this.add(label);
        this.add(real);
        this.add(euro);
        this.add(dolar);

        this.add(painel);
        painel.add(valor1);

        this.add(label3);
        this.add(real1);
        this.add(euro1);
        this.add(dolar1);
        this.add(calcular);
        this.add(label4);

        this.add(painel1);
        painel1.add(resultado);

        calcular.addActionListener(e -> {
            realDolar = (Double.parseDouble(valor1.getText()) / 4.96);
            realEuro = (Double.parseDouble(valor1.getText()) / 5.37);
            realReal = (Double.parseDouble(valor1.getText()) * 1);
            euroDolar = (Double.parseDouble(valor1.getText()) * 1.08);
            euroReal = (Double.parseDouble(valor1.getText()) * 5.37);
            euroEuro = (Double.parseDouble(valor1.getText()) * 1);
            dolarEuro = (Double.parseDouble(valor1.getText()) * 0.92);
            dolarReal = (Double.parseDouble(valor1.getText()) * 4.96);
            dolarDolar = (Double.parseDouble(valor1.getText()) * 1);

            if (real.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(realDolar + " dolares"));
            }
            if (real.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(realEuro + " euros"));
            }
            if (euro.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(euroReal + " reais"));
            }
            if (euro.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(euroDolar + " dolares"));
            }
            if (dolar.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(dolarReal + " reais"));
            }
            if (dolar.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(dolarEuro + " euros"));
            }
            if (real.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(realReal + " reais"));
            }
            if (dolar.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(dolarDolar + " dolares"));
            }
            if (euro.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(euroEuro + " euros"));
            }
        });

    }

}
