package Seção14.Herança.Pratico2;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    Login_jogador lgj_1 = new Login_jogador();
    Login_dev lgd_1 = new Login_dev();

    boolean inicio = false;
    Boolean bool = true;

    while(inicio != true){
    System.out.println("Insira qual login deseja realizar: 1 - Login_jogador // 2 - Login_desenvolvedor ");
    int escolha = scanner.nextInt();
    
    if(escolha == 1){
    bool = false;
    System.out.println("-- BEM VINDO JOGADOR ! --");  
    while (bool != true) {
     
  
    System.out.println("Insira a operação que deseja realizar:  1 - Cadastrar_Login // 2 - Visualizar_Login // 0 - Encerrar");
    int escolha2 = scanner.nextInt();
    
    switch (escolha2) {
      
   case 0: 
       bool = true;
       System.out.println("Login_jogador - Encerrado...");
       break;
      
   case 1:         
       System.out.println("----------------------------------------");
       Integer rand2 = rand.nextInt(1,100);
       System.out.println("Id do usuário: #" + rand2);
       System.out.printf("Insira o Login de usuario: ");
       String login = scanner.next();
       System.out.printf("Insira a senha do usuario: ");
       String senha = scanner.next();

       Login_jogador lgj_2 = new Login_jogador(login, senha, rand2);
       lgj_1.adicionarlogin(lgj_2);
       System.out.println("Login adicionado com sucesso !");
       System.out.println("----------------------------------------"); 
       break;
      
   case 2:
       System.out.println(); 
       System.out.println("----------------------------------------");
       System.out.println(" ---- LISTA_DE_LOGINS_CADASTRADOS ---- ");
       Login_jogador.visualizarlogins();
       break;
       
   default:
       System.out.println("----------------------------------------");
       System.out.println("Insira uma opção válida !!");    
       System.out.println("----------------------------------------");
       break;
       }
     }  
   }  
  
    if(escolha == 2){
    bool = false;
    System.out.println("-- BEM VINDO DESENVOLVEDOR ! --");  
    while (bool != true) {
     
    System.out.println("Insira a operação que deseja realizar:  1 - Cadastrar_Login // 2 - Visualizar_Login // 3 - Alterar_login // 0 - Encerrar");
    int escolha2 = scanner.nextInt();
   
    switch (escolha2) {
    
   case 0: 
       bool = true;
       System.out.println("Login_desenvolvedor - Encerrado...");
       break;
     

   case 1:         
       System.out.println("----------------------------------------");
       Integer rand2 = rand.nextInt(1,100);
       System.out.println("Id do usuário: #" + rand2);
       System.out.printf("Insira o Login de usuario: ");
       String login = scanner.next();
       System.out.printf("Insira a senha do usuario: ");
       String senha = scanner.next();

       Login_dev lgd_2 = new Login_dev(login, senha, rand2);
       lgd_1.adicionarcadastro(lgd_2);
       System.out.println("Login adicionado com sucesso !");
       System.out.println("----------------------------------------"); 
       break;
    
   case 2:
       System.out.println(); 
       System.out.println("----------------------------------------");
       System.out.println(" -- LISTA_DE_LOGINS_CADASTRADOS -- ");
       lgd_1.visualizarlogins_dev();
       break;
     
   case 3:
      System.out.println("Insira o ID de login que deseja modificar: ");
      Integer id = scanner.nextInt();
      lgd_1.alterarlogin(id);
      break;

    default:
       System.out.println("----------------------------------------");
       System.out.println("Insira uma opção válida !!");    
       System.out.println("----------------------------------------");
       break;
    
      }
     }  
   }
 }
    scanner.close();
  }
}