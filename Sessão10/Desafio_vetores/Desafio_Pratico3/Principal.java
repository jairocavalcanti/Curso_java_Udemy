package Sessão10.Desafio_vetores.Desafio_Pratico3;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Atributos[] vetor = new Atributos[10];

    //definindo a quantidade de repetições e consequentemente quantidade de armazenamento das informações
    System.out.println("Insira a quantidade de armas que deseja alugar: ");
    int quant = scanner.nextInt();

    //inserindo as informações de acordo com o numero de vezes escolhido
    for(int i = 1; i<=quant; i++){
        System.out.println("insira o nome da arma:");
        String nome = scanner.next();

        System.out.println("Insira o calibre da arma:");
        String calibre = scanner.next();

        //definindo em qual posiçao do vetor ficarao armazenadas tais informações
        System.out.println("Insira em qual posiçao do vetor deseja guardar essas informaçoes:");
        int posiçao = scanner.nextInt();

        //atribuindo os valores ao construtor da classe atributos
        Atributos atri2 = new Atributos(nome, calibre );
        //armazenamento sendo feito na posiçao do vetor indicada anteriormente pelo usuario
        vetor[posiçao] = atri2;

    }

    
    for(int i = 1; i<10; i++){
        System.out.println(vetor[i]);
    }
    



    scanner.close();

  }
    
}
