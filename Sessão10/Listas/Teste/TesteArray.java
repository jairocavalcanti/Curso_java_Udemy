package Sessão10.Listas.Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<Atributos> array = new ArrayList<>();

    System.out.println("Insira um nome:");
    String nome = scanner.next();
    
    array.add(new Atributos(nome));

    System.out.println();

    for( Atributos at : array){
        System.out.println("[" + at.getNome() + "]");
    }
    
    scanner.close();
}
    
}
