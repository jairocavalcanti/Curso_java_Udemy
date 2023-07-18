package Sessão10.Vetores.Pratico7;

import java.util.Scanner;

/*
  Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
  no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
  os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
  igual a 6.0 (seis).
 */
public class Principal4 {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Insira o tamanho dos vetores:");
     int J = scanner.nextInt();

     String nome[] = new String[J];
     int nota1[] = new int[J];
     int nota2[] = new int [J];

     int cont = 1;

     System.out.println("Insira as informaçoes do aluno:");
     for(int i = 0; i< nome.length; i++){
      System.out.println("Digite nome, primeira e segunda nota do " + cont++ + "o" + " aluno:" );
       nome[i] = scanner.next();
       nota1[i] = scanner.nextInt();
       nota2[i] = scanner.nextInt(); 
     }

     int tru = 0;

     for(int i = 0; i< nome.length; i++ ){
       tru = (nota1[i] + nota2[i]) / 2;
   
      if(tru >= 6.0){
      System.out.println( "Aluno com media maior que 6 (Aprovado): " + nome[i]);
      }

      }
    scanner.close();
    }
  }
