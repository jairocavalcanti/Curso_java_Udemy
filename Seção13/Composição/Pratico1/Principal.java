package Seção13.Composição.Pratico1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    System.out.println("Entre com o nome do departamento: ");
    String nomedodepartamento = scanner.nextLine();

    System.out.println("-- Entre com os dados do trabalhador -- ");
    System.out.println("Nome: ");
    String nometrabalhador = scanner.nextLine();
    System.out.println("Nivel: ");
    String niveltrabalhador = scanner.nextLine();
    System.out.println("Salario base: ");
    double salariobase = scanner.nextDouble();

    Trabalhador trabalhador = new Trabalhador(nometrabalhador, Niveldotrabalhador.valueOf(niveltrabalhador), salariobase, new Departamento(nomedodepartamento));
    
    System.out.println("Quantos contratos terá esse trabalhador ?");
    int n = scanner.nextInt();

    for(int i =1; i<=n ; i++){
        System.out.println("Entre com o contrato #" + i + " dados: ");
        System.out.print("Data (DD/MM/YYYY): ");
        Date contratoDate = sdf.parse(scanner.next());
        System.out.print("Valor por hora: ");
        double valorporhora = scanner.nextDouble();
        System.out.print("Duração (horas): ");
        int horas = scanner.nextInt();
        ContratoPorHora contrato = new ContratoPorHora(contratoDate, valorporhora, horas);
        trabalhador.addcontrato(contrato);
    }
        System.out.println();
        System.out.print("Entre com o mes e ano para calcular salario (MM/YYYY): ");
        String mes_e_ano = scanner.next();
        //'recortando' a String mes_e_ano e gera um substring de 2 digitos
        // convertendo String para inteiro atraves do 'parseInt'
        int mes = Integer.parseInt(mes_e_ano.substring(0, 2));
        int ano = Integer.parseInt(mes_e_ano.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda do mes: " + mes_e_ano + " --- " + String.format("%.2f" ,trabalhador.renda(ano, mes)));

    scanner.close();
}
    
}
