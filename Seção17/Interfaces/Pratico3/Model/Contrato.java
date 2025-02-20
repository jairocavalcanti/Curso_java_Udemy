package Seção17.Interfaces.Pratico3.Model;

import java.util.Date;

// Classe criada para representar modelo de objeto Contrato
public class Contrato {
    
    private Integer numero;
    private Date data;
    private Double valorTotal;
    private Parcelas parcelas;


    public Contrato(){

    }

    public Contrato(Integer numero, Date data, Double valorTotal, Parcelas parcelas) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.parcelas = parcelas;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Parcelas getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcelas parcelas) {
        this.parcelas = parcelas;
    }
   
}
