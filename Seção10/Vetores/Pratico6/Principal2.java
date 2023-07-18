package Seção10.Vetores.Pratico6;

import java.util.Scanner;

/* Faça um programa que leia N numeros reais e armazene-os em um vetor. 
Em seguida, mostrar na tela o maior numero do vetor (supor nao haver empates)
Mostrar tambem a posição do maior elemento, considerando a primeira posição como 0 (zero)
 */

 public class Principal2 {
    
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maior;


       System.out.println("Insira o numero de casas que deseja no vetor:");
       int N = scanner.nextInt();

       int vector [] = new int[N];    
       
       System.out.println("Insira o elemento no vetor:");
       for(int i = 0; i<vector.length; i++){
         vector[i] = scanner.nextInt();
        }

       System.out.println("Elementos inseridos no vetor:");
       for(int i = 0; i<vector.length; i++){
         System.out.println("[" + vector[i] + "]");
        }

       maior = vector[0];
      

    
       for(int i = 0; i<vector.length; i++){
        if(vector[i] > maior){
          maior = vector[i];  
        }
       }
      
       System.out.println("MAIOR VALOR: -- " + maior);



        scanner.close();
       }

}
