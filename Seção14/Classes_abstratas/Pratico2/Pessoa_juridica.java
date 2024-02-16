package Seção14.Classes_abstratas.Pratico2;

public class Pessoa_juridica extends Contribuinte {

    private Integer numeros_de_funcionarios;


    public Pessoa_juridica(){

    }

    public Pessoa_juridica(String nome, Double renda_anual) {
        super(nome, renda_anual);
    }

    public Pessoa_juridica(String nome, Double renda_anual, Integer numeros_de_funcionarios) {
        super(nome, renda_anual);
        this.numeros_de_funcionarios = numeros_de_funcionarios;
    }


    
    public Integer getNumeros_de_funcionarios() {
        return numeros_de_funcionarios;
    }

    public void setNumeros_de_funcionarios(Integer numeros_de_funcionarios) {
        this.numeros_de_funcionarios = numeros_de_funcionarios;
    }

    
    @Override
    public Double taxa() {
        if(renda_anual < 20000){
            System.out.println( " -- Renda abaixo de 20.000 -- ");
            renda_anual -= renda_anual * 0.25;

        }
        return 0.0;
    }

    
}
