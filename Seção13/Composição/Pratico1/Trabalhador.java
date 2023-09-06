package Seção13.Composição.Pratico1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    
    //Atributos basicos da classe
    private String nome;
    private Double salariobase;

    //Associações da classe 
    private Departamento departamento;
    private Niveldotrabalhador nivel;

    //Numa composição do tipo: tem muitos,(lista), nao incluimos a lista no construtor
    //Simplesmente iniciamos a lista vazia
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador(){

    }

    //Atributo "contratos" do tipo lista NAO entra no construtor
    public Trabalhador(String nome, Niveldotrabalhador nivel, Double salariobase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salariobase = salariobase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Niveldotrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(Niveldotrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(Double salariobase) {
        this.salariobase = salariobase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    //Apenas 'getcontratos' permanecerá
    //'setcontratos' será apagado pois ele receberia outra lista e associaria ela a lista ja existente
    //Isso nao pode acontecer, a lista nao pode ser trocada
    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    //Metodo para adicionar contrato na lista "contratos"
    public void addcontrato(ContratoPorHora contrato){
          contratos.add(contrato);
    }
    
    //Metodo para remover contrato na lista "contratos"
    public void removercontrato(ContratoPorHora contrato){
          contratos.remove(contrato);
    }
    
    
    public double renda(int ano, int mes){
        double soma = salariobase;
        Calendar cal = Calendar.getInstance();
        for(ContratoPorHora c: contratos){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
        if(ano == c_ano && mes == c_mes){
            soma += c.valortotal();
            }
        }
        return soma;
    }


}
