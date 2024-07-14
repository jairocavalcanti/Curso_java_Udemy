package Seção16.Lendo_Arquivo_de_Texto.Pratico1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try {
            // Instanciando o scanner normalmente, porem,
            // ao invés de 'System.in' como argumento, passamos 'file'
            // Um arquivo substitui o 'System.in'
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ocorrido: " + e.getMessage());
        // Fechamento de recurso 'scanner' feito em bloco finally, uma boa prática
        } finally {
            if (sc != null) { 
                sc.close();
            }
        }
    }

}
