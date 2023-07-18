package Sessão10.Vetores.Pratico4;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
    
        System.out.println("Insira a quantidade para casas no vetor:");
        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i<vect.length; i++){
            // nextLine abaixo é apenas para quebra de linha
            scanner.nextLine();
            String name = scanner.next();
            Double preco = scanner.nextDouble();
            vect[i] = new Produto(name, preco);
        }

        double soma = 0;
        for(int i=0; i<vect.length; i++){
            //acessando a posiçao i 
            //getPreço serve para acessar apenas o tipo preço na posição 'i' correspondente
            soma += vect[i].getPreço();
        }
        double media = soma/vect.length;

        System.out.println("Media igual: -- " + media);

        scanner.close();
    }
   
    


}
