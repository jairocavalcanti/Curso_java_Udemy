package Sessão10.Desafio_vetores.Desafio_Pratico3;

public class Atributos {
    
    private String nome;
    private String calibre;
   
    public Atributos(){

    }

    public Atributos(String nome, String calibre) {
        this.nome = nome;
        this.calibre = calibre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", calibre=" + calibre + "]";
    }

    
    

}
