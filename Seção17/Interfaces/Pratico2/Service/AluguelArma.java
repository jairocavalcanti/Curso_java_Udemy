package Seção17.Interfaces.Pratico2.Service;

import java.time.LocalDate;

import Seção17.Interfaces.Pratico2.Model.Arma;
import Seção17.Interfaces.Pratico2.Model.FaturaArma;

public class AluguelArma {
    
    private LocalDate inicio;
    private LocalDate fim;

    private Arma arma;
    private FaturaArma faturaArma;

    public AluguelArma(){

    }

    public AluguelArma(LocalDate inicio, LocalDate fim, Arma arma) {
        this.inicio = inicio;
        this.fim = fim;
        this.arma = arma;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public FaturaArma getFaturaArma() {
        return faturaArma;
    }

    public void setFaturaArma(FaturaArma faturaArma) {
        this.faturaArma = faturaArma;
    }

    
    


}
