package Sessão10.Vetores.Pratico5;

import java.util.Scanner;

/*
 faça um programa que leia um numero positivo N (maximo = 10) 
 e depois n numeros inteiro e armazene-os em um vetor. Em seguida,
 mostrar na tela todos os numeros negativos lidos
*/
public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Insira o numero de casas do vetor:");
        int tam = scanner.nextInt();

        int vect[] = new int[tam];

        for(int i = 0 ; i<vect.length; i++){
           System.out.println("Insira:");
           vect[i] = scanner.nextInt();
        }
   
        scanner.close();

        System.out.println("Elementos inseridos no vetor:");
        Integer cont = 0;
        for(int i = 0; i < vect.length; i++){
           System.out.println("Elemento -- " + cont++ + " -- " + vect[i]);
        }
   
        Integer cont2 = 1;
        Integer e = 0;
        for( e =0; e<vect.length; e++){
           if(vect[e] < 0){
             System.out.println("Numeros negativos encontrados:" + cont2++ + " -- " + vect[e]);
           }
        }

       
    
   
    }

}
