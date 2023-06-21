package Sessão9.Encapsulamento.Pratico1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Insira um nome:");
        String nome = scanner.next();
        Atributos at = new Atributos(nome);

        //atualização do nome atraves de encapsulamento
        at.setNome("Jonatan Aron Leandoer Håstad");
        System.out.println("Nome atualizado:" + at.getNome());
        System.out.println(at);

        //atributo nome nao vai ser acessivel pois é privado
        //at.nome = scanner.next();
    
        scanner.close();
    }

}
