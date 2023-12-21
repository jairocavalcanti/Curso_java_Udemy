package Seção14.UPcas_DOWNcas.Pratico2;

import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* -- UPCASTING -- */

        Usina usi2 = new Usina_hidreletrica("Brasil" , "Itaipu", "Hidreletrica", 6000.00);
        Usina usi3 = new Usina_nuclear("Russia", "Stalin", "Nuclear", 9000.00);


        /* -- DOWNCASTING -- */

        Usina_hidreletrica usi4 = (Usina_hidreletrica)usi2;
        Usina_nuclear usi5 = (Usina_nuclear)usi3;


        System.out.println("Insira a taxa por hora da usina hidreletrica: ");
        Double taxa_por_hora = scanner.nextDouble();

        usi4.contabilizarvolts(taxa_por_hora);

        System.out.println("-----------------------------------------------------------");

        System.out.println("Insira a taxa por hora da usina nuclear: ");
        Double taxa_por_hora_2 = scanner.nextDouble();

        usi5.contabilizarkilowats(taxa_por_hora_2);

        System.out.println("-----------------------------------------------------------");

        if(usi2 instanceof Usina_hidreletrica){
           System.out.println(" -- Informações da usina hidreletrica -- "); 
           System.out.printf("País: ");
           usi2.mostrarpais();
           System.out.printf("Nome: ");
           usi2.mostrarnome();
           System.out.printf("Tipo: ");
           usi2.mostrartipo();
        }
        
        System.out.println("-----------------------------------------------------------");

        if(usi3 instanceof Usina_nuclear){
           System.out.println("-- Informações da usina nuclear -- ");
           System.out.printf("País: ");
           usi3.mostrarpais();
           System.out.printf("Nome: ");
           usi3.mostrarnome();
           System.out.printf("Tipo: ");
           usi3.mostrartipo();
        }

        
        scanner.close();
    }
    
}
