import javax.swing.*;
import java.awt.*;

public class LayoutCalculadoraGUI {
    public LayoutCalculadoraGUI() {
        // contruir o Layout de uma calculadora
        JFrame janelaP = new JFrame("Layout Calculadora");
        BorderLayout border = new BorderLayout();
        janelaP.setLayout(border);

        JPanel painelA = new JPanel();
        janelaP.getContentPane().add(painelA, BorderLayout.NORTH); // setando o painelA para ficar em cima no JFrame
        painelA.add(new JTextField(25));

        JPanel painelB = new JPanel();// padrão FlowLayout
        janelaP.getContentPane().add(painelB, BorderLayout.SOUTH); // setando o painelB para ficar em baixo no JFrame
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);

        // Vetor com os texto dos botões
        String textBotoes[] = { "C", "9", "8", "7", "/", "6", "5", "4", "*", "3", "2", "1", "-", "+", "0", "=" };
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }

        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
