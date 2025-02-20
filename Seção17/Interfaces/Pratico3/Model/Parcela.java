package Seção17.Interfaces.Pratico3.Model;

import java.util.Date;

// Classe criada como modelo para objeto Parcela
// Os objetos dessa classe serão inseridos na lista de parcelas
public class Parcela {
    
    // Atributos do objeto parcela (data de vencimento da parcela e quantia)
    private Date datadeVencimento;
    private Double quantia;
   

    public Parcela(){

    }

    public Parcela(Date datadeVencimento, Double quantia) {
        this.datadeVencimento = datadeVencimento;
        this.quantia = quantia;
    }

    public Date getdatadeVencimento() {
        return datadeVencimento;
    }

    public void setdatadeVencimento(Date datadeVencimento) {
        this.datadeVencimento = datadeVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

}
