import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        super("Exercicio3");
        JPanel painel1 = new JPanel(); // Janela principal
        String itensCB[] = { "Inicio", "Login", "Cadastro" }; // elemento de seleção dos Cards JComboBox
        JButton b1 = new JButton("Inicio");
        JButton b2 = new JButton("Login");
        JButton b3 = new JButton("Cadastro");
        painel1.add(b1);
        painel1.add(b2);
        painel1.add(b3);

        JPanel cards = new JPanel();// card principal - vai permitir a navegação
        CardLayout cl = new CardLayout();
        cards.setLayout(cl);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem vindo ao Site!"));

        JPanel card2 = new JPanel();
        card2.setLayout(new BoxLayout(card2, BoxLayout.Y_AXIS));
        card2.add(new JLabel("Login: "));
        card2.add(new JTextField(25));
        card2.add(new JLabel("Senha: "));
        card2.add(new JTextField(25));
        card2.add(new JLabel("Ainda não possui cadastro ? Cadastre-se abaixo."));
        JButton b4 = new JButton("Cadastre-se");
        card2.add(b4);

        JPanel card3 = new JPanel();
        card3.setLayout(new BoxLayout(card3, BoxLayout.Y_AXIS));
        card3.add(new JLabel("Nome Completo: "));
        card3.add(new JTextField(25));
        card3.add(new JLabel("RG ou CPF: "));
        card3.add(new JTextField(25));
        card3.add(new JLabel("Data de Nascimento: "));
        card3.add(new JTextField(25));
        card3.add(new JButton("Cadastrar"));
        card3.add(new JLabel("Já possui cadastro? Faça o login"));
        JButton b5 = new JButton("Logar");
        card3.add(b5);

        cards.add(card1, "Inicio");
        cards.add(card2, "Login");
        cards.add(card3, "Cadastro");
        painel1.add(cards);
        this.add(painel1);
        // set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 800, 500);
        this.setVisible(true);

        b1.addActionListener(e -> {
            cl.show(cards, "Inicio");
        });

        b2.addActionListener(e -> {
            cl.show(cards, "Login");
        });

        b3.addActionListener(e -> {
            cl.show(cards, "Cadastro");
        });

        b4.addActionListener(e -> {
            cl.show(cards, "Cadastro");
        });

        b5.addActionListener(e -> {
            cl.show(cards, "Login");
        });

    }

}
