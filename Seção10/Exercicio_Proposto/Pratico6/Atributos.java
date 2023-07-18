package Sessão10.Exercicio_Proposto.Pratico6;

public class Atributos {
    private String nome;
    public Double saldo;
    private Integer ID;
   
   
    public Atributos(String nome, Double saldo, Integer iD) {
        this.nome = nome;
        this.saldo = saldo;
        ID = iD;
    }
  
    public Atributos(){

    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Integer getID() {
        return ID;
    }
    public void setID(Integer iD) {
        ID = iD;
    }


    public void aumento(Double soma){
        saldo = saldo + soma;
    }


    @Override
    public String toString() {
        return " --- --- --- [nome = " + nome + ", saldo = " + saldo + ", ID = " + ID + "]";
    }


    

    







}
