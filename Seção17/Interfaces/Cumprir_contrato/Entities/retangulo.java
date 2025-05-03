package Seção17.Interfaces.Cumprir_contrato.Entities;

import Seção17.Interfaces.Cumprir_contrato.enums.cor;

public class retangulo extends formatoabstrato {
    
    private Double largura;
    private Double altura;

    public retangulo(cor cor, Double largura, Double altura) {
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
