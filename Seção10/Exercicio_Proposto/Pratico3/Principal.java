package Seção10.Exercicio_Proposto.Pratico3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
     List<Policial> list = new ArrayList<>();

     System.out.println("-/-/-/-/- MINEAPOLIS POLICE -/-/-/-/-");


     System.out.println("Quantos policiais serão registrados?");
     int N = scanner.nextInt();
     
     //variaveis serão CRIADAS aqui
     //---NÃO--- é necessário acesso aos atributos da classe 'Policial' 
     for(int i = 0; i<N; i++){
       System.out.println();
       System.out.println("Cadastro #" + (i+1));
       System.out.println("Insira o nome do policial:");
       String nome = scanner.next();
     
       System.out.println("Insira o ID do policial:");
       Integer id = scanner.nextInt();

       System.out.println("Insira o salário do policial:");
       Double salario = scanner.nextDouble();

       Policial polis = new Policial(nome, id, salario);

       list.add(polis);

    }

    System.out.println("Elementos inseridos na lista:");
    for(Policial p : list){
        System.out.println(p);
    }

    System.out.println();
    System.out.println("Insira o ID do policial que terá aumento salarial:");
    Integer id = scanner.nextInt();
    Integer pos = posiçao(list,id);

    if(pos == null){
        System.out.println("Policial não existente nos registros!");
    }else{
        System.out.println("Insira a porcentagem de aumento salarial:");
        Double porcentagem = scanner.nextDouble();
        list.get(pos).calculo(porcentagem);
    }

    System.out.println();
    System.out.println("-- DADOS CORRIGIDOS --");
    System.out.println();
    for(Policial p : list){
        System.out.println(p);
    }
 

   scanner.close();
   }    

   public static Integer posiçao(List<Policial> list, Integer id){
    for(int i = 0; i<list.size();i++){
    if(list.get(i).getId() == id){
       return i;
       }
    }
    return null;   
}

}
