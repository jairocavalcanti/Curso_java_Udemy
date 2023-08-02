package Seção11.Data_e_Hora.Convertendo_data_hora_global_para_local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal2 {
    public static void main(String[] args) {
    
        //FORMATO PADRÃO = ANO/MES/DIA  
        LocalDate date = LocalDate.now();
                    
        //FORMATAÇÃO PARA FORMATO UTILIZADO EM REGIÃO NACIONAL
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        String parsedDate = date.format(formatter);

        System.out.println(date);
        System.out.println(parsedDate);
        
        //LocalDate ld = LocalDate.parse("2023-10-06");
        //LocalDateTime lcdt = LocalDateTime.now();

        //System.out.println(ld);
        //System.out.println(lcdt);
  
    }
    
}
