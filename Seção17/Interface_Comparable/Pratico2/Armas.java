package Seção17.Interface_Comparable.Pratico2;

public class Armas implements Comparable<Armas> {
    
    private String nome;
    private Integer numeroDeSerie;
    
    public Armas(String nome, Integer numeroDeSerie) {
        this.nome = nome;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(Integer numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public int compareTo(Armas armas){
        return this.nome.compareTo(armas.nome);
    }

}
