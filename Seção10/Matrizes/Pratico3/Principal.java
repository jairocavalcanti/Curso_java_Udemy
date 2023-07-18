package Seção10.Matrizes.Pratico3;

import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Insira a quantidade de linhas da matriz:");
        Integer M = scanner.nextInt();

        System.out.println("Insira a quantidade de colunas da matriz:");
        Integer N = scanner.nextInt();

        Integer matriz [][] = new Integer[M][N];

        //forma correta de inserir dados numa matriz de valor escolhido pelo usuário
        //colunas implementadas a partir do numero de linhas 'i'
        Integer count = 1;
        for(Integer i = 0; i<matriz.length; i++){
            for(Integer j = 0; j<matriz[i].length; j++){
                System.out.println("Insira o numero #" + count++ + " :");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        System.out.println("Elementos da matriz:");
        for(Integer i = 0; i<matriz.length; i++){
            for(Integer j = 0; j<matriz[i].length; j++){
                System.out.printf("--" + matriz[i][j]);
            }
           System.out.printf("%n");
        }


        scanner.close();
    }
    
}
