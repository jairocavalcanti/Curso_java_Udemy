package Seção10.Desafio_vetores.Desafio;

import java.util.Scanner;

/*
 Fazer um programa que inicie com todos os dez quartos vazios, e depois
 leia uma quantidade N representando o numero de estudantes que vão alugar
 quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
 Para cada registro de aluguel, informar o nome e email do estudante, bem como
 qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.
 Ao final, seu programa deve imprimir um relatório de todas ocupaçoes do pensionato,
 por ordem de quarto.

*/
public class Desafio_vetores {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       
       Rent[] vetor = new Rent[10];
        
       System.out.println("Quantos quartos serão alugados:");
       int N = scanner.nextInt();

       for(int i = 1; i<=N; i++){
        System.out.println();
        System.out.println("Rent #" + i + ":");
        
        System.out.println("Name: ");
         String name = scanner.next();
        
         System.out.print("Email: ");
         String email = scanner.next();
       
          System.out.print("Quarto:");
          int numeroquarto = scanner.nextInt();

         Rent rent = new Rent(name, email);
      
         vetor[numeroquarto] = rent;     
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for(int i = 0; i<10;i++){
            if(vetor[i] != null){
                System.out.println(i + ":" + vetor[i]);
            }
        }
        
        


        scanner.close();

    }
    
}
