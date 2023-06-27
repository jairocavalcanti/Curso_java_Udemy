package Sessão8.Problema_com_oo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Triangulo x,  y;
        //Criação de objetos, definindo um programa que trabalha com OO
        x = new Triangulo();
        y =  new Triangulo();
        
        System.out.println("Entre com a medida do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
      
        System.out.println("Entre com a medida do triangulo y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();
    
        double p = (x.a + x.b + x.c) / 2.0;
        // 'Math.sqrt' retorna a raiz quadrada de determinado valor
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));


        p = (y.a + y.b + y.c) / 2.0;
    
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area do triangulo x: %.4f%n ", areaX);
        System.out.printf("Area do triangulo y: %.4f%n ", areaY);


        if(areaX > areaY){
            System.out.println("Maior area: " + areaX);
        }else{
            System.out.println("Maior area: " + areaY);
        }



        scanner.close();
    }

}
