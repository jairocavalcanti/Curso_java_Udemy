package Seção14.Metodos_abstratos.Pratico1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //A lista precisa ser declarada como sendo do tipo superclasse do programa
        //Dessa forma essa lista irá aceitar dados de todos os tipos das subclasses
        List<Formato> lista = new ArrayList<>();

        System.out.print("Insira o numero de formas: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Dados do formato #" + (i+1) + ":");
            System.out.print("Retangulo ou circulo (r/c) ?");
            char ch = scanner.next().charAt(0);
            System.out.print("Cor (PRETO / AZUL / VERMELHO): ");
            //A informação inserida pelo usuário será convertida para o objeto do tipo enumerado "cor"
            Cor cor = Cor.valueOf(scanner.next());
            
            if(ch == 'r'){
                System.out.print("Largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();

                lista.add(new Retangulo(cor, largura, altura));
            }else{
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                lista.add(new Circulo(cor, raio));
            }
        }

        System.out.println();
        System.out.println("AREA DOS FORMATOS: ");
        for(Formato formato: lista){
            System.out.println(String.format("%.2f", formato.area()));
        }

        scanner.close();
    }   

}
