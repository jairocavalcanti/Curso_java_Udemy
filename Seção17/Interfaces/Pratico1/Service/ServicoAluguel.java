package Seção17.Interfaces.Pratico1;

import java.time.Duration;

public class ServicoAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxServico taxaservico;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxServico taxaservico) {
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
