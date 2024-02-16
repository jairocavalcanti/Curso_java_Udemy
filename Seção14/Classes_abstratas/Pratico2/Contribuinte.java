package Seção14.Classes_abstratas.Pratico2;

public abstract class Contribuinte {
    
    private String nome;
    protected Double renda_anual;
   

    public Contribuinte(){

    }
    
    public Contribuinte(String nome, Double renda_anual) {
        this.nome = nome;
        this.renda_anual = renda_anual;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda_anual() {
        return renda_anual;
    }

    public void setRenda_anual(Double renda_anual) {
        this.renda_anual = renda_anual;
    }


    public abstract Double taxa();
    
}
