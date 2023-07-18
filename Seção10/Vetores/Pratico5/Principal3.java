package Seção10.Vetores.Pratico5;

import java.util.Arrays;
import java.util.Scanner;


/*Fazer um programa para ler nome,idade e altura de N pessoas.
 * Depois, mostrar na tela a altura media das pessoas, 
 * e mostrar tambem a porcentagem de pessoas com menos de 16 anos,
 * bem como nome dessas pessoas caso houver.
 */
public class Principal3 {
    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Defina o tamanho dos vetores:");
     int N = scanner.nextInt();

     String vetnome[] = new String[N];
     int vetidade[] = new int [N];
     double vetaltura[] = new double[N];


     System.out.println("Insira os nomes:");
     for(int i = 0; i< vetnome.length; i++){
        vetnome[i] = scanner.next();
     }
 
     System.out.println("Insira as idades:");
     for(int i = 0; i< vetidade.length; i++){
        vetidade[i] = scanner.nextInt();
     }

     System.out.println("Insira as alturas:");
     for(int i = 0; i< vetaltura.length; i++){
        vetaltura[i] = scanner.nextDouble();
     }


    System.out.println("Nomes inseridos:");
    System.out.println(Arrays.toString(vetnome));

    System.out.println("Idades inseridas:");
    System.out.println(Arrays.toString(vetidade));

    System.out.println("Alturas inseridas:");
    System.out.println(Arrays.toString(vetaltura));

    System.out.println("--- DADOS ---");
   
    System.out.println();

    System.out.println("--Altura media das pessoas--");

    System.out.println();
    
    double zero = 0;
    for(int i = 0; i< vetaltura.length; i++){
       zero += vetaltura[i];
    }
 
    double result = zero / vetaltura.length;
    System.out.println("soma das alturas: -- " + zero);
    System.out.println("Media das alturas inseridas: -- " + result);

    System.out.println();

    System.out.println("--Checagem 16 anos--");

    System.out.println();

    int mid = 0 ;
    int mid2 = 1;
    for(int i = 0; i< vetidade.length; i++){
        if(vetidade[i] < 16){
        System.out.println("Menos de 16 na lista localizado:" + mid2++ + " --- " + vetnome[i]);                
        mid ++;
           }  
        }
  
        double porcentagem = ((double)mid /N) * 100.0;

        System.out.println("Porcentagem de pessoas menores de 16: -- " + porcentagem + "%");

    scanner.close();
    }

}
