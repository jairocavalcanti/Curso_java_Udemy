package Seção17.Interfaces.Pratico1.Service;

// Essa classe é uma representação dos impostos relacionados ao serviço de aluguel no BRASIL
// Ela implementa um metodo padrão de uma interface já existente para o mecanismo de taxa de serviço
public class TaxaServicoBrasil implements TaxaServico {
    
    public double taxa(double quantia){
        if(quantia <= 100){
            return quantia * 0.2;
        }else{
            return quantia * 0.15;
        }
    }

}
