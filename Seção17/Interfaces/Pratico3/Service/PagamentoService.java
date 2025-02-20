package Seção17.Interfaces.Pratico3.Service;

public interface PagamentoService {

    Double taxadePagamento(Double quantia); // Metodo abstrato destinado a calcular taxa de pagamento
    Double juros(Double quantia, Integer meses); // Metodo abstrato destinado a calcular juros simples
    
}
