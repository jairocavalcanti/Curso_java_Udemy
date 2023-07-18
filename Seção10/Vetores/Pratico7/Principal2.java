package Seção10.Vetores.Pratico7;

import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
  aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
  digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */
public class Principal2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos elementos vai ter o vetor?");
    Integer n = scanner.nextInt();

    int somapares = 0;
    int npares = 0;
    
    Integer vector[] = new Integer[n];

    System.out.println("Insira os elementos no vetor:");
    for(int i =0; i<vector.length; i++){
        vector[i] = scanner.nextInt();
    }

    System.out.println("Elementos inseridos no vetor:");
    for(int i =0; i<vector.length; i++){
        System.out.printf("[" + vector[i] + "]");
    }

    System.out.println();

    System.out.println("Numeros pares do vetor:");
    for(int i =0; i< vector.length; i++){
       if(vector[i]  % 2 == 0){
       System.out.println("Numero par identificado:" + vector[i]);
        }
    }

    for(int i =0; i< vector.length; i++){
        if(vector[i]  % 2 == 0){
            //somando os numeros pares a partir de uma variavel imposta em uma condição (somapares)
            somapares = somapares + vector[i];
            npares++;
        }
    }
   
    System.out.println();

    //definindo condiçao para mensagem unica a partir de uma variavel do tipo inteiro (npares)
    if(npares == 0){
        System.out.println("Nenhum numero par identificado no vetor");
    }

    double result = somapares / npares;

    System.out.println();

    //melhor forma de identificar quantidade de certo elemento:
    System.out.println("Soma dos numeros pares do vetor:" + somapares);
    System.out.println("Numeros pares desse vetor:" + npares);

    System.out.println();

    System.out.println("Media dos numeros pares:" + result);

    scanner.close();

   
    
  }
}