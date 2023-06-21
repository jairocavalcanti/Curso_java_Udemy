package Sessão10.Matrizes.Pratico3;

import java.util.Scanner;

public class Principal5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
    System.out.println("Insira o numero de linhas da matriz:");
    int L = scanner.nextInt();

    System.out.println("Insira o numero de colunas da matriz:");
    int C = scanner.nextInt();

    int matrixx[][] = new int[L][C];

    System.out.println();

    int contador = 1;
    for(int i = 0; i < matrixx.length;i++){
        for(int j = 0; j < matrixx[i].length;j++){
            System.out.printf("Insira o elemento de numero #" + contador++ + " :");
            matrixx[i][j] = scanner.nextInt();
        }
    }

    System.out.println();

    System.out.println("Matriz preenchida:");
    for(int i = 0; i < matrixx.length;i++){
        for(int j = 0; j < matrixx[i].length;j++){
          System.out.printf("[" + matrixx[i][j] + "]");
        }
        System.out.printf("%n");
    }

    System.out.println();

    System.out.println("Insira o numero ao qual deseja localizar na matriz:");
    int procura = scanner.nextInt();

    for(int i = 0; i < matrixx.length;i++){
        for(int j = 0; j < matrixx[i].length;j++){
             if(matrixx[i][j] == procura){
                System.out.println("Numero: " + procura + "-- Localizado na linha:" + i + "-- Coluna:" + j);
            
                System.out.println();

                if(j > 0 ){
                    System.out.println("Numero á esquerda :" + matrixx[i][j-1]);
                }
                if(i > 0){
                    System.out.println("Numero acima :" + matrixx[i-1][j]);
                }
                if(j < matrixx[i].length -1){
                    System.out.println("Numero a direita :" + matrixx[i][j+1]);
                }

                }

            }
        }
        
        
        System.out.println(matrixx.length);
        
        
        scanner.close();
    }

   
}
    

