 package Seção9.Construtores.Pratico2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o primeiro atributo String:");
    String atributo1 = scanner.next();

    System.out.println("Insira o segundo atributo String:");
    String atributo2 = scanner.next();

    //forma segura de evitar que atributos vazios sejam printados
    Constructor cons = new Constructor(atributo1, atributo2);
    
   System.out.println(cons);

    scanner.close();

    }


}
