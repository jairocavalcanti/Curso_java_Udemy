package Seção17.Interfaces.Herança.Entities;

import Seção17.Interfaces.Herança.enums.Cor;

public class circulo extends formato {

    public Double raio;

    public circulo(Cor cor, Double raio) {
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
