package Seção16.FileReader_BufferedReader.Pratico1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            /*
             * Estabelecendo uma Stream (sequencia de leitura)
             * que estiver no caminho especificado a partir do arquivo
             */
            fr = new FileReader(path);
            /*
             * BufferedReader é instanciado a partir do FileReader
             * FileReader é a stream básica, a partir dela instanciamos
             * o BufferedReader
             */
            br = new BufferedReader(fr);

            // "readLine" lerá cada uma das linhas do arquivo
            // função alocada em uma variável do tipo String
            // ao fim do arquivo ele retornará nulo
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                // readiline dentro do loop para que a leitura de linhas continue
                line = br.readLine();
            }

            // forma alternativa: br = new BufferedReader(new FileReader(path));
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                //fechamento das streams utiliza try - catch pois pode gerar excessão
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }

}
