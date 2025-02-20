package Seção17.Interfaces.Pratico3.Service;

import java.util.Calendar;

import Seção17.Interfaces.Pratico3.Model.Contrato;
import Seção17.Interfaces.Pratico3.Model.Parcelas;

public class ContratoService {
    
    // objeto da interface pagamento service
    // essa interface pode ser implementada por regras de serviços de pagamentos diversas
    private PagamentoService pagamentoService;

    // injeção de dependencia via construtor acontecendo abaixo
    public ContratoService(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    // metodo criado para processamento do contrato
    // o metodo recebe um objeto do tipo 'Contrato' e uma variavel Integer contendo a quantidade de meses
    public void processarContrato(Contrato contrato, Integer meses){
        // variavel do tipo double criada para armazenar valor total de cada parcela
        // dividimos o valor total do contrato pela quantidade de meses do mesmo
        Double valorParcelas = contrato.getValorTotal() / meses;

        // Iniciando novo objeto do tipo 'Parcelas'
        Parcelas parcelas = new Parcelas();
        // Iniciando novo Objeto do tipo Calendar, o objeto inicialmente possui a data atual 
        Calendar calendar = Calendar.getInstance();
        // Aqui definimos a data inicial do objeto calendar
        // A data inicial definida sera a data inicial definida pelo objeto contrato
        calendar.setTime(contrato.getData());

        for(int i = 1; i <= meses; i++){
            calendar.add(Calendar.MONTH, 1);

            // Calculando juros e taxa usando os métodos da interface
            Double juros = pagamentoService.juros(valorParcelas, i); // Juros para o mês
            Double taxa = pagamentoService.taxadePagamento(valorParcelas); // Taxa de pagamento
            
            // Calculando o valor final da parcela com juros e taxa
            Double valorComJurosETaxa = valorParcelas + juros + taxa;

            // Adiciona a parcela
            parcelas.adicionarParcela(calendar.getTime(), valorComJurosETaxa);

        }
        // finalmente adicionando as parcelas na lista de parcelas
        contrato.setParcelas(parcelas);
    }

}
