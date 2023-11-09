package app;

import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        // new ConnectionDAO().criarTabela();
        // new ConnectionDAO().inserir("Daniel", "romanodaniel1012@gmail.com");
        // new ConnectionDAO().buscarPorId(1);
        // new ConnectionDAO().apagarID(1);
        // new ConnectionDAO().atualizarID(2, "joao", "joao@joao");
        new ConnectionDAO().listarTodos();
    }
}