package Model;

public class Estoque {

    // atributos
    private String nomeProduto;
    private String codBarras;
    private String quantidade;
    private String preco;

    // construtor
    public Estoque(String nomeProduto, String codBarras, String quantidade, String preco) {
        this.nomeProduto = nomeProduto;
        this.codBarras = codBarras;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    // getters and setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
