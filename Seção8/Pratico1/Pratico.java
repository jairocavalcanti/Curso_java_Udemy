package Sessão8.Pratico1;

import java.util.Scanner;

public class Pratico {
    
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   Product prod = new Product();
   System.out.println("Entre com os dados do produto:");
  
   System.out.println("Nome:");
   prod.nome = scanner.nextLine();
 
   System.out.println("Preço:");
   prod.preço = scanner.nextDouble();

   System.out.println("Quantidade no estoque:");
   prod.quantidade = scanner.nextInt(); 
    
   System.out.println(prod);

   System.out.println("Insira o numero de produtos a serem adicionados no estoque:");
   int quantidade = scanner.nextInt();
   prod.adicionarprodutos(quantidade);

   System.out.println(prod);

   System.out.println("Insira o numero de produtos a serem removidos no estoque:");
   quantidade = scanner.nextInt();
   prod.removerprodutos(quantidade);

   System.out.println();
   System.out.println("Produtos upados:" + prod );


   scanner.close();
   }

}
