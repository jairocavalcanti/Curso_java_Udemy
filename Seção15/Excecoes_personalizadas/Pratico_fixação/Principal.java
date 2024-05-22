package Seção15.Excecoes_personalizadas.Pratico_fixação;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
  Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
  mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for
  superior ao limite de saquue da conta.
*/

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Random rand = new Random();

    try {

      Integer numero_de_conta = rand.nextInt(3000);

      System.out.printf("Insira o nome do titular da conta: ");
      String titular = scanner.next();
      System.out.printf("Insira o saldo atual da conta: ");
      Double saldo = scanner.nextDouble();
      System.out.printf("Insira o limite de saque: ");
      Double limite_de_saque = scanner.nextDouble();

      Conta conta = new Conta(numero_de_conta, titular, saldo, limite_de_saque);

      System.out.println("Conta criada !");

      System.out.println("-------------------------------------------------------------- \n");

      System.out.println(" -- DADOS DA CONTA -- ");

      System.out.println(conta);

      System.out.println("\n Insira a quantia para saque que deseja realizar: ");
      Double quantia = scanner.nextDouble();

      conta.sacar(quantia);
      System.out.println(conta);

    } catch (DomainException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException i) {
      System.out.println("Insira caracteres válidos em capos numéricos!");
    }

    scanner.close();
  }

}
