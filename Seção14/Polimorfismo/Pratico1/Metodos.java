package Seção14.Polimorfismo.Pratico1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Metodos {
    
    private DecimalFormat df = new DecimalFormat("R$: #,###.##");
    private Random rand = new Random();
   
    private int caixa[] = new int[]{22000};
    private Integer id;


    public Metodos(){

    }


    public void sacarvalor(int valor){
          
          System.out.println();
          System.out.println("Valor disponivel em caixa: " + Arrays.toString(caixa));
         
          caixa[0] -= valor;

          System.out.println("----------------------------------------");
          System.out.println("Saque realizado !");

          id = rand.nextInt(1000);

          System.out.println("ID da transação -- [" + id + "]");
          System.out.println("Valor sacado --  : " + df.format(valor));
          System.out.println("Valor restante no caixa: " + df.format(caixa[0]));
          System.out.println("----------------------------------------");

    }
}