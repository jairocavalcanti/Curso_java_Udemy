package Seção11.Data_e_Hora.Convertendo_data_hora_para_texto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Principal {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        //Instant : data hora Global
        //d03 guardando texto no fuso horario de greenwich 
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        //formato para impressão de data sendo definido
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //formato para impressão de data com HORA sendo definido 
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      
        //formato para impressao de data hora considerando fuso horario LOCAL
        //.withZone(ZoneId.systemDefault()) aponta o fuso horário do sistema local
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //ISO_DATE_TIME - DATA LOCAL SEM FUSO HORARIO
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        //imprimindo data no formato definido acima 
        System.out.println("d01 = " + d01.format(fmt1));
       
        //formas alternativas de imprimir data no formato definido 
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
   
        System.out.println();

        System.err.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));
      
        //data sendo imprimida no formato ISO_DATE_TIME
        System.out.println("d02 = " + d02.format(fmt4));

        System.out.println();

        /*para impressao do tipo instant, voce deve 'apontar' qual fuso horario deve ser considerado,
        isso será feito a partir do datetimeformatter */
        //texto da variavel 'd03' formatado para fuso horario de sao paulo
        System.out.println("d03 = " + fmt3.format(d03));
        System.out.println("d03 = " + fmt5.format(d03));
        System.err.println("d03 = " + d03.toString());
    }
    
}
