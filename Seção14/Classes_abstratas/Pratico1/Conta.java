package Seção14.Classes_abstratas.Pratico1;

import java.text.DecimalFormat;

//"abstract" torna a classe "Conta" abstrata
//Impossibilitando assim sua instancia, ela apenas pode ser herdada por outras classes
public abstract class Conta { 

    private String login;
    private Double senha;
    
    
    public Conta(){

    }
    
    public Conta(String login, Double senha) {
        this.login = login;
        this.senha = senha;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Double getSenha() {
        return senha;
    }

    public void setSenha(Double senha) {
        this.senha = senha;
    }

    
    public String visualizar_info(){
      StringBuilder sb = new StringBuilder();
      DecimalFormat df = new DecimalFormat("####");

      sb.append("Login: ").append(login + "\n");  
      sb.append("Senha: ").append(df.format(senha) + "\n");
      
      return sb.toString();
    }
  
    
}
