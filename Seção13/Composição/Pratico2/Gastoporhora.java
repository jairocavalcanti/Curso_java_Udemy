package Seção13.Composição.Pratico2;

import java.util.Date;

public class Gastoporhora {

    private Integer horas;
    private Integer consumo;
    private Date data_do_calculo;
    
    public Gastoporhora(Integer horas, Integer consumo, Date data_do_calculo) {
        this.horas = horas;
        this.consumo = consumo;
        this.data_do_calculo = data_do_calculo;
    }


    public Gastoporhora(){

    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getConsumo() {
        return consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }

    public Date getData_do_calculo() {
        return data_do_calculo;
    }

    public void setData_do_calculo(Date data_do_calculo) {
        this.data_do_calculo = data_do_calculo;
    }

    public Integer calculo(){
       return horas * consumo;
    }

    
}
