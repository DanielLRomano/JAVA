package POOIntroducao;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        ana.setNome("Ana Machado");
        ana.setEndereco("Rua das flores, Nº123");
        ana.setIdade(18);
        ana.setNotaCiencias(9);
        ana.setNotaMatematica(8);
        ana.setNotaPortugues(7);

        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua das arvores, Nº321");
        beto.setIdade(18);
        beto.setNotaCiencias(7);
        beto.setNotaMatematica(6);
        beto.setNotaPortugues(8);

        carlos.setNome("Carlos Alberto");
        carlos.setEndereco("Rua das pedras, Nº231");
        carlos.setIdade(18);
        carlos.setNotaCiencias(8);
        carlos.setNotaMatematica(5);
        carlos.setNotaPortugues(10);

        System.out.println("Nome: " + ana.getNome());
        System.out.println("Endereço: " + ana.getEndereco());
        System.out.println("Idade: " + ana.getIdade());
        System.out.println("Média: " + ana.getMedia());
        System.out.println("");

        System.out.println("Nome: " + beto.getNome());
        System.out.println("Endereço: " + beto.getEndereco());
        System.out.println("Idade: " + beto.getIdade());
        System.out.println("Média: " + beto.getMedia());
        System.out.println("");

        System.out.println("Nome: " + carlos.getNome());
        System.out.println("Endereço: " + carlos.getEndereco());
        System.out.println("Idade: " + carlos.getIdade());
        System.out.println("Média: " + carlos.getMedia());

        System.out.println("Contador: " + RegistraAluno.getQuantidadedeAlunos());
    }
}