package Seção8.Pratico1;

public class Product {
    
    public String nome;
    public double preço;
    public int quantidade;
 
    
    public double totalvalornoestoque(){
        return preço * quantidade;
    }

    public void adicionarprodutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerprodutos(int quantidade){
        this.quantidade -= quantidade;        
    }

    public String toString() {
        return nome
        + ", $"
        //convertendo variavel com mascara de formataçao "%.2f", 
        //para se ter 2 casas decimais
        + String.format("%.2f", preço)
        +", "
        + quantidade
        + " unidades , total: $"
        +  String.format("%.2f", totalvalornoestoque());
    }


    
    




    
}
