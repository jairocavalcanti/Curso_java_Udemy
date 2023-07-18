package Seção11.Data_e_Hora.Convertendo_data_hora_para_texto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Principal2 {
    public static void main(String[] args) {
         
        LocalDate d1 = LocalDate.now();
        //LocalDate d2 = LocalDate.parse("02/06/2023"); -- data inserida diretamente nesse formato nao será aceita,
        //data precisa ser formatada antes
        LocalDate d2 = LocalDate.parse("2023-06-02");
      
        //criando formatação para 'd2'
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do dia atual: -- " + d1);
        
        //formatando 'd2'
        System.out.println("d02 = " + d2.format(fmt1));


    }
    
}
