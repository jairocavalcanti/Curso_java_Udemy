package Seção17.Interfaces.Pratico2.Service;

public class TaxaServicoLocal implements TaxaService{
    
    public double taxa(double quantia){
        if(quantia <= 200){
            return quantia * 0.5;
        }else{
            return quantia * 0.2;
        }
    }

}
