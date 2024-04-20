package Seção15.Estrutura_try_catch.Pratico3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String vetor_planetas[] = new String[] { "Mercurio", "Venus", "Marte", "Jupiter", "Saturno", "Urano" };
        Double vetor_gravidade[] = new Double[] { 0.37, 0.88, 0.38, 2.64, 1.15, 1.17 };

        while (t != false) {

            try {

                System.out.println("Insira o peso do individuo: ");
                int peso = scanner.nextInt();

                System.out.println("Lista de planetas: " + Arrays.toString(vetor_planetas));

                System.out.println("Insira o numero do planeta (0 a 5): ");
                int num = scanner.nextInt();

                String num_p = vetor_planetas[num];
                Double gravidade = vetor_gravidade[num];

                System.out.println("Planeta escolhido: " + num_p);
                System.out.println("Gravidade do planeta: " + gravidade);

                double p = peso / 10 * gravidade;

                System.out.println("Peso no planeta " + p);

                System.out.println("------------------------------------------------------");

            } catch (InputMismatchException e) {
                System.out.println("Insira uma alternativa válida !");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Entrada inválida. Insira um número válido.");
                scanner.nextLine();
            }
        }
        scanner.close();

    }

}
