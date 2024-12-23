package Seção17.Interfaces.Pratico1.Service;

import java.time.Duration;

import Seção17.Interfaces.Pratico1.Model.Fatura;

public class ServicoAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaServico taxaservico;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxaServico taxaservico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaservico = taxaservico;
    }

    // instanciando uma fatura no objeto de aluguel carro
    public void processarFatura(AluguelCarro aluguelCarro) {
        
        double minutos = Duration.between(aluguelCarro.getComeco(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos / 60;

        double pagamentobasico;
        if(horas <= 12.0){
            pagamentobasico = precoPorHora * Math.ceil(horas);
        }else{
            pagamentobasico = precoPorDia * Math.ceil(horas/24.0);
        }

        double tax = taxaservico.taxa(pagamentobasico);

        aluguelCarro.setFatura(new Fatura(pagamentobasico, tax));
    }

}
