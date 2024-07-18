package Seção16.Manipulando_Pastas_com_file.Pratico2;

import java.io.File;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o caminho do diretório: ");
        String caminho = scanner.next();

        File caminho_2 = new File(caminho);

        File[] pastas = caminho_2.listFiles(File::isDirectory);
        System.out.println("Dirétorios no caminho: " + caminho);
        for (File file : pastas) {
            System.out.println(file);
        }

        System.out.println("----------------------------------------------");

        File[] arquivos = caminho_2.listFiles(File::isFile);
        System.out.println("Arquivos no caminho: " + caminho);
        for (File file : arquivos) {
            System.out.println(file);
        }

        System.out.println("----------------------------------------------");

        boolean sucesso = new File(caminho + "Teste_java").mkdir();
        if (sucesso != false) {
            System.out.println("Diretório criado com sucesso: " + sucesso);
        } else {
            System.out.println("Diretório já existente!");
        }

        scanner.close();

    }

}
