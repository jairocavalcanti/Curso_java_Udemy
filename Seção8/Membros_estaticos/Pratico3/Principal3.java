package Sessão8.Membros_estaticos.Pratico3;

import java.util.Scanner;


public class Principal3 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.printf("#"  + "Entre com o raio:");
        double raio = scanner.nextDouble();
    
        double c = calculador2.circunferencia(raio);
    
        double v = calculador2.volume(raio);
    
       
        System.out.printf("Circunferencia: %.2f %n ", c );
        System.out.printf("Volume: %.2f %n ", v );
        System.out.printf("PI value: %.2f %n " , calculador2.PI );
    
        scanner.close();

    }
}
