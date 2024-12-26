package Seção17.Interfaces.Pratico2.Service;

import java.time.Duration;

public class ServicoAluguel {
    
    private Double precoporDia;

    private TaxaService taxa;

    public ServicoAluguel(Double precoporDia, TaxaService taxa) {
        this.precoporDia = precoporDia;
        this.taxa = taxa;
    }

    public void processarFatura(AluguelArma aluguelArma){
       
        long dias = Duration.between(aluguelArma.getInicio(), aluguelArma.getFim()).toDays();

        System.out.println(dias);

     

    }

    

}
