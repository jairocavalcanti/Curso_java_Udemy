package Seção17.Interfaces.Pratico2.Model;

public class FaturaArma {
    
    private Double pagamentobase;
    private Double taxa;

    public FaturaArma(){

    }

    public FaturaArma(Double pagamentobase, Double taxa) {
        this.pagamentobase = pagamentobase;
        this.taxa = taxa;
    }

    public Double getPagamentobase() {
        return pagamentobase;
    }

    public void setPagamentobase(Double pagamentobase) {
        this.pagamentobase = pagamentobase;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double pagamentobase(){
        return getPagamentobase() + getTaxa();
    }
    
    
}
