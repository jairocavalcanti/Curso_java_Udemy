package Seção14.Classes_abstratas.Pratico2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Pessoa_fisica pf = new Pessoa_fisica();
      Pessoa_juridica pj = new Pessoa_juridica();

      ArrayList<Contribuinte> array = new ArrayList<>(); 

      System.out.println("Insira o numero de contribuintes: ");
      int quantidade = scanner.nextInt();

      for(int i =0; i< quantidade; i++){

      System.out.println(" \n Dados do contribuinte #" + i + ": ");

      System.out.println("Pessoa fisica ou juridica ? (f/j)");
      char escolha = scanner.next().charAt(0);

      if(escolha == 'f'){

        System.out.printf("Insira o nome: ");
        String nome = scanner.next();
  
        System.out.printf("Insira a renda anual: ");
        Double renda = scanner.nextDouble();
  
        System.out.printf("Insira os gastos com saude: ");
        Double gastos_com_saude = scanner.nextDouble();

        pf = new Pessoa_fisica(nome, renda, gastos_com_saude);

        array.add(pf);

      }else{

        System.out.printf("Insira o nome: ");
        String nome = scanner.next();
  
        System.out.printf("Insira a renda anual: ");
        Double renda = scanner.nextDouble();
  
        System.out.printf("Insira o numero de funcionarios: ");
        Integer numero_de_funcionarios = scanner.nextInt();

        pj = new Pessoa_juridica(nome, renda, numero_de_funcionarios);

        array.add(pj);
      
      }
    
    }
   
     System.out.println(" \n -- IMPOSTOS PAGOS -- ");

     for(Contribuinte c: array){
       if(c instanceof Pessoa_fisica){
          System.out.println(c.taxa());
       }else{
          System.out.println(c.taxa());
      }
      
    }

    double soma = 0.0;
    for(Contribuinte e: array){
       soma += e.renda_anual;
    }

    System.out.println(" \n Soma total final : R$ " + soma);
    
    scanner.close();
    }
    
}
