package Seção17.Herança_Multipla.Pratico3.Bancos;

public abstract class Bancos {
    
    private String nome;

    public Bancos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String nome(String nome);

}
