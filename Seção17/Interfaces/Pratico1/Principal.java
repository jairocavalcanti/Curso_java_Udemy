package Seção17.Interfaces.Pratico1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Seção17.Interfaces.Pratico1.Model.Veiculo;
import Seção17.Interfaces.Pratico1.Service.AluguelCarro;
import Seção17.Interfaces.Pratico1.Service.ServicoAluguel;
import Seção17.Interfaces.Pratico1.Service.TaxaServicoBrasil;

/*
 * Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas
 * Porem, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em
 * um valor diário. Alem do valor da locação, é acrescido no preço o valor do imposto conforme
 * regras no país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores
 * acima de 100.00. Fazer um programa que leia dados da locação(modelo do carro, instante inicial e 
 * final da locação), bem como o valor por hora e o valor diário de locação. O programa deve então
 * gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento)
 * e informar os dados na tela.
 */

public class Principal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Definindo formato da data a ser inserida no objeto aluguel carro 
        // Formato definido como formato padrao de data e hora 
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        // Atributo de modelo do carro
        System.out.print("Modelo do carro: ");
        String modeloCarro = scanner.nextLine();
        // Atributo de data de retirada tipo LocalDateTime
        System.out.println("Retirada (dd/MM/yyyy hh:mm)");
        LocalDateTime retirada = LocalDateTime.parse(scanner.nextLine(), fmt);
        // Atributo de data de retorno tipo LocalDateTime
        System.out.println("Retorno (dd/MM/yyyy hh:mm)");
        LocalDateTime retorno = LocalDateTime.parse(scanner.nextLine(), fmt);

        // Instanciação de objeto "AluguelCarro" que está associado a outro objeto de tipo "Veiculo"
        AluguelCarro ac = new AluguelCarro(retirada, retorno, new Veiculo(modeloCarro));
        
        System.out.println("Entre com o preço por hora: ");
        double precoporHora = scanner.nextDouble();
        System.out.println("Entre com o preço por dia:  ");
        double precoporDia = scanner.nextDouble();        

        /*  Instanciação de objeto da classe servicoAluguel, responsavel pelo "processamento"
            do objeto fatura presente na classe AluguelCarro */
        ServicoAluguel servicoAluguel = new ServicoAluguel(precoporHora, precoporDia, new TaxaServicoBrasil());

        // Objeto servicoAluguel "processando" objeto fatura através de um metodo 
        servicoAluguel.processarFatura(ac);

        
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + ac.getFatura().getPagamentoBase());
        System.out.println("Imposto: " + ac.getFatura().getTaxa());
        System.out.println("Pagamento total: " + ac.getFatura().pagamentoTotal());


        scanner.close();
    }

}
