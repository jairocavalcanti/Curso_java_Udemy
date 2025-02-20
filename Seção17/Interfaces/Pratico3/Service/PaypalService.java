package Seção17.Interfaces.Pratico3.Service;

// A classe PaypalService implementa a interface PagamentoService
// isso significa que paypalservice define quais regras serão aplicadas a esses metodos
// a classe que implementa apenas deve se preocupar com a assinatura dos metodos
public class PaypalService implements PagamentoService {

    // metodos abaixo implementam os metodos abstratos definidos pela interface pagamentoService
    @Override
    public Double taxadePagamento(Double quantia) {
        return quantia * 0.02; // 2% de taxa de pagamento
    }

    @Override
    public Double juros(Double quantia, Integer meses) {
        return quantia * 0.01 * meses; // 1% de juros simples por mes
    }
    
}
