package Sessão10.Listas.Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArray2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Insira seu nome:");
        String nome = scanner.next();

        list.add(nome);

        System.out.println();

        System.out.println("Elemento adicionado a lista:");
        System.out.println(list);

        scanner.close();
    }

}
