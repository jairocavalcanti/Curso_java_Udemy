package Seção10.Matrizes.Pratico3;

import java.util.Scanner;

public class Principal4 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas da matriz:");
        int L = scanner.nextInt();

        System.out.println("Insira a quantidade de colunas da matriz:");
        int C = scanner.nextInt();

        int matriz [][] = new int[L][C];

        System.out.println();

        int count = 1;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.println("Insira o numero #" + count++ + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        System.out.println("Elementos inseridos na matriz:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
               System.out.printf("[" + matriz[i][j] + "]");        
            }
            System.out.printf("%n");
        }

        System.out.println();

        System.out.println("Insira o numero ao qual deseja identificar na matriz:");
        int numero = scanner.nextInt();

        System.out.println();

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
               if(numero == matriz[i][j]){
                System.out.println("posiçao do numero: " + numero + " -- Linha: " + i + " -- Coluna: " + j);
               
                System.out.println();

                if(j > 0){
                    System.out.println("Numero acima: " + matriz[i-1][j]);
                }
                if(i > 0){
                    System.out.println("Numero a esquerda: " + matriz[i][j-1]);
                }
                if(j < matriz[i].length-1){
                    System.out.println("Numero a direita: " + matriz[i][j+1]);
                }
                if(i < matriz.length-1){
                    System.out.println("Numero abaixo: " + matriz[i+1][j]);
                } 
              }
           } 
        }

        scanner.close();
    }
    
}
