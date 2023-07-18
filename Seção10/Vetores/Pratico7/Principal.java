package Seção10.Vetores.Pratico7;

import java.util.Scanner;

/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
   mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
   os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  
*/
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //tamanho do vetor precisa ser inteiro 
        //indenpendente do tipo dos elementos guardados no mesmo
        System.out.println("Insira o tamanho do vetor:");
        int N = scanner.nextInt();
      
        Double vector[] = new Double[N];

        System.out.println("Insira os elementos no vetor:");
        for(int i=0; i<vector.length; i++){
            vector[i] = scanner.nextDouble();
        }

        System.out.println("Elementos inseridos no vetor:");
        for(int i = 0; i<vector.length; i++){
            System.out.println("[" + vector[i] + "]");
        }

        double ZERO = 0;
        for(int i = 0; i<vector.length; i++){
            ZERO += vector[i];
        }
       
        double ZERO2 = ZERO/vector.length;
        
        System.out.println("Media dos numeros do vetor: -- -- " + ZERO2);

        System.out.println();
        
        System.out.println("-- Numeros abaixo da média do vetor --");
        for(int i = 0; i<vector.length; i++){
            if(vector[i] < ZERO2){
                System.out.println("[" + vector[i] + "]");
            }
        }

        scanner.close();
   
    }
}