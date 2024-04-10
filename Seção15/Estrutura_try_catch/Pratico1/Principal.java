package Seção15.Estrutura_try_catch.Pratico1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      String[] vect = scanner.nextLine().split(" ");
      int posicao = scanner.nextInt();
      System.out.println(vect[posicao]);
    }

    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Posição invalida! \n");
    }

    catch (InputMismatchException f) {
      System.out.println("Carácter invalido! \n");
    }

    System.out.println("Fim do programa! ");
    scanner.close();

  }

}
