package Seção10.Exercicio_Proposto.Pratico5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Jogadores> list = new ArrayList<>();

        System.out.println("Insira a quantidade de jogadores a serem cadastrados:");
        Integer quanti = scanner.nextInt();

        for(int i =0; i<quanti; i++){
             
            System.out.println("Insira o nome do jogador:");
            String nome = scanner.next();

            System.out.println("Insira a pontuação do jogador:");
            Integer ponto = scanner.nextInt();

            System.out.println("Insira o ID do jogador:");
            Integer id = scanner.nextInt();
      
            Jogadores player = new Jogadores(nome, ponto, id);

            list.add(player);
       
        }

        System.out.println();

        
        System.out.println("DADOS INSERIDOS:");
        for(Jogadores jog : list){
            System.out.println(jog);
        }


        System.out.println("Insira o ID do jogador que terá a pontuação aumentada:");
        Integer id = scanner.nextInt();
        Integer pos = searcher(list, id);

        if(pos == null){
            System.out.println("Jogador nao existente!");
        }else{
            System.out.println("Insira a  quantidade de pontos a serem adicionados:");
            Integer pontos = scanner.nextInt();
            list.get(pos).somapontos(pontos);
        }

        System.out.println();

        System.out.println("DADOS ATUALIZADOS:");
        for(Jogadores jog : list){
            System.out.println(jog);
        }

   
        scanner.close();
    }
  
    
    public static Integer searcher(List<Jogadores> list, Integer id){
       for(int i = 0; i<list.size(); i++){
          if(list.get(i).getId() == id ){
            return i;
          }
       }
       return null;
    }

}
