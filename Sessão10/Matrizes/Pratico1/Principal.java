package Sessão10.Matrizes.Pratico1;

import java.util.Scanner;

 /*Fazer um programa para ler um numero inteiro N e uma matriz de ordem N contendo numeros inteiros.
   Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz */

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz:");
        int N = scanner.nextInt();

        //sintaxe para criação de matriz (vetor bidimensional)
        //'N' representa a quantidade de linhas e colunas contidas na matriz 
        int [][] mat = new int[N][N];

        //criando estruturas de repetição para que percorram as 'casas' da matriz
        //a primeira estrutura representa as linhas e a segunda as colunas
        //sendo assim nesse caso i como linhas e j como colunas
        for(int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
              mat[i][j] = scanner.nextInt();
            }
        }
       
        //imprimindo numeros diagonais da matriz através da posição i
        //linha 'i' coluna 'i'
        System.out.println("Main diagonal:");
        for(int i = 0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for(int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
              if( mat[i][j] < 0){
                count++;
              }
            }
        }
        System.out.println();
        System.out.println("Negative numbers:" + count);

        scanner.close();
    }
    
}
