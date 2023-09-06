package Seção13.Composição.Pratico1;

import java.util.Date;

public class ContratoPorHora {
    
    private Date date;
    private Double valorporhora;
    private Integer hora;

    public ContratoPorHora(){

    }

    public ContratoPorHora(Date date, Double valorporhora, Integer hora) {
        this.date = date;
        this.valorporhora = valorporhora;
        this.hora = hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorporhora() {
        return valorporhora;
    }

    public void setValorporhora(Double valorporhora) {
        this.valorporhora = valorporhora;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
   
    public double valortotal(){
        return valorporhora * hora;
    }
}

