package Sessão11.Data_e_Hora.Calculos_com_data_hora;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal2 {
    
    public static void main(String[] args) throws ParseException {
        
        LocalDate d01 = LocalDate.parse("2023-06-13");
        LocalDate d02 = LocalDate.now(); 
        LocalDate semanapassada = d01.minusDays(7);
        LocalDate semanaquevem = d01.plusDays(7);
    

        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat sdf1  = new SimpleDateFormat("dd/MM/yyyy");
        Date da01 = sdf1.parse("12/03/2001");
       

        Instant inst1 = Instant.now();
        Instant atualinstant = inst1.minus( 3, ChronoUnit.HOURS);
        Instant atualinstant2 = inst1.minus(7, ChronoUnit.DAYS);
    

        System.out.println();
 

        System.out.println("Data sem formatação: " + d01);
        System.out.println("Data formatada: " + dtf1.format(d01));
        System.out.println("Data de 2001 em formatação padrão: " + da01);
        System.out.println("Data do dia 13 com 7 dias subtraidos: " + semanapassada);
        System.out.println("Data do dia 13 com 7 dias somados: " + semanaquevem);
   

        System.out.println();


        System.out.println("Data atual: " + d02);
        System.out.println("Data-hora atual com 3 horas atrasado de acordo com GMT: " + atualinstant);
        System.out.println();
        System.out.println("Data-hora atual com 7 dias de atraso 3 horas adiantado de acordo com GMT: " + atualinstant2);
        System.out.println("Data-hora atual com 3 horas de atraso formatada: " + dtfm.format(atualinstant));
        System.out.println();
        System.out.println("Data-hora atual com 7 dias de atraso formatada: " + dtfm.format(atualinstant2));
        System.out.println("Data atual formatada com horario atual: " + dtfm.format(inst1));
     
       
    }

}
