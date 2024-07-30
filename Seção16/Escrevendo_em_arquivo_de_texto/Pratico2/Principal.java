package Seção16.Escrevendo_em_arquivo_de_texto.Pratico2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // String vetor_d[] = new String[3];

        String caminho = "c:\\Pratico2_java_file";
        boolean criado = new File(caminho).mkdir();

        if (criado) {
            System.out.println("Arquivo criado no diretório especificado! ");
        } else {
            System.out.println("Arquivo já disponível !");
        }

        System.out.println();

        String caminho_2 = caminho + "\\Anotações.txt";
        File file = new File(caminho_2);

        try {
            boolean criacao = file.createNewFile();
            if (criacao) {
                System.out.println("Arquivo de texto criado no diretório especificado!");
            } else {
                System.out.println("Arquivo de texto já existente no diretório");
            }

        } catch (IOException e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
        }

        Scanner sc = null;
        try {
            System.out.println("\n----------------- ARQUIVO TXT -----------------");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        /*
         * //Verificando se o diretório existe
         * if (!file.exists()) {
         * try {
         * if (file.createNewFile()) {
         * System.out.println("Arquivo de texto criado no diretório especificado! ");
         * } else {
         * System.out.println("Falha ao criar o arquivo de texto ");
         * }
         * } catch (IOException e) {
         * System.out.println("Erro ao criar arquivo de texto: " + e.getMessage());
         * 
         * }
         * }else{
         * System.out.println("Arquivo de texto já disponível !");
         * }
         */
    }
}
