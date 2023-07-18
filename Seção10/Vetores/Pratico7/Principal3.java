package Seção10.Vetores.Pratico7;

import java.util.Scanner;

/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
   devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
   da pessoa mais velha
 */

public class Principal3 {
    
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o tamanho dos vetores:");
    int t = scanner.nextInt();

    String vetornome[] = new String[t];
    int vetoridade[] = new int[t];
    int verif = 1;
    int verif2 = 1;

    System.out.println("Insira os nomes no vetor de nomes:");
    for(int i = 0; i< vetornome.length; i++){
        System.out.println("nome da pessoa: -- " + verif++  );
        vetornome[i] = scanner.next();
    }

    System.out.println("Insira as idades no vetor de idade:");
    for(int i = 0; i< vetoridade.length; i++){
        System.out.println("idade da pessoa: -- " + verif2++  );
        vetoridade[i] = scanner.nextInt();
    }


    System.out.printf("Nomes inseridos no vetor:");
    for(int i = 0; i< vetornome.length; i++){
       System.out.printf("[" + vetornome[i] + "] ");
    }

    System.out.println();

    System.out.printf("Idades inseridas no vetor:");
    for(int i = 0; i< vetoridade.length; i++){
       System.out.printf("[" + vetoridade[i]+ "] ");
    }

    System.out.println();

    int maior = vetoridade[0];
    int p = 0;

    for(int i = 0; i< vetoridade.length; i++){
        if(vetoridade[i] > maior){
            maior = vetoridade[i];
            p++;
        }

    }
   
     System.out.println("----------");

     System.out.println("Maior idade do vetor: " + maior);
    
     System.out.println("----------");

     System.out.println("Nome da pessoa mais velha: " + vetornome[p]);

     System.out.println("----------");


     scanner.close();

    }
}
