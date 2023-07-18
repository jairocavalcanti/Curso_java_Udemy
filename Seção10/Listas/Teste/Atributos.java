package Sessão10.Listas.Teste;

public class Atributos {
    
    private String nome;

    public Atributos(){

    }


    public Atributos(String nome) {
        this.nome = nome;
    }


    /*Getters and setters iplementados 
    para que o acesso 
    ao atributo privado 
    seja permitido*/
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


}
