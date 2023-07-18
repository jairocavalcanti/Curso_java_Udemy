package Seção10.Exercicio_Proposto.Pratico5;

public class Jogadores {
    private String nome;
    private Integer pontosjogador;
    private Integer id;


    public Jogadores(String nome, Integer pontosjogador, Integer id) {
        this.nome = nome;
        this.pontosjogador = pontosjogador;
        this.id = id;
    }


    public Jogadores(){

    }
    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Integer getPontosjogador() {
        return pontosjogador;
    }



    public void setPontosjogador(Integer pontosjogador) {
        this.pontosjogador = pontosjogador;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "Jogadores [nome = " + nome +  ", Id_jogador = " + id + ", Pontos_jogador = " + pontosjogador + "]";
    }

    
    public void somapontos(Integer pontos){
        pontosjogador = pontosjogador + pontos;
    }
    


}
