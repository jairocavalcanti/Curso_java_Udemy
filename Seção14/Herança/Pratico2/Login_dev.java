package Seção14.Herança.Pratico2;

import java.util.Scanner;

public class Login_dev extends Login_jogador {
      
    private String senha_dev = "dev_gta";

    Scanner scanner = new Scanner(System.in);

    public Login_dev(){
        super();
    }

    public Login_dev(String login, String senha, Integer id){
        super(login, senha, id);
    }

    public String getSenha_dev() {
        return senha_dev;
    }

    public void setSenha_dev(String senha_dev) {
        this.senha_dev = senha_dev;
    }

     public void adicionarcadastro(Login_jogador log){
        array.add(log);
    }
    

    public void alterarlogin(Integer id){
       
        for(Login_jogador f: array){
            if(id == f.getId()){
             System.out.println("Escreva o novo login: ");
             String novo_login = scanner.next();
             f.setLogin(novo_login);
             System.out.println("Login alterado com sucesso !!");
            }else{
             System.out.println("ID inserido nao existente nos cadastros!!");
            }
        }
    }


   /*  public void visualizarlogins(){
        int cont = 0;     
        for (Login_jogador f: array){
            cont += 1;  
            System.out.println(
            "#" + cont + "\n" +
            "-------------------------------------------" + "\n" +
            " |--| ID do usuário: " + "#" + f.getId() + "\n" +
            " || Login do usuário: " + f.getLogin() + "\n" +
            " || Senha do usuário: " + f.getSenha() + "\n" + 
            "-------------------------------------------"
            );    
       }

    }  */

    public void visualizarlogins_dev(){
        Login_jogador.visualizarlogins();
    }

    
    
}
