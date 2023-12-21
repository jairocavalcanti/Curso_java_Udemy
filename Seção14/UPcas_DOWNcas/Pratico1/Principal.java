package Seção14.UPcas_DOWNcas.Pratico1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       // Conta conta = new Conta(1001, "Alex", 0.0);
       // Conta_negocios conta_n = new Conta_negocios(1002,"Maria", 0.0,500.0);

        // -- UPCASTING -- //
        
        // Podemos relacionar objetos da SUBCLASSE com os da SUPERCLASSE pois as mesmas estao relacionadas através da Herança
        // É comum associar objetos de uma subclasse com objetos de uma superclasse, isso é UPCASTING
        
        //Conta conta_1 = conta_n;
        Conta conta_2 = new Conta_negocios(1003, "Bob", 0.0, 200.0);
        Conta conta_3 = new Contas_salvas(1004, "Ana", 0.0, 0.01);

        

        // -- DOWNCASTING -- //

        // Downcasting significa converter um objeto da SUPERCLASSE para SUBCLASSE ou seja, o inverso de upcasting

        
        /*  
        conta_2.emprestimo()
        não podemos fazer a chamada do metodo emprestimo como acima pois a variavel "conta_2" é do tipo "Conta"  
        */
       
        Conta_negocios conta_negocios_1 = (Conta_negocios)conta_2;
        conta_negocios_1.emprestimo(100.0);
        
        /* 
        conta_3 nao pode ser convertida para uma conta_negocios pois ela é uma variavel do tipo conta, mas nao do tipo conta_nogocios
        isso irá causar um erro em tempo de execução
        Conta_negocios conta_negocios_2 = (Conta_negocios)conta_3;
        */

        //Correção do erro com palavra instanceof abaixo:

        if(conta_3 instanceof Conta_negocios){
          Conta_negocios conta_negocios_2 = (Conta_negocios)conta_3;
          conta_negocios_2.emprestimo(200.0);
          System.out.println("Empréstimo !");
          }

         if(conta_3 instanceof Contas_salvas){
            Contas_salvas contas_salvas_1 = (Contas_salvas)conta_3;
            contas_salvas_1.atualizarsaldo();
            System.out.println("Saldo atualizado!");
         }

        
 

        scanner.close();
    }    
}
