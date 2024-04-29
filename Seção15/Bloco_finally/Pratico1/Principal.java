package Seção15.Bloco_finally.Pratico1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // instanciado objeto do tipo 'file' com caminho do arquivo de texto
        File file = new File("C:\\testes_JavaFile\\teste_1.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            // 'e.getMessage' retorna a mensagem padrão do java quando o arquivo não é encontrado
            System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        // bloco finally será executado indenpendentemente do bloco try 'dar certo'
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Bloco finally executado! ");
        }

    }
}
