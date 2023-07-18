package Seção8.Problema_sem_oo.Exercicio2;

import java.util.Scanner;

public class Principal {
    
    public static final double pi = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Insira o valor do raio da circunferencia: ");
        Double raio = scanner.nextDouble();

        double area = pi* Math.pow(raio,2);

       
        System.out.println("Area da circunferencia: " + area);
        

        scanner.close();
    }
    
}
