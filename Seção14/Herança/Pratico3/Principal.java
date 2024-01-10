package Seção14.Herança.Pratico3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Consoles con = new Consoles();
       Equipamentos equip = new Equipamentos();
       Pc comp = new Pc();

       System.out.println("Insira qual produto deseja adicionar a sua lista: 1 - Consoles // 2 - PC's ");
       Integer escolha = scanner.nextInt();

       if(escolha == 1){
       
        con.mostrar_vetores();
        
        System.out.println("Insira a quantidade de consoles que deseja adicionar na lista: ");
        int quantidade = scanner.nextInt();

        for(int i =0; i< quantidade; i++){

        System.out.println("Insira a #numeração de um console: ");
        int escolha_1 = scanner.nextInt();

        Consoles con_1 = new Consoles(
        con.vetor_nome[escolha_1], 
        con.vetor_marca[escolha_1], 
        con.vetor_preco[escolha_1],
        con.vetor_CPU[escolha_1], 
        con.vetor_GPU[escolha_1],
        con.vetor_RAM[escolha_1]);
        
        equip.adicionar_a_lista(con_1);
       
        }
        
        System.out.println("-- SUA LISTA DE PRODUTOS -- ");
        equip.visualizar_lista();
        System.out.println("----------------------------------------");
        System.out.println("-- TOTAL A SER PAGO --");
        equip.total();
        
       }else{

        comp.mostrar_vetores();

        System.out.println("Insira a quantidade de PC's que deseja adicionar na lista: ");
        int quantidade = scanner.nextInt();

        for(int i =0; i< quantidade; i++){

        System.out.println("Insira a #numeração de um PC: ");
        int escolha_1 = scanner.nextInt();

        Pc pc_1 = new Pc(
        comp.vetor_nome[escolha_1], 
        comp.vetor_marca[escolha_1], 
        comp.vetor_preco[escolha_1],
        comp.vetor_CPU[escolha_1], 
        comp.vetor_GPU[escolha_1],
        comp.vetor_RAM[escolha_1]);
        
        equip.adicionar_a_lista(pc_1);
        
        }
    
        System.out.println("-- SUA LISTA DE PRODUTOS -- ");
        equip.visualizar_lista();
        System.out.println("----------------------------------------");
        System.out.println("-- TOTAL A SER PAGO --");
        equip.total();
    
    
    }

    scanner.close();
    }
    
}
