package Seção13.Composição.Pratico3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Contratos {
    
    
    private String nome;
    private Double gastobase;

    private Regiao reg;
    private Tipousina tipo;

    private List<Contratodia> contratos = new ArrayList<>();

    public Contratos(){

    }

    public Contratos(String nome, Double gastobase, Regiao reg, Tipousina tipo) {
        this.nome = nome;
        this.gastobase = gastobase;
        this.reg = reg;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastobase() {
        return gastobase;
    }

    public void setGastobase(Double gastobase) {
        this.gastobase = gastobase;
    }

    public Regiao getReg() {
        return reg;
    }

    public void setReg(Regiao reg) {
        this.reg = reg;
    }

    public Tipousina getTipo() {
        return tipo;
    }

    public void setTipo(Tipousina tipo) {
        this.tipo = tipo;
    }

    public List<Contratodia> getContratos() {
        return contratos;
    }


    public void addcontrato(Contratodia contrato){
        contratos.add(contrato);
    }

    
    public double calculum(int dia){
        double soma = gastobase;
        Calendar cal = Calendar.getInstance();
        for(Contratodia con: contratos){
            cal.setTime(con.getDate());
            int dia_do_mes = cal.get(Calendar.DAY_OF_MONTH);
            if(dia == dia_do_mes){
            soma += con.valortotal(); 
            }
        }
        return soma;
    }


}
