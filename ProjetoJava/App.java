package ProjetoJava;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        ContaPF contasPF[] = new ContaPF[10];
        ContaPJ contasPJ[] = new ContaPJ[10];

        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;
        int contaAtualPF = 0;
        int contaAtualPJ = 0;

        while (aberta) {
            int acao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Escolha a ação desejada"
                                    + "\n 1 - Abrir conta"
                                    + "\n 2 - Acessar conta"
                                    + "\n 3 - Sair"));
            if (acao == 1) {
                boolean criarContas = true;
                while (criarContas) {
                    int acaoContas = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Escolha qual tipo de conta deseja criar"
                                            + "\n 1 - Abrir conta PF"
                                            + "\n 2 - Abrir conta PJ"
                                            + "\n 3 - Voltar ao menu principal"));

                    if (acaoContas == 1) {
                        contasPF[contPF] = new ContaPF();
                        contasPF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                        contasPF[contPF].setSaldo(0);
                        contasPF[contPF].setnConta(1000 + contPF);
                        JOptionPane.showMessageDialog(null,
                                "Conta criada com Sucesso!"
                                        + "\n Nome: " + contasPF[contPF].getNome()
                                        + "\n CPF: " + contasPF[contPF].getnCpf()
                                        + "\n Saldo: " + contasPF[contPF].getSaldo()
                                        + "\n Conta: " + contasPF[contPF].getnConta());
                        contPF++;
                        criarContas = false;
                    } else if (acaoContas == 2) {
                        contasPJ[contPJ] = new ContaPJ();
                        contasPJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CPF:"));
                        contasPJ[contPJ].setSaldo(0);
                        contasPJ[contPJ].setnConta(2000 + contPJ);
                        JOptionPane.showMessageDialog(null,
                                "Conta criada com Sucesso!"
                                        + "\n Nome: " + contasPJ[contPJ].getNome()
                                        + "\n CNPJ: " + contasPJ[contPJ].getnCnpj()
                                        + "\n Saldo: " + contasPJ[contPJ].getSaldo()
                                        + "\n Conta: " + contasPJ[contPJ].getnConta());
                        contPJ++;
                        criarContas = false;
                    } else if (acaoContas == 3) {
                        criarContas = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }
            } else if (acao == 2) {
                boolean acessarContas = true;
                while (acessarContas) {
                    int acaoAcessar = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Escolha qual tipo de conta deseja acessar"
                                            + "\n 1 - Conta PF"
                                            + "\n 2 - Conta PJ"
                                            + "\n 3 - Voltar ao menu principal"));
                    if (acaoAcessar == 1) {
                        int nContaBuscaPF = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                        int i = 0;
                        while (nContaBuscaPF != contasPF[i].getnConta()) {
                            contaAtualPF = i;
                            i++;
                        }
                        JOptionPane.showMessageDialog(null, "Conta Encontrada!");
                        boolean acessarPF = true;
                        while (acessarPF) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1 - Verificar saldo."
                                    + "\n 2 - Saque."
                                    + "\n 3 - Depósito."
                                    + "\n 4 - Empréstimo."
                                    + "\n 5 - Sair da conta."));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null, "Saldo: " + contasPF[contaAtualPF].getSaldo());
                            } else if (acao2 == 2) {
                                contasPF[contaAtualPF].saque();
                            } else if (acao2 == 3) {
                                contasPF[contaAtualPF].deposito();
                            } else if (acao2 == 4) {
                                contasPF[contaAtualPF].emprestimo();
                            } else if (acao2 == 5) {
                                acessarPF = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                            }
                        }
                    } else if (acaoAcessar == 2) {
                        int nContaBuscaPF = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                        int i = 0;
                        while (nContaBuscaPF != contasPF[i].getnConta()) {
                            contaAtualPF = i;
                            i++;
                        }
                        JOptionPane.showMessageDialog(null, "Conta Encontrada!");
                        boolean acessarPJ = true;
                        while (acessarPJ) {
                            int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1 - Verificar saldo."
                                    + "\n 2 - Saque."
                                    + "\n 3 - Depósito."
                                    + "\n 4 - Empréstimo."
                                    + "\n 5 - Sair da conta."));
                            if (acao3 == 1) {
                                JOptionPane.showMessageDialog(null, "Saldo: " + contasPJ[contaAtualPJ].getSaldo());
                            } else if (acao3 == 2) {
                                contasPJ[contaAtualPJ].saque();
                            } else if (acao3 == 3) {
                                contasPJ[contaAtualPJ].deposito();
                            } else if (acao3 == 4) {
                                contasPJ[contaAtualPJ].emprestimo();
                            } else if (acao3 == 5) {
                                acessarPJ = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                            }
                        }
                    } else if (acaoAcessar == 3) {
                        acessarContas = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }
            } else if (acao == 3) {
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                aberta = false;
            } else {
                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
            }

        }
    }

}
