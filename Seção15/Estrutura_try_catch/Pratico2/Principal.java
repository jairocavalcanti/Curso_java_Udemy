package Seção15.Estrutura_try_catch.Pratico2;

//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int vector[] = new int[0];
      boolean t = false;
     
      while (!t) {
        
      System.out.println("Insira a operação que deseja efetuar: 1 - Definir tamanho do vetor // 2 - Visualizar vetor // 3 - Inserir elementos no vetor");
      String opcao = scanner.next();
  
      switch (opcao) {
        
      case "1":
        
      if(vector.length == 0){

        try {
          System.out.println("----");
          System.out.println("Insira o tamanho do array que deseja criar: ");
          int num_1 = scanner.nextInt(); 
          vector = new int[num_1];
          System.out.println("Vetor de tamanho " +  num_1 + " criado!");
          System.out.println("----");
          // System.out.println(Arrays.toString(vector));

        }catch (InputMismatchException e) {
          System.out.println("----");
          System.out.println("!! Apenas entradas numéricas inteiras são permitidas na criação de tamanho dos vetores !!");    
          scanner.nextLine(); // Limpa o buffer do scanner
          System.out.println("----");
          // usamos scanner.nextLine() para limpar o buffer do Scanner após capturar uma exceção de entrada incorreta
        }
      
        }else{
          System.out.println("Vetor ja foi criado!");
        }
       
      break;
      

      case "2":

      if(vector.length !=0){
        System.out.println("----------------------------");
        System.out.println("-- ARRAY --");
          for (int i : vector) {
            System.out.printf("[" + i + "]");
            }
        System.out.println("\n----------------------------");
        }else{
          System.out.println("Vetor ainda nao foi preenchido ! \n");
        }
        
      break;

      case "3":
      
      

      break;


      default:
          
        System.out.println("Insira uma mensagem valida");
        
      break;
        
        
        }

    }     
    
    scanner.close();   
  }
 
}
