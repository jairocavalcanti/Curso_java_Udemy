package Seção17.Interfaces.Pratico1.Service;

// Essa classe é uma representação dos impostos relacionados ao serviço de aluguel no BRASIL

public class TaxaServicoBrasil {
    
    public double taxa(double quantia){
        if(quantia <= 100){
            return quantia * 0.2;
        }else{
            return quantia * 0.15;
        }
    }

}
