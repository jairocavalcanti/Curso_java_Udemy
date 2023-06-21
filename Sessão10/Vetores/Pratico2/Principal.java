package Sessão10.Vetores.Pratico2;

import java.util.Scanner;

/*
 Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.  
*/
public class Principal {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Insira o tamanho do vetor:");
        int N = scanner.nextInt();

        int vetor[] = new int[N];

        System.out.println("Insira os elementos do vetor:");
        for(int i = 0; i< vetor.length; i++){
          System.out.printf("[-- " );
          vetor[i] = scanner.nextInt();  
        }

        System.out.println("Elementos inseridos no vetor:");
        for( int i = 0; i<vetor.length; i++){
          System.out.println("[" + vetor[i] + "]");
        }

        System.out.println();

        int cont = 0;
        
        System.out.println("Numeros negativos inseridos no vetor:");
       
        for( int i = 0; i<vetor.length; i++){
          if(vetor[i] < 0){
            System.out.println("[" + vetor[i] + "]");
            cont++;
            }
          }if(cont == 0){
          System.out.println(" <--- Nenhum numero negativo inserido no vetor ---> ");
        }
        
        scanner.close();
      }
    }
