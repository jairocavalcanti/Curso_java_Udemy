package Seção16.Manipulando_Pastas_com_file.Pratico1;

import java.io.File;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o caminho da pasta: ");
        String str_caminho = scanner.nextLine();

        // Uma variável do tipo 'File' pode ser o caminho de um arquivo ou o caminho de
        // uma pasta
        File caminho = new File(str_caminho);

        // Função 'isDirectory' deixa expecificado que só serão listados os diretórios
        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File folder : pastas) {
            System.out.println(folder);
        }

        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File file : arquivos){
            System.out.println(file);
        }

        boolean sucesso = new File(str_caminho + "Subdiretório").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso);

        scanner.close();
    }

}
