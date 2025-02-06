package Seção17.Interfaces.Pratico2.Service;

import java.time.temporal.ChronoUnit;

import Seção17.Interfaces.Pratico2.Model.FaturaArma;

public class AluguelService {

    private Double precoporDia;

    private TaxaService taxa;

    public AluguelService() {

    }

    public AluguelService(Double precoporDia, TaxaService taxa) {
        this.precoporDia = precoporDia;
        this.taxa = taxa;
    }

    public void processarFatura(AluguelArma aluguelArma) {

        long dias = ChronoUnit.DAYS.between(aluguelArma.getInicio(), aluguelArma.getFim());
        
        /* long dias = Duration.between(aluguelArma.getInicio(), aluguelArma.getFim()).toDays(); */
        
        double pagamentobase;
        pagamentobase = precoporDia * dias;
      
        double taxacao = taxa.taxa(pagamentobase);

        aluguelArma.setFaturaArma(new FaturaArma(pagamentobase , taxacao));
    }

}
