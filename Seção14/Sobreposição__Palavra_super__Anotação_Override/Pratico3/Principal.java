package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico3;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Central cent = new Central("KOMAROV_12", "Rússia");
        Central usi = new Usina_1("KOMAROV_50", "Ucrânia");
        Central usi_2 = new Usina_2("KOMAROV_111", "Moldávia");

        boolean ini = true;
        
        while(ini == true){
        System.out.println("Insira qual usina deseja operar: 1 - Central // 2 - Usina_1 // 3 - Usina_2 // 0 - Encerrar");
        String escolha = scanner.next();
        
        if(escolha.equals("0")){
            ini = false;
            System.out.println("Programa encerrado...");
        }

        while(escolha.equals("1")){
           
            System.out.println("Insira o operação que deseja: \n" 
            + " // 1 - Ligar \n" 
            + " // 2 - Desligar \n" 
            + " // 3 - Consultar estado \n"  
            + " // 4 - Consultar dados \n"
            + " // 0 - Encerrar");
            System.out.printf(">>> :");
            String escolha_2 = scanner.next();

            if(escolha_2.equals("1")){
                System.out.println("Usina ligada!");
                cent.Ligar_usina();
            }else if(escolha_2.equals("2")){
                System.out.println("Usina desligada!");
                cent.desligar_usina();
            }else if(escolha_2.equals("3")){
                cent.Estado();
            }else if(escolha_2.equals("0")){
                System.out.println("Operação encerrada...");
                break;
            }else{
                cent.Info();
            }

        }
        
        while(escolha.equals("2")){

            System.out.println("Insira o operação que deseja: \n" 
            + " // 1 - Ligar \n" 
            + " // 2 - Desligar \n" 
            + " // 3 - Consultar estado \n"  
            + " // 4 - Consultar dados \n"
            + " // 0 - Encerrar");
            System.out.printf(">>> :");
            String escolha_2 = scanner.next();

            if(escolha_2.equals("1")){
                usi.Ligar_usina();
            }else if(escolha_2.equals("2")){
                usi.desligar_usina();
            }else if(escolha_2.equals("3")){
                usi.Estado();
            }else if(escolha_2.equals("0")){
                System.out.println("Operação encerrada...");
                break;
            }else{
                usi.Info();
            }

        }

        while(escolha.equals("3")){

            System.out.println("Insira o operação que deseja: \n" 
            + " // 1 - Ligar \n" 
            + " // 2 - Desligar \n" 
            + " // 3 - Consultar estado \n"  
            + " // 4 - Consultar dados \n"
            + " // 0 - Encerrar");
            System.out.printf(">>> :");
            String escolha_2 = scanner.next();

            if(escolha_2.equals("1")){
                usi_2.Ligar_usina();
            }else if(escolha_2.equals("2")){
                usi_2.desligar_usina();
            }else if(escolha_2.equals("3")){
                usi_2.Estado();
            }else if(escolha_2.equals("0")){
                System.out.println("Operação encerrada...");
                break;
            }else{
                usi_2.Info();
            }

        }
      
    }
    scanner.close();
 } 
    
}
