package Seção16.Lendo_Arquivo_de_Texto.Pratico2;

import java.io.File;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Passando caminho do arquivo a ser lido
        // disco / pasta / arquivo
        File file = new File("c:\\temp\\teste_2.txt");
        Scanner scanner = null;
        try {
            /*
             * compilador java obriga o tratamento da exceção causada
             * quando o arquivo nao é encontrado
             */
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Erro occorido: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }

        }

    }

}
