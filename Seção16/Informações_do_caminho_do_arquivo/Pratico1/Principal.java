package Seção16.Informações_do_caminho_do_arquivo.Pratico1;

import java.io.File;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Entre a file path: ");
      String caminho_str = scanner.next();

      File caminho = new File(caminho_str);

      System.out.println("GetName: " + caminho.getName());
      System.out.println("GetCaminho: " + caminho.getParent());
      System.out.println("GetDiretório: " + caminho.getPath());

      scanner.close();
    }

}
