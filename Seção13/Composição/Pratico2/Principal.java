package Seção13.Composição.Pratico2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) throws ParseException {
       Scanner scanner = new Scanner(System.in);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       System.out.println("Insira a localização da usina: ");
       String localização = scanner.next();
       
       System.out.println("Insira o nome da usina: ");
       String nome = scanner.next();

       System.out.println("// -- STATUS -- //");

       System.out.println("Insira o status da usina: -- LIGADA // DESLIGADA");
       String status_usina = scanner.next();

       Info_usina infogeral = new Info_usina(nome, Status_Usina.valueOf(status_usina), new Localizacao(localização));

       System.out.println();

       System.out.println("// -- INFORMAÇÕES GERAIS -- //");
       System.out.println("Nome da usina: " + infogeral.getNome_usina());
       System.out.println("Localização da usina: " + infogeral.getlLocalizacao().getLocal());

       System.out.println(" -- CALCULOS -- ");
       System.out.println("Insira a data em que esta realizando os calculos: ");
       Date data_do_calculo = sdf.parse(scanner.next());
       System.out.println("Insira o consumo por horas: ");
       Integer consumo = scanner.nextInt();
       System.out.println("Insira a quantidade de horas: ");
       Integer horas = scanner.nextInt();

       Gastoporhora gasthr = new Gastoporhora(horas, consumo, data_do_calculo);
      
       System.out.println("Gasto por hora total: " + gasthr.calculo());
       System.out.println("Data dos calculos: " + sdf.format(data_do_calculo));

    

       scanner.close();
}
    
}
