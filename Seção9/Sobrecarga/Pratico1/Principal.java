package Seção9.Sobrecarga.Pratico1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o primeiro elemento:");
    String elemento = scanner.next();
    System.out.println("Insira o segundo elemento:");
    String elemento2 = scanner.next();
    System.out.println("Insira o terceiro elemento:");
    String elemento3 = scanner.next();

    //Disponibilizar mais de uma versao de determinada operaçao, SOBRECARGA
    //A diferença entre elas será a lista de parametros -- (assinatura do metodo)
    Elementos elem = new Elementos(elemento , elemento2);
    Elementos elem2 = new Elementos(elemento, elemento2, elemento3);

    System.out.println(elem);
    System.out.println(elem2);

    scanner.close();
    }
}
