package Seção16.Bloco_try_with_resources.Pratico1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        /*
        * Instanciando abaixo o BufferedReader passando como argumento em seu construtor o FileReader, 
        * Isso evita a necessidade de guardar o FileReader em uma variável
        * Forma mais enxuta de ler arquivos de texto com java
        */
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
    }
}
