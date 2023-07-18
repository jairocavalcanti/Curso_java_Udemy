package Seção10.Desafio_vetores.Desafio_Pratico2;

public class Atributos {
    
   private String nome;
  
 
   public Atributos(){
  
   }


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
        return " [nome=" + nome + "]";
    }

 
    
     


}
