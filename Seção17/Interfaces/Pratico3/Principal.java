package Seção17.Interfaces.Pratico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Seção17.Interfaces.Pratico3.Model.Contrato;
import Seção17.Interfaces.Pratico3.Model.Parcelas;
import Seção17.Interfaces.Pratico3.Service.ContratoService;
import Seção17.Interfaces.Pratico3.Service.PaypalService;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(" -- Entre com os dados do contrato -- ");

        System.out.printf("Insira o numero do contrato: ");
        Integer numero = scanner.nextInt();

        System.out.println("Insira a data do contrato (dd/MM/yyyy): ");
        scanner.nextLine(); // Limpar o buffer
        String input = scanner.nextLine();

        Date data = dtf.parse(input);

        System.out.println("Insira o valor total do contrato: ");
        Double valorTotal = scanner.nextDouble();

        System.out.println("Insira o numero de parcelas: ");
        Integer numeroParcelas = scanner.nextInt();

        // Criação do contrato
        Contrato contrato = new Contrato(numero, data, valorTotal, new Parcelas());

        // Criação do serviço de pagamento (PaypalService, que implementa PagamentoService)
        PaypalService paypalService = new PaypalService();
        
        // Criação do ContratoService, agora passando o serviço de pagamento como parâmetro
        ContratoService contratoService = new ContratoService(paypalService);
        
        // Processando as parcelas e gerando os cálculos detalhados
        contratoService.processarContrato(contrato, numeroParcelas);

        System.out.println(contrato.getParcelas().getListaParcelas());

        scanner.close();
    }
}
