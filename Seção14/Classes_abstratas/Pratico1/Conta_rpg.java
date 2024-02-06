package Seção14.Classes_abstratas.Pratico1;

import java.util.Scanner;

public class Conta_rpg extends Conta {
    
    private String classe;
    private String classes[] = new String[]{"Mago","Guerreiro","Berserker"};

    
    public Conta_rpg(){

    }

    public Conta_rpg(String login, Double senha) {
        super(login, senha);
    }

    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    public void escolha_de_classe(Scanner scanner){
      System.out.println("\n -- SELEÇÃO_DE_CLASSE --");
      System.out.println(
        "0 - Mago \n" 
      + "1 - Guerreiro \n"
      + "2 - Berserker");
      Integer escolha = scanner.nextInt();
      
      classe = classes[escolha];
    }

    @Override
    public String visualizar_info(){
       StringBuilder sb = new StringBuilder();

        sb.append(" \n -- CONTA_RPG -- ");
        sb.append("Classe escolhida: ").append(classe + "\n");
        sb.append(super.visualizar_info());

        return sb.toString();
    }

}
