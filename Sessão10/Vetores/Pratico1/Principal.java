package Sessão10.Vetores.Pratico1;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        //criação do vetor armazenando 
        //"n" nesse caso define o tamanho do vetor
        double[] vect = new double[N];

        for(int i =0; i<N; i++){
            vect[i] = scanner.nextDouble();
        }

        double zero = 0.0;
        for(int i = 0; i <N ;i++){
            zero += vect[i];
        }

        double divisao = zero/N;

        System.out.println(divisao);

 
        scanner.close();
    }


}
