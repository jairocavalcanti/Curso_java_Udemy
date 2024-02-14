package Seção14.Metodos_abstratos.Pratico2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Formato> lista = new ArrayList<>();

        System.out.println("Insira a quantidade de formas que deseja calcular a area: ");
        int quantidade = scanner.nextInt();

        for(int i = 0; i< quantidade; i++){
           
            System.out.println("\n-------------------------------");
            System.out.println("Dados do formato #" + (i+1) + " :");
           
            System.out.printf("Quadrado ou triangulo: (Q/T) -- ");
            char ch = scanner.next().toLowerCase().charAt(0);
        
            System.out.printf("cor (VERDE / AZUL / PRETO) -- ");
            Cor cor = Cor.valueOf(scanner.next().toUpperCase());

            if(ch == 'q'){
                System.out.printf("Insira a base do quadrado: ");
                Double base = scanner.nextDouble();

                System.out.printf("Altura do quadrado: " + base);
                Double altura = base;
                   
                Quadrado quadra = new Quadrado(cor, base, altura);
                lista.add(quadra);
            
            }else{
                
                System.out.printf("Insira a base do triangulo: ");
                Double base = scanner.nextDouble();

                System.out.printf("Insira a altura do triangulo: ");
                Double altura = scanner.nextDouble();

                Triangulo tri = new Triangulo(cor, base, altura);
                lista.add(tri);
            }

            System.out.println("\n -------------------------------");
            System.out.println(" -- INFORMAÇÕES AREA/COR --");
            for(Formato form: lista){
               System.out.println(form.area());
            }

        }
        
        scanner.close();
    }
    
}
