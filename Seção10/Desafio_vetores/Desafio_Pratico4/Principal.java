package Seção10.Desafio_vetores.Desafio_Pratico4;

import java.util.Scanner;

/* Programa para inserir dados em determinada posição do vetor
   escolhida pelo usuário
*/

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    Atributos atri1 = new Atributos();
    
        System.out.println("insira o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        
        String vector[] = new String[tamanho]; 

        for(int i = 1; i<=vector.length; i++){
             System.out.println("insira o elemento:" + " " + i);
             String nome = scanner.next();
             
             System.out.println("Insira em qual poisçao do vetor quer armazenar o elemento:");
             int position = scanner.nextInt();

             vector[position] = nome;
             } 

            for(int i = 0; i<vector.length; i++){
                System.out.println(atri1);
             }


        scanner.close();
    }
    
}
