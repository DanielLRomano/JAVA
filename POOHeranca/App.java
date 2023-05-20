package POOHeranca;

public class App {
    public static void main(String[] args) {

        // Pessoas pessoa1 = new Pessoas();
        Alunos aluno1 = new Alunos();
        Professores professor1 = new Professores();
        Funcionarios funcionario1 = new Funcionarios();

        // pessoa1.setNome("João");
        // pessoa1.setEndereco("Rua das aguas");
        // pessoa1.setIdade(35);
        // pessoa1.setSexo("Masculino");

        aluno1.setNome("Adriano");
        aluno1.setEndereco("Rua dos ventos");
        aluno1.setIdade(27);
        aluno1.setSexo("Masculino");
        aluno1.setCurso("Java");
        aluno1.setMatricula(123456789);
        aluno1.setMediaSemestre(9.5);

        professor1.setNome("José");
        professor1.setEndereco("Rua dos fogos");
        professor1.setIdade(44);
        professor1.setSexo("Masculino");
        professor1.setMateria("Programação");
        professor1.setPeriodo("Manhã/Noite");

        funcionario1.setNome("Maria");
        funcionario1.setEndereco("Rua das terras");
        funcionario1.setIdade(54);
        funcionario1.setSexo("Feminino");
        funcionario1.setSetor("Secretária");
    }
}
