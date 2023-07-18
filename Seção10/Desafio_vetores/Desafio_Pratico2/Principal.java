package Seção10.Desafio_vetores.Desafio_Pratico2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
 
        Atributos vetor2[] = new Atributos[10];

        System.out.println("Insira a quantidade de quartos que deseja alugar: ");
        int quant = scanner.nextInt();
        
       
        for(int i = 1; i<=quant; i++){
            System.out.println("Insira o nome:");
            String nome = scanner.next();
           
            System.out.println("Insira o numero do quarto:");
            int numero = scanner.nextInt();   
           
            Atributos at = new Atributos(nome);
            vetor2[numero] = at;
        }



        for(int i = 1; i<10; i++){
            if(vetor2[i] != null){
                System.out.println("Quarto ocupado:" + i  + " " + vetor2[i]);
            }else if(vetor2[i] == null){
                System.out.println("Quarto vago -- " + i);
            }
        }


        scanner.close();
    
    }
    
}
