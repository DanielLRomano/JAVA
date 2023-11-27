package View;

import javax.swing.JPanel;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Estoque;

import java.lang.Object;

public class JanelaEstoque extends JPanel {

    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField nomeProdutoField, codBarrasField, quantidadeField, precoField;
    private List<Estoque> estoques;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public JanelaEstoque() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Produtos / Estoque"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Nome do Produto"));
        nomeProdutoField = new JTextField(20);
        inputPanel.add(nomeProdutoField);

        inputPanel.add(new JLabel("Código de Barras"));
        codBarrasField = new JTextField(20);
        inputPanel.add(codBarrasField);

        inputPanel.add(new JLabel("Quantidade"));
        quantidadeField = new JTextField(20);
        inputPanel.add(quantidadeField);

        inputPanel.add(new JLabel("Preço"));
        precoField = new JTextField(20);
        inputPanel.add(precoField);

        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        cadastrar.setBackground(Color.white);
        botoes.add(editar = new JButton("Editar"));
        editar.setBackground(Color.white);
        botoes.add(apagar = new JButton("Apagar"));
        apagar.setBackground(Color.white);

        // tabela de Produtos
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome do Produto", "Código de Barras", "Quantidade", "Preço" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        add(botoes);
        // new CarrosDAO().criaTabela();

        // incluindo elementos do banco na criação do painel
        // atualizarTabela();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    nomeProdutoField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    codBarrasField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    quantidadeField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    precoField.setText((String) table.getValueAt(linhaSelecionada, 3));
                }
            }
        });

    }

}
