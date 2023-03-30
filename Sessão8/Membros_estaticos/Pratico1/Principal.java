package Sessão8.Membros_estaticos.Pratico1;

import java.util.Scanner;   
     
//UTILIZANDO METODOS ESTATICOS

public class Principal {
    
    // 'final' -- define um valor constantee nao permite que o mesmo seja alterado
    // 'constante'
    public static final double PI = 3.14159;

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("#"  + "Entre com o raio:");
    double raio = scanner.nextDouble();

    double c = circunferencia(raio);

    double v = volume(raio);

    // %.2f -- mascara de formataçao para valores do tipo double
    // %n -- joga os proximos prints para linha abaixo
    System.out.printf("Circunferencia: %.2f %n ", c );
    System.out.printf("Volume: %.2f %n ", v );
    System.out.printf("PI value: %.2f %n " , PI );

    scanner.close();
    }

    //formula para circunferencia: 2 * PI * raio

    public static double circunferencia(double duble){
      return 2.0 * PI * duble;
    }

    //formula para volume: 4 * PI * raio (x3) / 3.0
    
    public static double volume(double duble) {
      return 4.0 * PI * duble * duble * duble / 3.0;
    }

    
}
