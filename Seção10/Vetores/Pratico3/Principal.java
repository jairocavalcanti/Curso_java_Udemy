package Seção10.Vetores.Pratico3;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        System.out.println("Insira a quantidade de locaçoes que voce deseja no seu array:");
        Integer n = scanner.nextInt();
           
        int vect [] = new int [n];
    
         for(int i = 0; i<n ;i++){
         System.out.println("Insira o numero:");
         vect[i] = scanner.nextInt();
        }
    
        System.out.println("--Numeros inseridos no array--");
        Integer e = 0;
        for(int i = 0; i<n ;i++){ 
            System.out.println("Numero:" + e++  + " -- " + vect[i]);
        }
 
        //Para somar valores de um vetor é necessaria a criação de uma variavel de mesmo tipo do vetor com valor 0
        //A variavel sera somada juntamente com os outros valores como no laço for abaixo
        double zero = 0;
        for(int i = 0; i<n ;i++){
            zero += vect[i];
        }

       //Apos a soma, pegamos a variavel que tinha valor zero incialmente porem "guardou" a soma dos demais valores
       //A impressao de tal variavel nos trará o valor da soma
       System.out.println("--Soma dos elementos do Array--");
       System.out.println(zero);

        scanner.close();

    }

}
