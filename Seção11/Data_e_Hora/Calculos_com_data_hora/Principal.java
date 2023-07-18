package Sessão11.Data_e_Hora.Calculos_com_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
                                       
        //ano/mes/dia
        //apos instanciar data-hora, estado do objeto nao será alterado, outro objeto será criado para alterações
        LocalDate d01 = LocalDate.parse("2023-06-06");
        LocalDateTime d02 = LocalDateTime.parse("2023-06-06T16:35");
        Instant d03 = Instant.parse("2023-06-06T16:35:45Z");

        //'pastweeklocaldate' subtraindo 7 dias da data armazenada em 'd01':
        // nome 'pastweek' se deve a operação que resultará em um periodo de 7 dias anteriores, ou seja, semana passada-'pastweek' 
        //'localdate' é capaz de fazer varias operações de calculo com datas
        LocalDate pastweeklocaldate = d01.minusDays(7);
        LocalDate nextweekdate = d01.plusDays(7);

        System.out.println("Pastweeklocaldate = " + pastweeklocaldate);
        System.out.println("Nextweeklocaldate = " + nextweekdate);
        
        System.out.println();

        LocalDateTime pastweeklocaldatetime = d02.minusDays(7);
        LocalDateTime nextweekdatetime = d02.plusDays(7);

        System.out.println("Pastweeklocaldatetime = " + pastweeklocaldatetime);
        System.out.println("Nextweeklocaldatetime = " + nextweekdatetime);
        
        System.out.println();

        Instant pastweekinstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextweekinstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Pastweekinstant = " + pastweekinstant);
        System.out.println("Nextweekinstant = " + nextweekinstant);

        Duration t1 = Duration.between(pastweeklocaldate.atStartOfDay(),d01.atStartOfDay());
        Duration t2 = Duration.between(pastweeklocaldatetime, d02);
        Duration t3 = Duration.between(pastweekinstant,d03);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}
