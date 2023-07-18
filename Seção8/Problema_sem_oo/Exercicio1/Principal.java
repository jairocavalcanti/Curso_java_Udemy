package Sessão8.Problema_sem_oo.Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Entre com a medida do triangulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
      
        System.out.println("Entre com a medida do triangulo y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();
    
        double p = (xA + xB + xC) / 2.0;
        // 'Math.sqrt' retorna a raiz quadrada de determinado valor
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));


        p = (yA + yB + yC) / 2.0;
      
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
