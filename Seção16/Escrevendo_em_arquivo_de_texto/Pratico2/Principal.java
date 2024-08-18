package Seção16.Escrevendo_em_arquivo_de_texto.Pratico2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String vetor_d[] = new String[4];

        String caminho = "c:\\Pratico2_java_file";
        boolean criado = new File(caminho).mkdir();

        System.out.println();

        if (criado) {
            System.out.println("Arquivo criado no diretório especificado! ");
        } else {
            System.out.println("Arquivo já disponível! ");
        }

        System.out.println();

        String caminho_2 = caminho + "\\Anotações.txt";
        File file = new File(caminho_2);

        try {
            boolean criacao = file.createNewFile();
            if (criacao) {
                System.out.println("Arquivo de texto criado no diretório especificado! ");
            } else {
                System.out.println("Arquivo de texto já existente no diretório! ");
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
        System.out.println("-----------------------------------------------");

        String caminho_3 = caminho + "\\pasta_teste";
        boolean criado_2 = new File(caminho_3).mkdir();

        if (criado_2) {
            System.out.println("Diretório criado no caminho especificado !");
        } else {
            System.out.println("Diretório já existente !");
        }

        String caminho_4 = caminho_3 + "\\komas.txt";
        File file_2 = new File(caminho_4);
        try {
            boolean criado_3 = file_2.createNewFile();
            if (criado_3) {
                System.out.println("Arquivo criado no diretório especificado !");
            } else {
                System.out.println("Arquivo já existente !");
            }
        } catch (Exception e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
        }

        StringBuilder armazenador = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(caminho_2))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                vetor_d = linha.split(",");
                if (vetor_d.length >= 4) {
                    try {
                        String nome = vetor_d[0];
                        String nome_2 = vetor_d[1];
                        int quantidade = Integer.parseInt(vetor_d[2]);
                        Double preco = Double.parseDouble(vetor_d[3]);

                        Double valor_total = quantidade * preco;

                        armazenador.append(nome).append(",").append(nome_2).append(",").append(valor_total)
                                .append("\n");
                    } catch (Exception e) {
                        System.out.println("Erro ocorrido: " + e.getMessage());

                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
        }

        String arquivo_saida = caminho_4;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo_saida))) {
            System.out.println("Escrito com sucesso! ");
            bw.write(armazenador.toString());
        } catch (IOException e) {
            System.out.println("Erro occorrido ao escrever arquivo! ");
            e.printStackTrace();
        }
    }
}
