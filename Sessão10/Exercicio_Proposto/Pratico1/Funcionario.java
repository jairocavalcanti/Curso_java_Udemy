package Sessão10.Exercicio_Proposto.Pratico1;

public class Funcionario {
    
    String id;
    String nome;
    Double salario;
    

    public Funcionario(){
        
    }

    public Funcionario(String id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "ID funcionário: " + nome + " --- " + id ;
    }

   
    public Double aumento(Double porcentagem){
       return this.salario/100 * porcentagem ;
    }


}
