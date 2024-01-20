package Seção14.Classes_e_metodos_final.Pratico1;

import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Cadastro cad = new Cadastro();
      Cadastro_dev cadev = new Cadastro_dev();

      boolean ini = true;

      while (ini != false) {
  
      System.out.println(">> Insira a operação que deseja realizar: \n "  
      + " 1 - Cadastro_usuario \n " 
      + " 2 - Cadastro_dev \n "
      + " 3 - Visualizar_cadastros_usuarios \n "
      + " 4 - Visualizar_cadastros_dev \n");
      String opcao = scanner.next();

      if(opcao.equals("1")){
        System.out.println("Insira a << Quantidade >> de cadastros de usuário que deseja realizar: ");
        int quantidade = scanner.nextInt();

        System.out.println("------------------------------------------");

        int cont = 1;
        for(int i = 0; i < quantidade; i++){
            System.out.println("Cadastro de numero -- [" + cont++ + "]");
            System.out.println("Insira o nome do usuário: ");
            String nome = scanner.next();

            System.out.println("Insira a idade do usuário: ");
            Integer idade = scanner.nextInt();

            Cadastro cadastro_usuario = new Cadastro(nome, idade);

            cad.cadastrar(cadastro_usuario);
            
            System.out.println("------------------------------------------");
            System.out.println();
            }
        }
      
      if(opcao.equals("2")){
        System.out.println("Insira a << Quantidade >> de cadastros de dev que deseja realizar: ");
        int quantidade = scanner.nextInt();

        System.out.println("------------------------------------------");
        
        int cont = 1;
        for(int i = 0; i < quantidade; i++){
            System.out.println("Cadastro de numero -- [" + cont++ + "]");
            System.out.println("Insira o nome do desenvolvedor: ");
            String nome = scanner.next();

            System.out.println("Insira a idade do desenvolvedor: ");
            Integer idade = scanner.nextInt();

            Cadastro_dev cadastro_dev = new Cadastro_dev(nome, idade);

            cadev.cadastrar(cadastro_dev);
            
            System.out.println("------------------------------------------");
            System.out.println();
        
          }
     
        }   
   
      if(opcao.equals("3")){
        cad.mostrar_cadastros();
      }  
    
      if(opcao.equals("4")){
        cadev.mostrar_cadastros();
      }
      
    }  
    scanner.close(); 
   }

}

