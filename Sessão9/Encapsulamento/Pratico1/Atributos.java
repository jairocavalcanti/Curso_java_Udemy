package Sessão9.Encapsulamento.Pratico1;

public class Atributos {
    private String nome;

    //metodo padrão para tecnica de encapsulamento
    public Atributos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Atributos [nome=" + nome + "]";
    }

    

    
}
