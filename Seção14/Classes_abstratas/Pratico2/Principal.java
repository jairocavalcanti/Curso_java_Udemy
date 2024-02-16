package Seção14.Classes_abstratas.Pratico2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Pessoa_fisica pf = new Pessoa_fisica();
      Pessoa_juridica pj = new Pessoa_juridica();

      System.out.println("Insira o numero de contribuintes: ");
      int quantidade = scanner.nextInt();

      for(int i =0; i< quantidade; i++){

      System.out.println("Dados do contribuinte #" + i + ": ");

      System.out.println("Pessoa fisica ou juridica ? (f/j)");
      char escolha = scanner.next().charAt(0);

      if(escolha == 'f'){

        System.out.printf("Insira o nome: ");
        String nome = scanner.next();
  
        System.out.printf("Insira a renda anual: ");
        Double renda = scanner.nextDouble();
  
        System.out.println("Insira os gastos com saude: ");
        Double gastos_com_saude = scanner.nextDouble();

        pf = new Pessoa_fisica(nome, renda, gastos_com_saude);

      }else{

        System.out.printf("Insira o nome: ");
        String nome = scanner.next();
  
        System.out.printf("Insira a renda anual: ");
        Double renda = scanner.nextDouble();
  
        System.out.println("Insira o numero de funcionarios: ");
        Integer numero_de_funcionarios = scanner.nextInt();

        pj = new Pessoa_juridica(nome, renda, numero_de_funcionarios);

      }
    
    }
   
     System.out.println(pf.taxa());


      scanner.close();
    }
    
}
