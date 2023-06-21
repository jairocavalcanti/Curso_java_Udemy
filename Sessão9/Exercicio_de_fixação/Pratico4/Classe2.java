package Sessão9.Exercicio_de_fixação.Pratico4;

public class Classe2 {
    
    Integer atributo1;
    Integer atributo2;
   
   
    public Classe2(Integer atributo1, Integer atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
   
   
    public Integer getAtributo1() {
        return atributo1;
    }
    public void setAtributo1(Integer atributo1) {
        this.atributo1 = atributo1;
    }
    public Integer getAtributo2() {
        return atributo2;
    }
    public void setAtributo2(Integer atributo2) {
        this.atributo2 = atributo2;
    }


    @Override
    public String toString() {
        return "Classe2 -- [atributo1 = " + atributo1 + ", atributo2 = " + atributo2 + "]";
    }



}
