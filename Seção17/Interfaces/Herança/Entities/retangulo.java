package Seção17.Interfaces.Herança.Entities;

import Seção17.Interfaces.Herança.enums.Cor;

public class retangulo extends formato {

    private Double largura;
    private Double altura;

    public retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

}
