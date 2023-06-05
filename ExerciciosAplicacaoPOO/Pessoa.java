package ExerciciosAplicacaoPOO;

public class Pessoa {

    private String nome;
    private int dNascismento;
    private int mNascismento;
    private int aNascismento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getdNascismento() {
        return dNascismento;
    }

    public void setdNascismento(int dNascismento) {
        this.dNascismento = dNascismento;
    }

    public int getmNascismento() {
        return mNascismento;
    }

    public void setmNascismento(int mNascismento) {
        this.mNascismento = mNascismento;
    }

    public int getaNascismento() {
        return aNascismento;
    }

    public void setaNascismento(int aNascismento) {
        this.aNascismento = aNascismento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        int idade = 0;
        if (dNascismento <= 29 && mNascismento <= 5) {
            idade = 2023 - aNascismento;
        } else {
            idade = (2023 - aNascismento) - 1;
        }
        return idade;
    }

    public void imprimir() {
        System.out.println("Informações impressas");
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getdNascismento() + "/" + getmNascismento() + "/"
                + getaNascismento());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());

    }

}
