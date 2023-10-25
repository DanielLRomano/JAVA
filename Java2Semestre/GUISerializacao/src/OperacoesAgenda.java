import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesAgenda {
    private List<Agenda> agendamento;
    private DefaultTableModel tableModel;
    private JTable table;

    public OperacoesAgenda(List<Agenda> agendamento, DefaultTableModel tableModel, JTable table) {
        this.agendamento = agendamento;
        this.tableModel = tableModel;
        this.table = table;
    }

    public void cadastrarUsuario(String nome, String hora, String data, String descricao) {
        Agenda agenda = new Agenda(nome, data, hora, descricao);
        agendamento.add(agenda);
        atualizarTabela();
    }

    public void atualizarUsuario(int linhaSelecionada, String nome, String hora, String data, String descricao) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(nome, data, hora, descricao);
            agendamento.set(linhaSelecionada, agenda);
            atualizarTabela();
        }
    }

    public void apagarUsuario(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendamento.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosUsuarios() {
        agendamento.clear();
        atualizarTabela();
    }

    public void salvarUsuarios() {
        Serializacao.serializar2("agenda.txt", agendamento);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendamento) {
            tableModel.addRow(
                    new Object[] { agenda.getUsuario(), agenda.getHora(), agenda.getData(), agenda.getDescricao() });
        }
    }
}
