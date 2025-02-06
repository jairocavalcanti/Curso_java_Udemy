package Seção17.Interfaces.Pratico2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Seção17.Interfaces.Pratico2.Model.Arma;
import Seção17.Interfaces.Pratico2.Service.AluguelArma;
import Seção17.Interfaces.Pratico2.Service.AluguelService;
import Seção17.Interfaces.Pratico2.Service.TaxaServicoLocal;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira o modelo da arma: ");
        String modelo = scanner.nextLine();

        System.out.println("Retirada (dd/MM/yyyy)");
        LocalDate retirada = LocalDate.parse(scanner.nextLine(), dtf);

        System.out.println("Devolucao (dd/MM/yyyy)");
        LocalDate devolucao = LocalDate.parse(scanner.nextLine(), dtf);

        AluguelArma aluguel = new AluguelArma(retirada, devolucao, new Arma(modelo));

        System.out.println("Entre com o preço por dia: ");
        double precopordia = scanner.nextDouble();

        AluguelService as = new AluguelService(precopordia, new TaxaServicoLocal());

        as.processarFatura(aluguel);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + aluguel.getFaturaArma().getPagamentobase());
        System.out.println("Imposto: " + aluguel.getFaturaArma().getTaxa());
        System.out.println("Pagamento total: " + aluguel.getFaturaArma().pagamentobase());
        scanner.close();
    }

}
