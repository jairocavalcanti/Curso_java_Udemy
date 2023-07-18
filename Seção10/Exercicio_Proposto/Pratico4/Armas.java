package Seção10.Exercicio_Proposto.Pratico4;

public class Armas {
    
    String nome;
    Integer numerodeserie;
   
    public Armas(String nome, Integer numerodeserie) {
        this.nome = nome;
        this.numerodeserie = numerodeserie;
    }


    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Integer getNumerodeserie() {
        return numerodeserie;
    }



    public void setNumerodeserie(Integer numerodeserie) {
        this.numerodeserie = numerodeserie;
    }



    @Override
    public String toString() {
        return "Armas [nome = " + nome + ", numerodeserie = " + numerodeserie + "]";
    }

}
