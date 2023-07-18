package Seção8.Membros_estaticos.Pratico2;

import java.util.Scanner;

//SEM USO DE METODOS ESTATICOS

public class Principal2 {
    

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("#"  + "Entre com o raio:");
    double raio = scanner.nextDouble();
    Calculador calc = new Calculador();

    double c = calc.circunferencia(raio);

    double v = calc.volume(raio);

   
    System.out.printf("Circunferencia: %.2f %n ", c );
    System.out.printf("Volume: %.2f %n ", v );
    System.out.printf("PI value: %.2f %n " , calc.PI );

    scanner.close();
    }

 
}
