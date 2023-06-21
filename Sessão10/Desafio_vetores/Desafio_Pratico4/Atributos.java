package Sessão10.Desafio_vetores.Desafio_Pratico4;

public class Atributos {
    
    String modelo;
    Integer ano;
    
    public Atributos(){ 
    }

    public Atributos(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "[modelo=" + modelo + ", ano=" + ano + "]";
    }
 

    

    

}
