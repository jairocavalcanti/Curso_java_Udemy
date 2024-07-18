package Seção16.FileWriter_BufferedWriter.Pratico2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        String linhas[] = new String[] { "Dopo", "Olivar", "Guevaro" };

        String path = "c:\\temp\\Animes.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ocorrido: " + e.getMessage());           
        }

    }

}
