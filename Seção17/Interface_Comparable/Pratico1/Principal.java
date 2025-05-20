package Seção17.Interface_Comparable.Pratico1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // instanciando lista tipo String
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\jairo\\OneDrive\\Desktop\\texto\\funcionario.txt";

        System.out.println("\nDados do arquivo de texto: ");
        System.out.println("-----------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionario = br.readLine();
            while (funcionario != null) {
                String[] campos = funcionario.split(",");
                list.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
                funcionario = br.readLine();
            }

            Collections.sort(list);
            for (Funcionario func : list) {
                System.out.println(func.getNome() + ", " + func.getSalario());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
