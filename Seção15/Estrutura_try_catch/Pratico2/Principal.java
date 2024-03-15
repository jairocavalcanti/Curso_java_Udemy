package Seção15.Estrutura_try_catch.Pratico2;

//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String vector[] = new String[0];
      boolean t = false;
      int num_1 = 0;
     
      while (!t) {
        
      System.out.println("\n Insira a operação que deseja efetuar: \n" + 
      "\n1 - Definir tamanho do vetor \n" + 
      "2 - Visualizar vetor \n" + 
      "3 - Inserir elementos no vetor \n" +
      "4 - Buscar elemento especifico do vetor");
      String opcao = scanner.next();
  
      switch (opcao) {
        
      case "1":
        
      if(vector.length == 0){

        try {
          System.out.println("----");
          System.out.println("Insira o tamanho do array que deseja criar: ");
          num_1 = scanner.nextInt(); 
          vector = new String[num_1];
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
          System.out.println(" -- Tamanho do vetor ja foi definido ! -- ");
        }
       
      break;
      

      case "2":

      if(vector.length != 0){
        System.out.println("----------------------------");
        System.out.println("-- ARRAY --");
          for (String i : vector) {
            System.out.printf("[" + i + "]");
            }
        System.out.println("\n----------------------------");
        }else{
          System.out.println(" -- Impossivel visualizar: Vetor ainda nao foi criado ! -- \n");
        }
        
      break;

      case "3":
     
      if(vector.length == 0){
        System.out.println(" -- Impossivel inserir: Vetor ainda nao foi criado ! -- \n");
      }

      for(int i = 0; i< vector.length; i++){
       
        if(vector[i] == null){
          System.out.println("----------------------------");
          System.out.println("Insira o elemento de posição #" + (i+1) + " do vetor: ");
          vector[i] = scanner.next();
        }else{
          System.out.println(" -- Vetor já foi preenchido! -- ");
          break;
        }
      }

      break;

      case "4":

      try {
        
        System.out.println("\n - Insira a posição do elemento do vetor que deseja visualizar: ");
        int indice = scanner.nextInt();

        System.out.println("Elemento na posição - " + indice + ": " + vector[indice]);
        System.out.println("----------------------------");

      } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(" -- Impossivel visualizar posição: Não existente no vetor! -- \n");

      }

      break;

      default:
          
        System.out.println(" !! Insira uma mensagem válida !! ");
        
      break;
      
        }

    }     
    
    scanner.close();   
  }
 
}
