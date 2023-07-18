package Seção10.Vetores.Pratico7;

import java.util.Scanner;

/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
   que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
   de homens.
 */

public class Principal7 {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Digite o tamanho dos vetores:");
  int N = scanner.nextInt();

  double vetoraltura[] = new double[N];
  String vetorgenero[] = new String[N];

  int cont = 0;

  for(int i =0; i< vetoraltura.length; i++){
  cont++;
    
   System.out.printf("Altura da " + cont + "a" + " pessoa:");
   vetoraltura[i] = scanner.nextDouble();
   System.out.printf("Genero da " + cont + "a" + " pessoa:");
   vetorgenero[i] = scanner.next();
  }
 

  double maior = vetoraltura[0];


  for(int i =0; i< vetoraltura.length; i++){
     if(vetoraltura[i] > maior){
        maior = vetoraltura[i];
    }

  }

  double menor = vetoraltura[0];

  for(int i =0; i< vetoraltura.length; i++){
    if(vetoraltura[i] < menor){
       menor = vetoraltura[i];
   }

 }

  double media = 0;

  for(int i = 0 ; i< vetorgenero.length; i++){
    if (vetorgenero[i].equals("m")){
         media =+ vetoraltura[i];
    }
  }

  int cont2 = 0;

  for(int i = 0 ; i< vetorgenero.length; i++){
    if (vetorgenero[i].equals("h")) {
      cont2++;
    }
  }


  System.out.println();


  System.out.println("Altura Media das mulheres: " + media);
  System.out.println("Numero de homens:" + cont2);


  System.out.println();


  System.out.println("maior altura: " + maior);
  System.out.println("Menor altura: " + menor);


  scanner.close();



}
    
    
}
