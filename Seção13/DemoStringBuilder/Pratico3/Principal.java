package Seção13.DemoStringBuilder.Pratico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Opinioes op = new Opinioes("Esse jogo é incrivel !");
        Opinioes op2 = new Opinioes("Virei madrugadas com esse game !");
        Opinioes op3 = new Opinioes("A melhor experiencia de ficção cientifica !");
        Opinioes op4 = new Opinioes("BELISSIMO! LINDO! PERFEITO!");

        Info_jogos inf = new Info_jogos("Half_life_2", 
        "Uma aventura de ficção cientifica, viva as aventuras de Gordon Freeman"    + "\n" +
        "O game se passa na cidade 17 em um breve futuro, onde Dr. Gordon Freeman"  + "\n" +
        "o protagonista, é acordado. Ele se encontra em um ambiente tomado pela repressão"  + "\n" +
        "e deve lutar para sobreviver, juntando-se àqueles que compartilham do ideal de mudar essa realidade", 
        sdf.parse("16/09/2004 00:00:30"));
   
        inf.addopiniao(op);
        inf.addopiniao(op2);
        inf.addopiniao(op3);
        inf.addopiniao(op4);

        System.out.println(inf.toString());
   
    }
    

}
