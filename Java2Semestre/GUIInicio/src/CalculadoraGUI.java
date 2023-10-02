import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton equalsButton;
    private JButton clearButton;
    private double num1, num2, result;
    private char operator;

    public CalculadoraGUI() {
        setTitle("Calculadora GUI");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        operationButtons = new JButton[4];
        String[] operators = { "+", "-", "*", "/" };
        for (int i = 0; i < 4; i++) {
            operationButtons[i] = new JButton(operators[i]);
            operationButtons[i].addActionListener(this);
            buttonPanel.add(operationButtons[i]);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String buttonText = button.getText();

            if (buttonText.matches("[0-9]")) {
                inputField.setText(inputField.getText() + buttonText);
            } else if (buttonText.matches("[+\\-*/]")) {
                num1 = Double.parseDouble(inputField.getText());
                operator = buttonText.charAt(0);
                inputField.setText("");
            } else if (buttonText.equals("=")) {
                num2 = Double.parseDouble(inputField.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            inputField.setText("Erro: divisão por zero");
                            return;
                        }
                        break;
                }
                inputField.setText(String.valueOf(result));
            } else if (buttonText.equals("C")) {
                inputField.setText("");
            }
        }
    }

}
