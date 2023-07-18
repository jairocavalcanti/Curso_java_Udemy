package Sessão10.Matrizes.Pratico2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira o tamanho da matriz:");
        int N = scanner.nextInt();

        int matriz [][] = new int[N][N];
    

        int count = 1;
        for(Integer i = 0; i< matriz.length; i++ ){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Insira o elemento " + "#" + count++ + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();


        System.out.println("Elementos inseridos na matriz:");
        for(int i = 0; i< matriz.length; i++ ){
            for(int j = 0; j < matriz[i].length; j++){
              System.out.print(" -- " + matriz[i][j] );
            }
          
            //'%n' faz a quebra de linha exatamente como '\n'
            //necessario para que possamos visualizar a matriz como na memoria 
            System.out.printf("%n");
        }
        
        System.out.println();

        System.out.println("Diagonal principal:");
        for(int i = 0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
    



        scanner.close();
    }
}
