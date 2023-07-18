package Seção11.Data_e_Hora.Instanciando_Data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    
    public static void main(String[] args) {
        
        //LINK PARA DOCUMENTAÇÃO SOBRE FORMATOS DE DATA E HORA NO JAVA
        /*https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html */
       
        //objeto de formatação guardando formato de escrita da data
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //objeto de formatação guardando formato de escrita da data e hora
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       
        //variavel do tipo localdate guardando 'localdate.now'
        //'localdate.now' retornará a data do atual do sistema
        LocalDate d01 = LocalDate.now();
        //abaixo codigo de mesma função porem com horario 
        LocalDateTime d02 = LocalDateTime.now();
        //variavel do tipo instant guardando 'Instant.now'
        //'Instant.now' retornará a data e horário atual no padrão 'GMT' 'ZULU' (fuso horário de Greenwich)
        Instant d03 = Instant.now();
     
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        
        //imprimindo horario no padrao GMT
        //ao fim da linha será determinada a diferença de horas 
        Instant d06 = Instant.parse("2023-05-23T15:40:26-03:00");

 
        //variavel 'fmt1' indicando o formato de interpretação da data inserida
        LocalDate d07 = LocalDate.parse("23/05/2023" , fmt1); 
        LocalDateTime d08 = LocalDateTime.parse("23/05/2023 03:30" , fmt2);


        //localdate.of aceita ano mes e dia.
        LocalDate d09 = LocalDate.of(2023, 05, 23);
        //localdatetime.of aceita ano, mes, dia, hora e minuto.
        LocalDateTime d10 = LocalDateTime.of(2023,05,23, 1,30);

        //sintaxe igualmente correta para impressao do localdate d01
        //funcao 'print' ja identifica o tostring, por isso nao é necessariamente vital que se escreva dessa forma 
        System.out.println("d01.toString() = " + d01.toString());
        System.out.println();
        //data do dia atual
        System.out.println("d01 = " + d01);
        //data do dia atual com horario atual 
        System.out.println();
        System.out.println("d02 = " + d02);
        System.out.println();
        //data hora no fuso horario de Greenwich, 'GMT' 'ZULU'
        System.out.println("d03 = " + d03);
        System.out.println();
        System.out.println("d04 = " + d04);
        System.out.println();
        System.out.println("d05 = " + d05);
        System.out.println();
        System.out.println("d06 = " + d06);
        System.out.println();
        System.out.println("d07 = " + d07);
        System.out.println();
        System.out.println("d08 = " + d08);
        System.out.println();
        System.out.println("d09 = " + d09);
        System.out.println();
        System.out.println("d09 = " + d10);
    }
}
