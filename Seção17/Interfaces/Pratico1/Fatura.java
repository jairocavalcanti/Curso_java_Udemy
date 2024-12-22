package Seção17.Interfaces.Pratico1;

public class Fatura {
    
    private Double pagamentoBase;
    private Double taxa;

    public Fatura(){

    }

    public Fatura(Double pagamentoBase, Double taxa) {
        this.pagamentoBase = pagamentoBase;
        this.taxa = taxa;
    }

    public Double getPagamentoBase() {
        return pagamentoBase;
    }

    public void setPagamentoBase(Double pagamentoBase) {
        this.pagamentoBase = pagamentoBase;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    // get's utilizados no metodo abaixo para caso de manuntenções futuras no código
    // se precisarmos adicionar alguma regra ao pagamento, podemos inserir essa regra nos metodos get
    public Double pagamentoTotal(){
        return getPagamentoBase() + getTaxa();
    }
    

}
