package POOIntroducao;

public class RegistraAluno {

    // atributos do objeto
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;

    // atributo da classe
    private static int contadorEstudante;

    // métodos
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        double resultado = 0;
        resultado = (notaCiencias + notaMatematica + notaPortugues) / 3;
        return resultado;
    }

    public static int getQuantidadedeAlunos() {
        return contadorEstudante;
    }

    // define ou altera o nome do estudante
    public void setNome(String temp) {
        nome = temp;
    }

    // define ou altera o endereço do estudante
    public void setEndereco(String temp) {
        endereco = temp;
    }

    // define ou altera o endereço do estudante
    public void setIdade(int temp) {
        idade = temp;
    }

    // define ou altera o endereço do estudante
    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }

    // define ou altera o endereço do estudante
    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }

    // define ou altera o endereço do estudante
    public void setNotaCiencias(double temp) {
        notaCiencias = temp;
    }

}
