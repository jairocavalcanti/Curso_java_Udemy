package Seção10.Vetores.Pratico3;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Insira a quantidade que deseja para tamanho do array:");
        int quant = scanner.nextInt();

        int vector[] = new int[quant];

        for (int i=0; i<quant; i++){
            System.out.println("Insira o numero no vetor:");
            vector[i] = scanner.nextInt();
        }
 
        System.out.println("--VALORES INSERIDOS NO VETOR--");
        Integer g = 0;
        for (int i=0; i<quant; i++){
            System.out.println("Numero: " + g++ + " --- " + vector[i]);
        }
        
        System.out.println("--SOMA DOS VALORES DO VETOR--");
        Integer f = 0;
        for (int i=0; i<quant; i++){
            f += vector[i];
       
            //se algum elemento do array se enquadrar no parametro do if
            //segue operaçao abaixo
            if(vector[i] < 0){
                System.out.println("Numero negativo inserido:" + vector[i]);
            }
        }
    
        scanner.close();

        System.out.println("Soma dos valores do array:" + f);

    }



}
