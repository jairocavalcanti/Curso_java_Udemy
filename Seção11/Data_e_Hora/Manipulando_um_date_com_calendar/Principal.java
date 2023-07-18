package Seção11.Data_e_Hora.Manipulando_um_date_com_calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        //criação de calendario
        Calendar cal = Calendar.getInstance();
        //Armazenando data em calendario 
        cal.setTime(d);
        //Comando para adição de horas no dia de uma data criada com calendar
        cal.add(Calendar.HOUR_OF_DAY, 4);
        ///Adicionando horas a data estabelecida
        d = cal.getTime();

        System.out.println(sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE);
        //Adicionando 1 ao tipo calendar pois o calendario começa em 0, janeiro equivale ao mes 0
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Minutos da data-hora estabelecida acima: " + minutes + " -- minutos");
        System.out.println("Mes da data-hora estabelecida acima: " + month);
    }

}
