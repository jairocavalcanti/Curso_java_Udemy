package Sessão9.Sobrecarga.Pratico1;

public class Elementos {
    
    String elemento;
    String elemento2;
    String elemento3;
    

    public Elementos(String elemento, String elemento2, String elemento3) {
        this.elemento = elemento;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }


    public Elementos(String elemento, String elemento2) {
        this.elemento = elemento;
        this.elemento2 = elemento2;
    }


    @Override
    public String toString() {
        return 
                "Primeiro elemento:  "  + elemento 
       + "  " + "Segundo elemento:  " + elemento2 
       + "  " + "Terceiro elemento:  " + elemento3 ;
    }




}
