package Seção14.Herança.Pratico2;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    Login_jogador lgj_1 = new Login_jogador();
 

   
    System.out.println("Insira qual login deseja realizar: 1 - Login_usuario // 2 - Login_dev");
    int escolha = scanner.nextInt();

    if(escolha == 1){
    Boolean bool = false;

    while (bool != true) {
            
    System.out.println("Insira a operação que deseja realizar:  1 - Cadastrar_Login // 2 - Visualizar_Login");
    int escolha2 = scanner.nextInt();
    
    switch (escolha2) {
    
    case 0: 
       bool = true;
       System.out.println("Encerrado...");
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
       lgj_1.adicionarcadastro(lgj_2);
       System.out.println("----------------------------------------"); 
       break;
    
    case 2:
       System.out.println(); 
       System.out.println("----------------------------------------");
       System.out.println("LISTA_DE_LOGINS_CADASTRADOS");
       lgj_1.visualizarcadastros();
       System.out.println("----------------------------------------");
       break;
       
    default:
       System.out.println("----------------------------------------");
       System.out.println("Insira uma opção válida !!");    
       System.out.println("----------------------------------------");
        break;
    }
  }  
}  
 
    scanner.close();
    }
}
