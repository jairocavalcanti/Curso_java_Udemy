package Seção13.DemoStringBuilder.Pratico2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {
        
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Observacoes obs = new Observacoes("Precisamos de uma equipe o mais rapido possivel !");
    Observacoes obs2 = new Observacoes("Sugiro uma reunião emergencial !");
    Observacoes obs3 = new Observacoes("O prefeito ja está ciente !");
    Relatorios rel = new Relatorios(sdf.parse("22/08/1981 10:18:39"), 
    "Rachadura encontrada na ponte", 
    "Rachadura de alta periculosidade encontrada no pilar central da ponte");
    

    rel.addobservacao(obs);
    rel.addobservacao(obs2);
    rel.addobservacao(obs3);

    System.out.println(rel.toString());


     }
}
