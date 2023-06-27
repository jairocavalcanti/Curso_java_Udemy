package Sessão8.Problema_com_metodo;

import java.util.Scanner;

public class Principal {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Trianguloo x,  y;
        
        x = new Trianguloo();
        y =  new Trianguloo();
        
        System.out.println("Entre com a medida do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
      
        System.out.println("Entre com a medida do triangulo y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();
    
       
        //chamada de meotodos para calculo de area dos respectivos triangulos
        double areaX = x.area();
        double areaY = y.area();

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
