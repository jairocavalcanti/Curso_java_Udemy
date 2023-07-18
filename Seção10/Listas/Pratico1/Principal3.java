package Seção10.Listas.Pratico1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Principal3 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("jairo");
        list.add("julia");
        list.add("irving");
        list.add("CJ");
        list.add("Carlos");


        System.out.println("------ Informações da Lista ------");
   
        System.out.println();

        System.out.println("Elementos da Lista:");
        for(String s: list){
            System.out.println("[ " + s + " ]");
        }

        System.out.println();

        System.out.println("Tamanho da lista:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("Posições da lista:");
       
        System.out.println("-----------------------------------------------");

        System.out.println("Posição de 'jairo': " + list.indexOf("jairo"));
        System.out.println("Posição de 'julia': " + list.indexOf("julia"));
        System.out.println("Posição de 'irving': " + list.indexOf("irving"));
        System.out.println("Posiçao de 'CJ': " + list.indexOf("CJ"));
        
        System.out.println();

        System.out.println("** Nomes iniciados com C na lista **");
        List<String> seleçao = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
        
        System.out.println(seleçao);

        System.out.println();
         
        list.removeIf(x -> x.charAt(0) == 'C');
        System.out.println("** Nomes iniciados com C removidos **");

        //List<String> select = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

        System.out.println(list);

       
        
    }
    
}
