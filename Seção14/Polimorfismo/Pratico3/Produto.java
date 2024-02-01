package Seção14.Polimorfismo.Pratico3;

public class Produto {
    
    private String nome;
    private Double preco;
   

    public Produto(){

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiqueta_de_preco(){
        StringBuilder sb = new StringBuilder();

        sb.append(nome + " " + "R$ "+ preco);
        return sb.toString();
    }
    
}
