package Seção17.Interface_Comparable.Pratico2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Armas> lista = new ArrayList<>();
        String path = "C:\\Users\\jairo\\OneDrive\\Desktop\\texto\\armas.txt";

        System.out.println("\nDados do arquivo de texto: ");
        System.out.println("-----------------------------------------------");

        // instanciando leitor de arquivo e passando o caminho do arquivo especificado
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String dados = br.readLine();
            while (dados != null) {
                String[] campos = dados.split(",");
                lista.add(new Armas(campos[0], Integer.parseInt(campos[1])));
                dados = br.readLine();
            }

            Collections.sort(lista);
            for (Armas armas : lista) {
                System.out.println(armas.getNome() + ", " + armas.getNumeroDeSerie());
            }

        } catch (Exception e) {
            System.out.printf("Erro ocorrido no sistema: ", e.getMessage());
        }

    }

}
