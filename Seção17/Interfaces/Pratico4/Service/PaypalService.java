package Seção17.Interfaces.Pratico4.Service;

public class PaypalService implements ServicodePagamentoOnline {



    @Override
    public double taxadepagamento(Double quantia) {
        return quantia * 0.02;
    }

    @Override
    public double juros(Double quantia, Integer meses) {
       return quantia * 0.01 * meses;
    }

   
    
}
