package Sessão10.Desafio_vetores.Desafio_Pratico4;

import java.util.Scanner;

public class Principal2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Atributos atri[] = new Atributos[20];

        System.out.println("Insira a quantidade de informaçoes que vai inserir no vetor:");
        int quantidade = scanner.nextInt();

        for(int i = 0; i<quantidade; i++){
        
            System.out.println("Insira o modelo do celular:");
            String modelo = scanner.next();
        
            System.out.println("Insira o ano de lançamento:");
            int ano = scanner.nextInt();

            Atributos atri2 = new Atributos(modelo, ano);

            System.out.println("Insira a posição que deseja armazenar os dados do vetor:");
            int posiçao = scanner.nextInt();

            atri[posiçao] = atri2;

        }

        

        for(int i = 0; i<atri.length; i++){
            System.out.println(atri[i] + " " + i);
        }



        scanner.close();
    }

}
