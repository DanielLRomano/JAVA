import javax.swing.*;

public class ExercicioBotoes extends JFrame {

    int buttonCount = 1; // Contador de botões
    JPanel panel; // Painel para os botões e rótulo

    public ExercicioBotoes() {

        super("JFrame");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        createButton(); // Cria o primeiro botão
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
    }

    private void createButton() {
        JButton button = new JButton("Botão " + buttonCount);

        button.addActionListener(e -> {
            buttonCount++;
            createButton(); // Cria um novo botão ao ser clicado
        });

        panel.add(button);
    }

}
