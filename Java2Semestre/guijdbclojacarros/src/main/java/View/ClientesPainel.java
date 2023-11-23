package View;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Controller.ClientesControl;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.Carros;
import Model.Clientes;

public class ClientesPainel extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField cliNomeField, cliSobrenomeField, cliIdadeField, cliCidadeField, cliCPFField;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    public ClientesPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        cliNomeField = new JTextField(20);
        inputPanel.add(cliNomeField);
        inputPanel.add(new JLabel("Sobrenome"));
        cliSobrenomeField = new JTextField(20);
        inputPanel.add(cliSobrenomeField);
        inputPanel.add(new JLabel("Idade"));
        cliIdadeField = new JTextField(20);
        inputPanel.add(cliIdadeField);
        inputPanel.add(new JLabel("Cidade"));
        cliCidadeField = new JTextField(20);
        inputPanel.add(cliCidadeField);
        inputPanel.add(new JLabel("CPF"));
        cliCPFField = new JTextField(20);
        inputPanel.add(cliCPFField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Sobrenome", "Idade", "Cidade", "CPF" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();
        // incluindo elementos do banco na criação do painel
        atualizarTabela();

        // tratamento de eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    cliNomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    cliSobrenomeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    cliIdadeField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    cliCidadeField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    cliCPFField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });

        ClientesControl cliente1 = new ClientesControl(clientes, tableModel, table);

        cadastrar.addActionListener(e -> {
            cliente1.cadastrar(cliNomeField.getText(), cliSobrenomeField.getText(), cliIdadeField.getText(),
                    cliCidadeField.getText(), cliCPFField.getText());
        });

        apagar.addActionListener(e -> {
            cliente1.apagar(cliCPFField.getText());
        });

        editar.addActionListener(e -> {
            cliente1.atualizar(cliNomeField.getText(), cliSobrenomeField.getText(), cliIdadeField.getText(),
                    cliCidadeField.getText(), cliCPFField.getText());
        });
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(
                    new Object[] { cliente.getNome(), cliente.getSobrenome(), cliente.getIdade(), cliente.getCidade(),
                            cliente.getCpf() });
        }
    }
}
