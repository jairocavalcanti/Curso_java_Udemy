package Seção13.Composição.Pratico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    
     public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        LocalDate d01 = LocalDate.now(); 

        System.out.println("Entre com a regiao: ");
        String regiao = scanner.next();
    
        System.out.println("-- Entre com os dados da Usina -- ");
        System.out.print("Nome: ");
        String nome_usina = scanner.next();
        System.out.print("Tipo: ");
        String tipo_usina = scanner.next();
        System.out.print("Gasto base: ");
        Double gasto_base = scanner.nextDouble();

        Contratos con = new Contratos(nome_usina, gasto_base, new Regiao(regiao), Tipousina.valueOf(tipo_usina));

        System.out.print("Quantos calculos de gasto diario serao feitos -- :");
        int n = scanner.nextInt();

        for(int i =1; i<=n ; i++){
        System.out.println("//----------//----------//----------//----------//");
        System.out.println("Entre com o calculo #" + i + " : ");
        
        System.out.print("Dia (DD): ");
        Date data = sdf.parse(scanner.next());
        System.out.print("Valor por dia: ");
        Double valordia = scanner.nextDouble();
        System.out.print("Quantidade de dias: ");
        Integer dias = scanner.nextInt();
        Contratodia conts = new Contratodia(data, valordia, dias);
        con.addcontrato(conts);      
    }
       System.out.println();
       System.out.print("Entre com o dia para calcular o gasto total (DD): ");
       Integer dia = scanner.nextInt();

       System.out.println();
       System.out.println("Nome da usina: " + con.getNome());
       System.out.println("Regiao da usina: " + con.getReg().getNome_regiao());
       System.out.println("Tipo da usina: " + tipo_usina);

       System.out.println();

       System.out.println("Gasto do dia:  -- " + "[" + dia  + "]" + " Referente ao mes: " + "[" + d01.getMonthValue() + "]" + "(Mes atual)" +  " : " + con.calculum(dia));

       scanner.close();

    }

}
