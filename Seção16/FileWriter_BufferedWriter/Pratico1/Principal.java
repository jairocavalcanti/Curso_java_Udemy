package Seção16.FileWriter_BufferedWriter.Pratico1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        String linhas[] = new String[] { "Yujiro", "Baki", "Jack" };

        String path = "c:\\temp\\Animes.txt";

        /*
         * Instanciando recurso de escrita em arquivo (BufferedWriter)
         * BufferedWriter recebendo um FileWriter a partir da variavel "path"
         */
       
         /*
          * Palavra 'true' abaixo indica que o arquivo nao será reescrito
          * As informações serão acrescentadas na ultima linha do arquivo
          * 
          */
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : linhas) {
                /*
                 * Função 'write' não possui quebra de linha padrão
                 * A quebra de linha é feita pela função 'newLine'
                 */
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
