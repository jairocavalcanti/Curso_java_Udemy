package Seção17.Interfaces.Pratico4.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate datadeVencimento;
    private Double quantia;

    public Parcelamento(){
    
    }

    public Parcelamento(LocalDate datadeVencimento, Double quantia) {
        this.datadeVencimento = datadeVencimento;
        this.quantia = quantia;
    }

    public LocalDate getData() {
        return datadeVencimento;
    }

    public void setData(LocalDate data) {
        this.datadeVencimento = data;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return  datadeVencimento.format(dtf) + " - " + String.format("%.2f", quantia);
    }
    
    

}
