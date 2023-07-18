package Seção10.Matrizes.Pratico3;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas da matriz:");
        int L = scanner.nextInt();

        System.out.println("Insira a quantidade de colunas da matriz:");
        int C = scanner.nextInt();

        int matriz[][] = new int[L][C];

        int count = 1;
        for(int i = 0 ;i<matriz.length; i++){
            for(int j = 0 ;j<matriz[i].length; j++){
                System.out.println("Insira o numero #" + count++ + " : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        System.out.println("Elementos inseridos na matriz:");
        for(int i = 0 ;i<matriz.length; i++){
            for(int j = 0 ;j<matriz[i].length; j++){
               System.out.printf("[" + matriz[i][j] + "]");
            }
            System.out.printf("%n");
        }

        System.out.println("Insira o numero que deseja saber a posição na matriz:");
        int numero = scanner.nextInt();

        int count2 = 0;
        for(int i = 0 ;i<matriz.length; i++){
            for(int j = 0 ;j<matriz[i].length; j++){
                if(matriz[i][j] == numero){
                    System.out.println("Posiçao do numero na matriz: -- " + " - Linha:" + i + "," + " - Coluna:" + j);
                     count2++;
                
                     System.out.println();

                     if(j > 0){
                        System.out.println("Numero á esquerda:" + matriz[i][j-1]);
                     }
                     if(i > 0){
                        System.out.println("Numero de cima:" + matriz[i-1][j]);
                     }

                     

                    }
            }
        }
       
        System.out.println(); 

        System.out.println("Ocorrências do mesmo numero na matriz:" + count2);

        System.out.println();


        scanner.close();
    }
    
}
