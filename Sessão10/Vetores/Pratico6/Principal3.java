package Sessão10.Vetores.Pratico6;

import java.util.Arrays;
import java.util.Scanner;

/* Faça um programa para ler dois vetores A e B, contendo N elementos cada.
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos
correspondentes de A e B. Imprima o vetor C gerado.
*/

public class Principal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho dos vetores:");
        int t = scanner.nextInt();  
       
        int vetorA[] = new int[t];
        int vetorB[] = new int[t];

        System.out.println("Insira os elementos do vetor A:");
        for(int i= 0; i<vetorA.length; i++){
             vetorA[i] = scanner.nextInt();
        }

        System.out.println("Insira os elementos do vetor B:");
        for(int i= 0; i<vetorB.length; i++){
            vetorB[i] = scanner.nextInt();
       }

       int vetorC[] = new int[t];
       for(int i= 0; i<vetorC.length; i++){
        vetorC[i] = vetorA[i] + vetorB[i]; 
       }


       System.out.println("ElemENtos inseridos no vetor A --- " + Arrays.toString(vetorA));
       System.out.println("Elementos inseridos no vetor B: --- " + Arrays.toString(vetorB));

       System.out.println("Elementos inseridos no vetor C: --- " + Arrays.toString(vetorC));

       scanner.close();
    }

}
