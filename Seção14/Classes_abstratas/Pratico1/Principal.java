package Seção14.Classes_abstratas.Pratico1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Conta_fps c_fps = new Conta_fps();
      Conta_rpg c_rpg = new Conta_rpg();  
     
      int cont = 1;
      int cont_2 = 1;

      boolean ini = false;

      while(ini != true){

      System.out.println("Qual tipo de conta deseja Criar: 1 - Conta_rpg // 2 - Conta_fps // 0 - Encerrar");
      Integer escolha = scanner.nextInt();

      if(escolha == 0){
        ini = true;
        System.out.println("Programa encerrado...");
        return;
      }

      switch (escolha) {
       
        case 1:
      
        System.out.println("Insira quantas contas de rpg deseja criar: ");
        Integer quantidade = scanner.nextInt();

        for(int i = 0; i< quantidade; i++){

          System.out.println("Conta #" + (cont));
          System.out.println("Insira seu nome de usuario: ");
          String nome = scanner.next();  
  
          System.out.println("Insira sua senha: ");
          Double senha = scanner.nextDouble();
          
          c_rpg = new Conta_rpg(nome, senha);
          c_rpg.escolha_de_classe(scanner);
         
          System.out.println(">> Conta_RPG #"  + cont++ + " criada !");
          System.out.println(c_rpg.visualizar_info());
          
        }
        System.out.println("-------------------------------------------");
        System.out.println("Contas_RGP finalizadas ! \n");
       
      break;
        
        case 2: 

        System.out.println("Insira quantas contas de FPS deseja criar: ");
        Integer quantidade_2 = scanner.nextInt();

        for(int i = 0; i < quantidade_2; i++){

          System.out.println("Conta #" + (cont_2));
          System.out.println("Insira seu nome de usuario: ");
          String nome_2 = scanner.next();

          System.out.println("Insira sua senha: ");
          Double senha_2 = scanner.nextDouble();

          c_fps = new Conta_fps(nome_2, senha_2);
          c_fps.escolha_de_tipo(scanner);

          System.out.println(">> Conta_FPS #"  + cont_2++ + " criada !");
          System.out.println(c_fps.visualizar_info());
          
        }
        System.out.println("-------------------------------------------");
        System.out.println("Contas_FPS finalizadas ! \n");
        
      break;

      default:
        System.out.println("<< !! Insira uma alternativa válida !! >> \n");  
      break;
      }
    }  
      scanner.close();
    }
    
}
