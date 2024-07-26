package Seção16.Extra.Pratico_Extra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Fazer um programa para ler o caminmho de um arquivo .csv ,
 * contendo os dados de itens vendidos. Cada item possui um nome
 * preço unitário e quantidade, separados por vírgula. Voce deve gerar
 * um arquivo chamado "summary.csv", localizado em uma subpasta chamada
 * "out" a partir da pasta original do arquivo de origem, contendo apenas
 * o nome e o valor total para aquele item (preço unitário multiplicado pela quantidade)
 */

public class Principal {

  public static void main(String[] args) {

    String dados[] = new String[3];

    String caminho = "c:\\exercicio_java";
    boolean sucesso = new File(caminho).mkdir();
    if (sucesso) {
      System.out.println("<< Arquivo__" + caminho + "__criado com sucesso! >> ");
    } else {
      System.out.println("<< Arquivo__" + caminho + "__já existente! >>");
    }

    System.out.println();

    String caminho_2 = caminho + "\\itens.txt";

    File file = new File(caminho_2);
    Scanner sc = null;
    try {
      System.out.println("-- ARQUIVO 'itens.txt' ---------------------\n");
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      System.out.println("--------------------------------------------");
    } catch (IOException e) {
      System.out.println("Erro ocorrido: " + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }

    StringBuilder dadosprocessados = new StringBuilder();

    // forma errada: Scanner scanner = new Scanner(caminho_2)
    // forma correta: Scanner scanner = new Scanner(new File(caminho_2))

    try (Scanner scanner = new Scanner(new File(caminho_2))) {
      while (scanner.hasNextLine()) {
        String linha = scanner.nextLine();
        dados = linha.split(",");
        if (dados.length >= 3) {
          try {
            String nome = dados[0];
            Double preco = Double.parseDouble(dados[1]);
            int quantidade = Integer.parseInt(dados[2]);
            double valortotal = preco * quantidade;

            dadosprocessados.append(nome).append(",").append(valortotal).append("\n");
          } catch (Exception e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Erro ocorrido: " + e.getMessage());
    }

    String arquivosaida = caminho + "\\out\\summary.txt";
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivosaida))) {
      bw.write(dadosprocessados.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Arquivo summary.txt criado com sucesso em: " + arquivosaida);
  }

}
