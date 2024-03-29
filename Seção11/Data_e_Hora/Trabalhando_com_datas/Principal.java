package Seção11.Data_e_Hora.Trabalhando_com_datas;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Principal {
    
    public static void main(String[] args) throws ParseException {
      
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Criação de data no horário EXATO
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0);
        //milissegundos.segundos.minutos.horas
        //criação de datas a partir de calculos com milissegundos 
        Date x4 = new Date(1000L *60L * 60L *5L);

        Date y1 = sdf1.parse("07/06/2022");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        //data definida no horario UTC, ZULU
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("y1 : " + y1);
        System.out.println("y2 : " + y2);

        System.out.println();

        //Impressão de data no horário EXATO
        System.out.println("x1 :" + sdf2.format(x1));
        System.out.println("x2 :" + sdf2.format(x2));
        System.out.println("x3 :" + sdf2.format(x3));
        System.out.println("x4 :" + sdf2.format(x4));

        System.out.println();

        System.out.println("y1 formatado : " + sdf2.format(y1));
        System.out.println("y2 formatado : " + sdf2.format(y2));
        System.out.println("y3 :" + sdf2.format(y3) );
      
        System.out.println();

        System.out.println("x1 :" + sdf3.format(x1));
        System.out.println("x2 :" + sdf3.format(x2));
        System.out.println("x3 :" + sdf3.format(x3));
        System.out.println("x4 :" + sdf3.format(x4));

        System.out.println();

        System.out.println("y1 formatado : " + sdf3.format(y1));
        System.out.println("y2 formatado : " + sdf3.format(y2));
        System.out.println("y3 :" + sdf3.format(y3) );

    }
 

}
