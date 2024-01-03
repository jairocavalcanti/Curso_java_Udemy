package Seção14.Herança.Pratico2;

import java.util.Scanner;

public class Login_dev extends Login_jogador {
      
    Scanner scanner = new Scanner(System.in);

    public Login_dev(){
        super();
    }

    public Login_dev(String login, String senha, Integer id){
        super(login, senha, id);
    }

     public void adicionarcadastro(Login_jogador log){
        array.add(log);
    }
    
    public void visualizarlogins_dev(){
        Login_jogador.visualizarlogins();
    }


    public void alterarlogin(Integer id){
       
    boolean idencontrado = false;
       
        for(Login_jogador f: array){
            if(id == f.getId()){
             System.out.println("Escreva o novo login: ");
             String novo_login = scanner.next();
             f.setLogin(novo_login);
             System.out.println("Login alterado com sucesso !!");
             idencontrado = true;
             break;
        }
      }
      if(!idencontrado){
         System.out.println("ID inserido não existente !!"); 
      }
    }
 
    
    
    
}
