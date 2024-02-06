package Seção14.Classes_abstratas.Pratico1;

import java.util.Scanner;

public class Conta_fps extends Conta {

    private String tipo_de_atirador;
    private String tipos[] = new String[]{"Fuzileiro", "Atirador_de_elite", "Cartucheiro"};


    public Conta_fps(){

    }

    public Conta_fps(String login, Double senha) {
        super(login, senha);
    }


    public String getTipo_de_atirador() {
        return tipo_de_atirador;
    }

    public void setTipo_de_atirador(String tipo_de_atirador) {
        this.tipo_de_atirador = tipo_de_atirador;
    }


    public void escolha_de_tipo(Scanner scanner){
      System.out.println("\n -- SELEÇÃO_DE_ATIRADOR --");
      System.out.println(
         "0 - Fuzileiro \n" 
       + "1 - Atirador de elite \n"
       + "2 - Cartucheiro");
       Integer escolha = scanner.nextInt();
    
       tipo_de_atirador = tipos[escolha];
    }

    @Override
    public String visualizar_info(){
       StringBuilder sb = new StringBuilder();

        sb.append(" \n -- CONTA_FPS -- ");
        sb.append("Classe escolhida: ").append(tipo_de_atirador + "\n");
        sb.append(super.visualizar_info());

        return sb.toString();
    }
    
}
