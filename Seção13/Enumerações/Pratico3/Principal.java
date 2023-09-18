package Seção13.Enumerações.Pratico3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Principal {
   
    public static void main(String[] args) {
        Info inf = new Info(" Usina V. I. Lenin", Status.LIGADA, Instant.parse("2023-09-18T16:12:26Z"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Status sts = Status.DESLIGADA;
        Status sts2 = Status.valueOf("LIGADA");

        System.out.println("Status 1: " + sts);
        System.out.println("Status 2: " + sts2);

        System.out.println(inf);

        LocalDateTime r4 = LocalDateTime.ofInstant(inf.getDatalocal(), ZoneId.of("Europe/Moscow"));
      
        System.out.println("Data no local da usina (Russia): " + r4);
        System.out.println("Data local da usina formatada: " + dtf.format(r4));
        
    }
    
}
