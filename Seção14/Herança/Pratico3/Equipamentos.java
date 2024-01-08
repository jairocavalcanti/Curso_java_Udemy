package Seção14.Herança.Pratico3;

import java.util.ArrayList;

public class Equipamentos {
    
    private String nome;
    private String marca;
    private Double preco;
    
    ArrayList<Equipamentos> lista = new ArrayList<>();


    public Equipamentos(){

    }
    
    public Equipamentos(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

     
    public void adicionar_a_lista(Equipamentos equip){
        lista.add(equip);
    }

    public void total(Double valor){
        
    }
    
    public void visualizar_lista(){
        
    }

    
    
}
