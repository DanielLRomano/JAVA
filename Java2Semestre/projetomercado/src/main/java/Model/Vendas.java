package Model;

public class Vendas {

    // atributos
    private String cpf;
    private String codBarras;
    private String quantidade;

    // construtor
    public Vendas(String cpf, String codBarras, String quantidade) {
        this.cpf = cpf;
        this.codBarras = codBarras;
        this.quantidade = quantidade;
    }

    // getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

}
