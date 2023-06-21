package Sessão10.Exercicio_Proposto.Pratico3;

public class Policial {
    
    private String nome;
    private Integer id;
    private Double salario;
   

    public Policial(){

    }

    
    public Policial(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
   
      
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
  

    public void calculo(Double porcentagem){
       salario = salario + (salario * porcentagem/100);
    }


    @Override
    public String toString() {
        return "Policial [nome=" + nome + ", id=" + id + ", salario=" + salario + "]";
    }

}
