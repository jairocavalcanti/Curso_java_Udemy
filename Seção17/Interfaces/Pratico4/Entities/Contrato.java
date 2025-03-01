package Seção17.Interfaces.Pratico4.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe criada para representar um contrato
public class Contrato {
    
    private Integer numero;
    private LocalDate data;
    private Double valorTotal;

    // Lista de objetos do tipo parcelamento 
    // Um contrato possui varias parcelas, por isso precisamos desta lista
    // A lista serve com o um representante da palavra "varias" em um diagrama de classes
    private List<Parcelamento> lista = new ArrayList<>();

    public Contrato(){

    }

    public Contrato(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Apenas o metodo get da lista permanece, pois não faz sentido utilizar o set
    // Nao temos interesse em mudar a lista, apenas em inserir e remover elementos da lista
    public List<Parcelamento> getLista() {
        return lista;
    }    

}
