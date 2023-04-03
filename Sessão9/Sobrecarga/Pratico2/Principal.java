package Sessão9.Sobrecarga.Pratico2;

import java.util.Scanner;

public class Principal {
    
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Insira o primeiro numero:");
     Integer numero1 = scanner.nextInt();

     System.out.println("Insira o segundo numero:");
     Integer numero2 = scanner.nextInt();

     Numeros num = new Numeros(numero1,numero2);
     Numeros num2 = new Numeros(numero1);

     System.out.println(num);
   
     System.out.println("------------------");
   
     System.out.println(num2);

     scanner.close();
    }

}
