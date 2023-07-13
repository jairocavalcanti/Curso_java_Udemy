package Sessão9.Construtores.Noconstructor;


import java.util.Scanner;


public class Principal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        No_constructor cons = new No_constructor();

        //Erro em potencial quando nao feito o uso de construtores
        System.out.println(cons.atributo1);
        System.out.println(cons.atributo2);

        System.out.println("Insira o primeiro atributo:");
        cons.atributo1 = scanner.next();

        System.out.println("Insira o segundo atributo:");
        cons.atributo2 = scanner.next();

        System.out.println(cons);
   
        scanner.close();
   
    }
}
