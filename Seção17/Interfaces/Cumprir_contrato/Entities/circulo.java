package Seção17.Interfaces.Cumprir_contrato.Entities;

import Seção17.Interfaces.Cumprir_contrato.enums.cor;

public class circulo extends formatoabstrato {
    
    public Double raio;

    public circulo(cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }
    
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

}
