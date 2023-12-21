package Seção14.UPcas_DOWNcas.Upcasting_Downcasting.Pratico1;

public class Contas_salvas extends Conta {
    
    private Double taxadejuros;

    public Contas_salvas(){
        super();
    }

    public Contas_salvas(Integer numero, String titular, Double saldo, Double taxadejuros) {
        super(numero, titular, saldo);
        this.taxadejuros = taxadejuros;
    }

    public Double getTaxadejuros() {
        return taxadejuros;
    }

    public void setTaxadejuros(Double taxadejuros) {
        this.taxadejuros = taxadejuros;
    }

    public void atualizarsaldo(){
        saldo += saldo * taxadejuros;
    }
    
}
