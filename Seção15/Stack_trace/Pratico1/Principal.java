package Seção15.Stack_trace.Pratico1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        metodo1();
        metodo2();

        System.out.println("Fim do programa! ");
    }

    public static void metodo1() {
        System.out.println("-- METODO 1 EM EXECUÇÃO --");
        metodo2();
        System.out.println("-- METODO 1 ENCERRADO --");
    }

    public static void metodo2() {
        System.out.println("-- METODO 2 EM EXECUÇÃO --");
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            System.out.println(vect[posicao]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida! \n");
            // imprime na tela o rastreamento de pilha (stack)
            // ajuda em localizar erros que estão causando a excessão
            e.printStackTrace();
            scanner.next();
        }

        catch (InputMismatchException f) {
            System.out.println("Carácter invalido! \n");
        }
        scanner.close();
        System.out.println("-- METODO 2 ENCERRADO --");

    }

}
