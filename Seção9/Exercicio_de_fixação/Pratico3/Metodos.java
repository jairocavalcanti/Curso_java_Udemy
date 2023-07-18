package Sessão9.Exercicio_de_fixação.Pratico3;

public class Metodos {
    
    public Integer quantidademuniçao;
    public String nomedaarma;
    public Double calibre;
   
   
    public Metodos(Integer quantidademuniçao, String nomedaarma, Double calibre) {
        this.quantidademuniçao = quantidademuniçao;
        this.nomedaarma = nomedaarma;
        this.calibre = calibre;
    }

    public Metodos(String nomedaarma, Double calibre) {
        this.nomedaarma = nomedaarma;
        this.calibre = calibre;
    }

    public Integer adicionarmuniçao(Integer add){
        return quantidademuniçao += add;
    }
    
    public Integer subtrairmuniçao(Integer sub){
        return quantidademuniçao -= sub;
    }

    @Override
    public String toString() {
        return "INFO: ---- [quantidademuniçao=" + quantidademuniçao + ", nomedaarma=" + nomedaarma + ", calibre=" + calibre
                + "]";
    }

    



    
}
