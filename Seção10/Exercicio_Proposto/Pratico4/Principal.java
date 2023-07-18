package Seção10.Exercicio_Proposto.Pratico4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Armas> LIST = new ArrayList<>();

        System.out.println("Insira a quantidade de armas a serem cadastradas:");
        int quanti = scanner.nextInt();

        for(int i=0; i<quanti; i++){
            System.out.println();
            System.out.println("Cadastro #" + (i + 1));
            System.out.println("Insira o nome da arma:");
            String nome = scanner.next();

            System.out.println("Insira o numero de serie da arma:");
            Integer numerodeserie = scanner.nextInt();

            Armas ar = new Armas(nome, numerodeserie);

            LIST.add(ar);
        }

        System.out.println();

        System.out.println("--- ARMAS CADASTRADAS ---");
        for(Armas a: LIST){
            System.out.println(a);
        }

        System.out.println("Insira o numero de serie da arma que deseja identificar:");
        Integer numerodeserie = scanner.nextInt();

        String posi = posicao(LIST, numerodeserie);

        if(posi == null){
            System.out.println("Nenhuma arma identificada com esse numero de serie !!");
        }else{
            System.out.println("Arma identificada: " + posi);
        }

       scanner.close();
    }

    //metodo que recebe o arraylist e identifica o nome de acordo com a posiçao do numero de serie
    public static String posicao(List<Armas> list , Integer numerodeserie){
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getNumerodeserie() == numerodeserie){
                return list.get(i).getNome();
                }
            }
            //'else' nao pode ser usado em um laço for entao a outra 'condição' fica fora da estrutura.
            return null;
        }
        
    }

