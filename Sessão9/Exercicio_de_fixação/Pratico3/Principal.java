package Sessão9.Exercicio_de_fixação.Pratico3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Metodos met;
        Integer quqnatidadedemuniçao = 0;

        System.out.println("Insira o nome da arma:");
        String nome = scanner.next();
   
        System.out.println("Insira o calibre da arma:");
        Double calibre = scanner.nextDouble();

        System.out.println("Deseja adicionar balas ao pente da sua arma? --- (y/n)");
        char escolha = scanner.next().charAt(0);
        if(escolha == 'y'){
        System.out.println("Insira a quantiade de balas a serem adicionadas:");
        Integer quant2 = scanner.nextInt();
        
        met = new Metodos(quqnatidadedemuniçao, nome, calibre);
        met.adicionarmuniçao(quant2);
       
       }else{
            met = new Metodos(quqnatidadedemuniçao, nome, calibre);
        }
       
        System.out.println("Dados atualizados:");
        System.out.println(met.toString());
        
        System.out.println("Deseja fazer mais alguma alteração nos dados? --- (y/n)");
        char escolha2 = scanner.next().charAt(0);
            
        if(escolha2 == 'y'){
            System.out.println("Operações disponiveis: 1 - adicionar mais muniçao // 2 - subtrair muniçao ");
            Integer escolha3 = scanner.nextInt();
        switch (escolha3) {
          case 1:
           System.out.println("Insira a quantiade de municao a ser adicionada:");
            Integer quant3 = scanner.nextInt();
            met.adicionarmuniçao(quant3);
       
            break;
         
        case 2:
          System.out.println("Insira a quantidade de municao a ser subtraida:");
          Integer quant4 = scanner.nextInt();
          met.subtrairmuniçao(quant4);


       default:
        System.out.println("!!Dados incoerentes ou nao inseridos!!");
        break;
        } 
           }
       

        System.out.println(met);
        scanner.close();

    }

}
