package Sessão10.Listas.Pratico1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        
        //lista nao pode ser criada com tipos primitivos, apenas com wrapper classes
        //List<int> list1;
       
        //sintaxe correta para lista do tipo String
        List<String> list2 = new ArrayList<>();

        list2.add("Maria");
        list2.add("Alex");
        list2.add("Bob");
        list2.add("Anna");
        
        //Codigo para inserçao de  certo elemento em determinada posição da lista
        //O numero na primeira posiçao significa o lugar onde sera armazenado o elemento
        //A segunda posiçao determina o elemento
        list2.add(2,"jairo");

        System.out.println();
        
        //Codigo para impressão de elementos presentes na lista
        //ArrayList ja vem com uma formataçao propria portanto pode ser impressa dessa forma
        //Outros tipos de sintaxe para impressao serão necessários em casos mais complexos
        System.out.println(list2);
         
        System.out.printf("Tamanho da lista:");
        System.out.println( " " + list2.size());

        //Remoção de elemento atraves da função 'remove'
        //list2.remove(1);
       
        //remoção por predicado 
        //a remoçao por predicado é capaz de remover elementos que comecem com determinado caracter
        //no exemplo abaixo está sendo feita a remoçao de todos os elementos que começam com a letra 'M'
        list2.removeIf(x -> x.charAt(0) == 'M');


        for(String list : list2){
            System.out.println("[ " + list + " ]");
        }

        
        System.out.println("-------------------------------------");
       
        //comando indexOf mostra a posição de determinado elemento 
        System.out.println("Posiçao do 'jairo':" + list2.indexOf("jairo"));
      
        //Quando o indexOf nao encontrar o elemento, ele retornara -1
        System.out.println("Posiçao do 'priscilo':" + list2.indexOf("Priscilo"));

        System.out.println("-------------------------------------");

        //codigo para filtrar somente os elementos começados com determinando caracter
        //.stream com .filter é capaz de fazer isso atraves de predicados, porem precisa ser retorando ao formato list atraves do .collect
        // forma que o java 'encontrou' para manter operaçoes lambda com o list
        List<String> result = list2.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    
        for(String list : result){
            System.out.println("[ " + list + " ]");
        }
        System.out.println("-------------------------------");
       
        //codigo para 'pegar' o primeiro elemento indicado pelo caracter no predicado 
        //através do 'findfirst'
        //se o elemento nao for encontrado o codigo retornara nulo
        String name = list2.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
        System.out.println(name);
    
  }
}