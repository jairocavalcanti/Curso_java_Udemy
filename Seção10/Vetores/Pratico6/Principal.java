package Seção10.Vetores.Pratico6;

import java.util.Scanner;

/*faça um programa que leia N numeros inteiros e armazene-os em um vetor. Em seguida, 
  mostre na tela
  todos os numeros pares, 
  e tambem a quantidade de numeros pares 
 */

public class Principal {
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


   System.out.println("Insira o tamanho do vetor:");
   int B = scanner.nextInt(); 
  
   int vetor[] = new int[B];

   System.out.println("Insira os elementos no vetor:");
   for(int i = 0; i< vetor.length; i++){
      vetor[i] = scanner.nextInt();
    }
    
    System.out.println("----------------------------------------");

    System.out.println("Elementos inseridos no vetor:");
    for(int i = 0; i<vetor.length; i++){
      System.out.println("[" + vetor[i] + "]");
    }

    int quanti = 0;
    for(int i = 0; i<vetor.length; i++){
     
      //"%" é o operador modulo, ou seja, o operador que retorna a sobre da divisão
      //'%' RETORNA A SOBRA DA DIVISÃO
     
      if((vetor[i] % 2) == 0){
          System.out.println("Numero par identificado:" + vetor[i]);
           quanti++;
        }   
    }
 

    System.out.println("Numeros pares encontrados:" + quanti);
    
    


    scanner.close();

  }



}
