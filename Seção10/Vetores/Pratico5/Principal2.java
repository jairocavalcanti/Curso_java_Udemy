package Sessão10.Vetores.Pratico5;

import java.util.Scanner;

/*
--faça um programa que leia N numeros reais e armazene-os em um vetor. Em seguida:
-Imprimir todos os elementos do vetor
-Mostrar na tela a soma e a média dos elementos do vetor
*/
public class Principal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vet []= new double[3];

        System.out.println("Insira os elementos double do vetor:");
        for(int i= 0;i <vet.length; i++){
            vet[i] = scanner.nextDouble();
        }
        
        System.out.println("Elementos inseridos no vetor:");
        for(int i= 0;i <vet.length; i++){
            System.out.println(vet[i]);
        }
       
        double zero = 0;
        for(int i= 0;i <vet.length; i++){
              zero += vet[i];
        }
    
        double result = zero;
        double result2 = zero / vet.length;
        

        System.out.println("Soma dos elementos:" + result);
        System.out.println("Resultado da media das somas:" + result2);
  
        scanner.close();
        
    }
}
