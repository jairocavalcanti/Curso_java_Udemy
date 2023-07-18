package Seção9.Encapsulamento.Pratico2;

import java.util.Scanner;

public class Principal2 {
 
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
   
     System.out.println("Insira o nome:");
     String nome = scanner.next();

     System.out.println("Insira o preço:");
     Integer preço = scanner.nextInt();

     System.out.println("Insira a quantidade:");
     int quantidade = scanner.nextInt();
    
     Atributos2 at2 = new Atributos2(nome, preço,quantidade);

     System.out.println("Insira a quantidade q deseja adicionar:");
     Integer quantidade0 = scanner.nextInt();
     at2.adicionarprodutos(quantidade0);
   
     System.out.println("Insira a quantidade que deseja subtrair:");
     Integer quantidade1 = scanner.nextInt();
     at2.subtrairprodutos(quantidade1);

     //print sem alteraçoes do encapsulamento
     System.out.println(at2);

     //ALTERAÇOES ATRAVES DE ENCAPSULAMENTO
     //quantidade nao pode ser definida por get e set
     //regra de negocio para proteger a integridade da quantidade 
     at2.setNome("Samsung galaxy a71");    
     at2.setPreço(2220);

    //print com alteraçoes do encapsulamento
     System.out.println(at2);
    
     scanner.close();
    }
}
