package Seção8.Problema_com_metodo.Exercicio2;

import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
    Double soma = 0.0;
    String escolha;

    Metodorraiz x = new Metodorraiz();
    Metodorraiz y = new Metodorraiz();
     
    System.out.println("Insira o primeiro valor: ");
    x.valor = scanner.nextDouble();
    System.out.println("Insira o segundo valor: ");
    y.valor = scanner.nextDouble();

    System.out.println("Raizes quadradas dos respectivos numeros: ");
    x.met();
    y.met();

    System.out.println();

    System.out.println("Deseja somar algum numero aos resultados S/N ?");
    escolha = scanner.next();


    if(escolha.equals("S")){
        System.out.println("Insira o numero que deseja somar: ");
        soma = scanner.nextDouble();
          
         double resultado1 = x.soma(soma);
         double resultado2 = y.soma(soma);
 
         System.out.println("Resultado da soma 1: " + resultado1);
         System.out.println("Resultado da soma 2: " + resultado2);
    }else{
        System.out.println("Programa finalizado");
    }
 

    scanner.close();
}
    
}
