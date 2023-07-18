package Seção10.Listas.Pratico1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal2 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
   
        list.add("Jairo");
        list.add("Julia");
        list.add("Leandro");


        System.out.println("Elementos da arraylist:");
        for(String ist : list){
            System.out.println("[ " + ist + " ]");
        }

        //removendo todos os elementos que iniciam com a letra 'J'
        //operação do tipo lambda chamada de 'predicado'
        list.removeIf(x -> x.charAt(0) == 'J');

        System.out.println();

        System.out.println("======================================");

        System.out.println("Elementos da arraylist modificados:");
        for(String ist : list){
            System.out.println("[ " + ist + " ]");
        }


        //armazenando todos os valores da lista iniciados com a letra 'L' na variavel select
        List<String> select = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

        System.out.println(select);

        //biblioteca list deve estar importada para operações desse tipo
        //List<String> result = list2.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
           

    }
    
}
