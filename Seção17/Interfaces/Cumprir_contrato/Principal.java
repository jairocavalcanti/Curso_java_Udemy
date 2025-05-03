package Seção17.Interfaces.Cumprir_contrato;

import Seção17.Interfaces.Cumprir_contrato.Entities.circulo;
import Seção17.Interfaces.Cumprir_contrato.Entities.formatoabstrato;
import Seção17.Interfaces.Cumprir_contrato.Entities.retangulo;
import Seção17.Interfaces.Cumprir_contrato.enums.cor;

public class Principal {

    public static void main(String[] args) {

         // Não há downcasting aqui porque você está acessando
        // apenas métodos definidos em formatoabstrato (como getCor() e area()).
       
        // so estamos usando polimorfismo
        formatoabstrato s1 = new circulo(cor.BLACK, 2.0);
        formatoabstrato s2 = new retangulo(cor.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: " + s1.getCor());
        // '%.3f' é usado para impressão de valores Double com 3 casas decimais
        System.out.println("Area do circulo: " + String.format("%.3f", s1.area()));
        System.out.println("Cor do retangulo: " + s2.getCor());
        System.out.println("Area do retangulo: " + String.format("%.3f", s2.area()));

    }

}
