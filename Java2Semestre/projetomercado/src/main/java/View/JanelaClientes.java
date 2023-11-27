package View;

import java.util.ArrayList;
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

import Model.ClienteVip;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class JanelaClientes extends JPanel {

    // atributos - componentes
    // campo de texto - JTextField
    private JTextField inputCpf;
    private JTextField inputNome;
    private JTextField inputTelefone;
    // campo escrito - JLabel
    private JLabel labelCpf;
    private JLabel labelNome;
    private JLabel labelTelefone;

    private DefaultTableModel tableModel; // lógica
    private JTable table; // visual
    private List<ClienteVip> clientes = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, apagarButton, editarButton;

    public JanelaClientes() {
        JPanel frame1 = new JPanel();
        JPanel inputFrame = new JPanel();
        JPanel botoes = new JPanel();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        frame1.setLayout(new BorderLayout());

        // criar os componentes
        inputCpf = new JTextField(20);
        inputNome = new JTextField(20);
        inputTelefone = new JTextField(20);

        // criar os componentes - labels
        labelCpf = new JLabel("CPF");
        labelNome = new JLabel("Nome");
        labelTelefone = new JLabel("Telefone");

        // construir a tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("CPF");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Telefone");

        table = new JTable(tableModel);
        table.setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);

        // botões
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBackground(Color.white);

        apagarButton = new JButton("Apagar");
        apagarButton.setBackground(Color.white);

        editarButton = new JButton("Editar");
        editarButton.setBackground(Color.white);

        // adicionar os componentes
        inputFrame.add(labelNome);
        inputFrame.add(inputNome);
        inputFrame.add(labelCpf);
        inputFrame.add(inputCpf);
        inputFrame.add(labelTelefone);
        inputFrame.add(inputTelefone);

        botoes.add(cadastrarButton);
        botoes.add(apagarButton);
        botoes.add(editarButton);

        this.add(frame1);
        frame1.add(scrollPane, BorderLayout.NORTH);
        frame1.add(inputFrame, BorderLayout.CENTER);
        frame1.add(botoes, BorderLayout.SOUTH);

        // Criar o banco de dados

        // incluir os elementos do banco na criação do painel


        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputCpf.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 1));
                    inputTelefone.setText((String) table.getValueAt(linhaSelecionada, 2));
                }
            }
        });

    }
}
