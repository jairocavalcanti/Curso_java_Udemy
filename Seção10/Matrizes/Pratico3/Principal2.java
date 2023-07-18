package Sessão10.Matrizes.Pratico3;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira as linhas da matriz:");
    int M = scanner.nextInt();

    System.out.println("Insira as colunas da matriz:");
    int N = scanner.nextInt();

    int mat[][] = new int[M][N];

    System.out.println();

    int count = 1;
    for(int i = 0; i<mat.length;i++){
        for(int j = 0; j< mat[i].length;j++){
            System.out.printf("Insira o elemento " + "#" + count++ + " da matriz:");
            mat[i][j] = scanner.nextInt();
        }
    }

    System.out.println();

    System.out.println("Elementos inseridos na matriz:");
    for(int i = 0; i<mat.length;i++){
        for(int j = 0; j< mat[i].length;j++){
           //faça o uso de printf juntamente com a quebra de linha abaixo para obter melhor formatação
           System.out.printf(" -- " + mat[i][j]);
        }
        System.out.printf("%n");
    }

    System.out.println();

    System.out.println("Insira o numero da matriz ao qual deseja capturar informações:");
    int num = scanner.nextInt();

    //posiçao do numero na matriz
    for(int i =0; i<mat.length; i++){
        for(int j = 0; j<mat[i].length;j++){
           if(mat[i][j] == num){
            System.out.println("Posição" + i + " , " + j + ":");
           }
        }
    }

    scanner.close();
}
    
}
