package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean rodando = true;

        while (rodando) {
            String loginDigitado = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento [dd/mm/aa]");
            dataNascimento = dataNascimento.replace("/", "");
            String senhaDigitada = JOptionPane.showInputDialog("Informe uma Senha de 6 Digitos");
            try {
                if (senhaDigitada.length() != 6) {
                    throw new Exception("Senha invalida! \n Tente novamente!");
                }
                if (loginDigitado.equals(senhaDigitada)) {
                    throw new Exception("Login invalido! \n Criar um Login diferente da senha!");
                }
                if (senhaDigitada.equals(dataNascimento)) {
                    throw new Exception("Senha não pode ser igual a data de nascimento!");
                }
                JOptionPane.showMessageDialog(null, "Cadastro criado com sucesso!");
                rodando = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
