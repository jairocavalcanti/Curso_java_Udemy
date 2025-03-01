package Seção17.Interfaces.Pratico4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Seção17.Interfaces.Pratico4.Service.ContratoService;
import Seção17.Interfaces.Pratico4.Service.PaypalService;
import Seção17.Interfaces.Pratico4.Entities.Contrato;
import Seção17.Interfaces.Pratico4.Entities.Parcelamento;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Numero: ");
        Integer numero = scanner.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        // variavel do tipo LocalDate armazena o resultado do método parse
        // o metodo parse recebe uma String fornecida pelo scanner como argumento
        // o metodo converte a string recebida para o tipo LocalDate, desde que possua a
        // formatação correta (yyyy-MM-dd)
        // a formatação (yyyy-MM-dd) é a padrão baseada no padrão ISO-8601
        LocalDate date = LocalDate.parse(scanner.next(), dtf);
        System.out.println("Valor do contrato: ");
        Double valorTotal = scanner.nextDouble();

        Contrato contrato = new Contrato(numero, date, valorTotal);

        System.out.println("Entre com o numero de parcelas: ");
        int n = scanner.nextInt();

        ContratoService contratoService = new ContratoService(new PaypalService());

        contratoService.processarContrato(contrato, n);

        System.out.println("Parcelas: ");
        for (Parcelamento parcelamento : contrato.getLista()) {
            System.out.println(parcelamento);
        }

        scanner.close();
    }

}
