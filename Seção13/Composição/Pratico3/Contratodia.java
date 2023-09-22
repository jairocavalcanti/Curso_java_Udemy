package Seção13.Composição.Pratico3;

import java.util.Date;

public class Contratodia {
    
    private Date date;
    private Double valordia;
    private Integer dia;


    public Contratodia(){

    }

    
    public Contratodia(Date date, Double valordia, Integer dia) {
        this.date = date;
        this.valordia = valordia;
        this.dia = dia;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Double getValordia() {
        return valordia;
    }


    public void setValordia(Double valordia) {
        this.valordia = valordia;
    }


    public Integer getDia() {
        return dia;
    }


    public void setDia(Integer dia) {
        this.dia = dia;
    }


    public double valortotal(){
        return valordia * dia;
    }
    

}
