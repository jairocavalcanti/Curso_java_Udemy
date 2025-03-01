package Seção17.Interfaces.Pratico4.Service;

import java.time.LocalDate;

import Seção17.Interfaces.Pratico4.Entities.Contrato;
import Seção17.Interfaces.Pratico4.Entities.Parcelamento;

public class ContratoService {
    
    private ServicodePagamentoOnline servicodePagamentoOnline;

    public ContratoService(ServicodePagamentoOnline servicodePagamentoOnline) {
        this.servicodePagamentoOnline = servicodePagamentoOnline;
    }

    public void processarContrato(Contrato contrato, int meses){
        
        double parcelaBasica = contrato.getValorTotal() / meses;

        for(int i = 1; i <= meses; i++){
            // a variavel LocalDate armazena a data do objeto contrato recebida pelo metodo
            // o metodo plusmonths adiciona 1 mes a data inicial do objeto contrato a cada iteração
            // isso significa que a quantidade de meses vão determinar o numero de parcelas
            LocalDate datadevencimento = contrato.getData().plusMonths(i);

            double juros = servicodePagamentoOnline.juros(parcelaBasica, i); 
            double taxa = servicodePagamentoOnline.taxadepagamento(parcelaBasica + juros);
            double total = parcelaBasica + juros + taxa;

            contrato.getLista().add(new Parcelamento(datadevencimento, total));
        }

    }

}
