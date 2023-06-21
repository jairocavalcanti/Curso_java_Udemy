package Sessão9.Encapsulamento.Pratico2;

public class Atributos2 {
    
    String nome;
    Integer preço;
    Integer quantidade;
   
     public Atributos2(String nome, Integer preço, Integer quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
 
    public void adicionarprodutos(Integer quantidade){
        this.quantidade += quantidade;
    }

    public void subtrairprodutos(Integer quantidade){
        this.quantidade -= quantidade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPreço() {
        return preço;
    }
    public void setPreço(Integer preço) {
        this.preço = preço;
    }
    public Integer getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "Atributos atualizados por encapsulamento: [nome=" + nome + ", preço=" + preço + ", quantidade=" + quantidade + "]";
    }


    


}
