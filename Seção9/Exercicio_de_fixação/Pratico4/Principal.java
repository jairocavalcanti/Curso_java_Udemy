package Seção9.Exercicio_de_fixação.Pratico4;

import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro atributo do tipo inteiro:");
        Integer atributo1 = scanner.nextInt();

        System.out.println("Insira o segundo atributo do tipo inteiro:");
        Integer atributo2 = scanner.nextInt();

        Classe2 classe = new Classe2(atributo1, atributo2);
   
        System.out.println("Dados atualizados:");
        System.out.println(classe);

        //!!VERY USEFUL!!//
        //Mudança de dados a partir de getters and setters
        System.out.println("Insira a mudança de valor do primeiro atrIbuto inteiro:");
        Integer atributo3 = scanner.nextInt();
        classe.setAtributo1(atributo3);

        System.out.println("Insira a mudança de valor do segundo atributo inteiro:");
        Integer atributo4 = scanner.nextInt();
        classe.setAtributo2(atributo4);


        System.out.println("Mudança feita no atributo1: -- " + classe.getAtributo1());
        System.out.println("Mudança feita no atributo1: -- " + classe.getAtributo2());

        System.out.println("Dados atualizados:");
        System.out.println(classe);

        scanner.close();
    }
    
}
