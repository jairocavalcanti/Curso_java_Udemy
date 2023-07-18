package Sessão8.Pratico2;

public class Funcionario {
  public String nome;
  public Double salariobruto;
  public Double taxa;
  

  public Double desconto(){
    return salariobruto -= taxa;
  }
  
  public double aumento(double porcentagem){
    return salariobruto * porcentagem/100 + salariobruto;
  }
  
  @Override
  public String toString() {
      return ("Nome do funcionario:" + nome + "//" 
      + 
      "Salario liquido do funcionario :" + salariobruto)
      +
      "Salario descontado:" + desconto();
  }



}
