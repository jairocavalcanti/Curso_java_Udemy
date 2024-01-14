package Seção14.UPcas_DOWNcas.Pratico1;

public class Conta_poupanca extends Conta {
    
    private Double taxa_de_juros;

    public Conta_poupanca(){
        super();
    }

    public Conta_poupanca(Integer numero, String titular, Double saldo, Double taxa_de_juros) {
        super(numero, titular, saldo);
        this.taxa_de_juros = taxa_de_juros;
    }

    public Double getTaxadejuros() {
        return taxa_de_juros;
    }

    public void setTaxadejuros(Double taxadejuros) {
        this.taxa_de_juros = taxadejuros;
    }

    public void atualizarsaldo(){
        saldo += saldo * taxa_de_juros;
    }
    
}
