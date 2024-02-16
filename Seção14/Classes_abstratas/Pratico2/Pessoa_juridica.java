package Seção14.Classes_abstratas.Pratico2;

import java.text.DecimalFormat;

public class Pessoa_juridica extends Contribuinte {

    private Integer numero_de_funcionarios;


    public Pessoa_juridica(){

    }

    public Pessoa_juridica(String nome, Double renda_anual) {
        super(nome, renda_anual);
    }

    public Pessoa_juridica(String nome, Double renda_anual, Integer numeros_de_funcionarios) {
        super(nome, renda_anual);
        this.numero_de_funcionarios = numeros_de_funcionarios;
    }


    
    public Integer getNumeros_de_funcionarios() {
        return numero_de_funcionarios;
    }

    public void setNumeros_de_funcionarios(Integer numeros_de_funcionarios) {
        this.numero_de_funcionarios = numeros_de_funcionarios;
    }

    
    @Override
    public Double taxa() {
       

        if(numero_de_funcionarios < 10){
            renda_anual *= 0.16;
        }else{
            renda_anual *= 0.14;
        }

        DecimalFormat df = new DecimalFormat("#####.##");

        String df2 = df.format(renda_anual);
        Double df3 = Double.parseDouble(df2);

        System.out.printf(getNome() + " : " + " R$ ");
        return df3;
    }

    
}
