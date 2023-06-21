package Sessão10.Vetores.Pratico7;

import java.util.Scanner;

public class Principal6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor:");
        int tam = scanner.nextInt();
         
        int vetor[] = new int[tam];

        for(int i = 0; i<vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];

        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println("Maior numero do vetor:" + maior);


        scanner.close();
    }


}
