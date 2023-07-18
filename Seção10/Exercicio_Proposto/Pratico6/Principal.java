package Seção10.Exercicio_Proposto.Pratico6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Atributos> atri = new ArrayList<>();
    
    System.out.println("Insira a quantiade de informaçoes da lista:");
    Integer info = scanner.nextInt();

    for(int i =0; i<info; i++){
        System.out.println();

        System.out.println("-------------------------");

        System.out.println("Insira o nome:");
        String nome = scanner.next();

        System.out.println("Insira o saldo:");
        Double saldo = scanner.nextDouble();

        System.out.println("Insira o ID:");
        Integer id = scanner.nextInt();
    
        Atributos att = new Atributos(nome, saldo, id);

        atri.add(att);
    }
    
    System.out.println();


    System.out.println("Elementos inseridos na lista:");
    for(Atributos at: atri){
        System.out.println(at);
    }

    System.out.println("Insira o ID do nome a ter o saldo aumentado:");
    Integer id2 = scanner.nextInt();
    Integer result = searcher(atri, id2);

    if(result == null){
        System.out.println("ID nao existente!");
    }else{
        System.out.println("ID identificado, usuário: " + atri.get(result));
        System.out.println("Insira a soma a ser depositada ao saldo:");
        Double soma = scanner.nextDouble();
        atri.get(result).aumento(soma);
        
        System.out.println();

        System.out.println("SOMA REALIZADA PARA O USUARIO: " + result);
    }

    System.out.println("Elementos atualizados:");
    for(Atributos at: atri){
        System.out.println(at);
    }


    scanner.close();

}

public static Integer searcher(List<Atributos> list, Integer id){
    for(int i = 0; i<list.size(); i++){
        if(list.get(i).getID() == id){
            return i;
        }
    }
    return null;
}

}
