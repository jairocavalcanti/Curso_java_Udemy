package Seção8.Membros_estaticos.Pratico4;

import java.util.Scanner;

//1 dolar == R$ 5,11
public class Principal {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("qual o valor do dolar? ");
    Double dolar = scanner.nextDouble();

    System.out.printf("Quantos dolares vao ser comprados? ");
    Double dolar2 = scanner.nextDouble();

    double cotafinal = Conversor_de_moedas.valorfinal(dolar, dolar2);
    double taxa = (dolar * dolar2/100) * Conversor_de_moedas.IOF;
    
    System.out.println("valor do dolar: " + dolar);
    System.out.println("Dolares comprados: " + dolar2);
    System.out.println( "Valor a ser pago: " + (cotafinal + taxa ));
   
    scanner.close();
    }
  }
