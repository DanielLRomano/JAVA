import javax.swing.*;

public class ContainerComponentes extends JFrame {

    int clickCount = 0; // Contador de cliques

    public ContainerComponentes() {
        super("JFrame");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button = new JButton("I am a Swing button");
        JLabel clickLabel = new JLabel("Number of button clicks: " + clickCount);

        button.addActionListener(e -> {
            clickCount++;
            clickLabel.setText("Number of button clicks: " + clickCount);
        });

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(clickLabel);

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
    }
}
