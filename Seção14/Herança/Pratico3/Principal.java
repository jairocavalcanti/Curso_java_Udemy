package Seção14.Herança.Pratico3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Consoles con = new Consoles();
       Equipamentos equip = new Equipamentos();

       System.out.println("Insira qual produto deseja adicionar a sua lista: 1 - Consoles // 2 - PC's ");
       Integer escolha = scanner.nextInt();

       if(escolha == 1){
       
        con.mostrar_vetores();
        
        System.out.println("Insira a quantidade de consoles que deseja adicionar na lista: ");
        int quantidade = scanner.nextInt();

        for(int i =0; i< quantidade; i++){

        System.out.println("Insira a numeração de um console: ");
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
       
        equip.visualizar_lista();


       }

       


       /* 
       Consoles con = new Consoles(nome, marca, valor, cpu, gpu, ram);
       Equipamentos equip = new Equipamentos(nome, marca, valor);

       equip.adicionar_a_lista(con);
       equip.visualizar_lista();
       */
       scanner.close();
    }
    
}
