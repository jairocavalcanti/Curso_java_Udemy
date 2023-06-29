package Sessão8.Problema_com_oo.Exercicio2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quad;

        quad = new Quadrado();

        System.out.println("Insira o valor da base do quadrado: ");
        quad.lado1 = scanner.nextDouble();

        System.out.println("Insira a altura do quadrado: ");
        quad.lado2 = scanner.nextDouble();

        double area = quad.lado1 * quad.lado2;

        System.out.println("Area do quadrado: " + area);
        

        scanner.close();
    }


}
