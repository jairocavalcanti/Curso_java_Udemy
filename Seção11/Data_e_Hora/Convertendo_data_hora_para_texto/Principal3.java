package Sessão11.Data_e_Hora.Convertendo_data_hora_para_texto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Principal3 {
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.parse("2023-06-02");
        Instant d3 = Instant.parse("2023-06-05T05:00:09Z");
        LocalDateTime d4 = LocalDateTime.parse("2023-05-17T14:52:09");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
       
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("Data do dia atual: -- " + d1);
        System.out.println("d02 = " + d2.format(fmt1));
        System.out.println("d03 = " + fmt2.format(d3));
       
        System.out.println("d04 = " + d4.format(fmt3));




    }
    
}
