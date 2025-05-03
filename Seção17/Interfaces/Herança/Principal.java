package Seção17.Interfaces.Herança;

import Seção17.Interfaces.Herança.Entities.circulo;
import Seção17.Interfaces.Herança.Entities.formato;
import Seção17.Interfaces.Herança.Entities.retangulo;
import Seção17.Interfaces.Herança.enums.Cor;

public class Principal {

    public static void main(String[] args) {
        
        formato s1 = new circulo(Cor.BLACK, 2.0);
        formato s2 = new retangulo(Cor.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: " + s1.getCor());
        // '%.3f' é usado para impressão de valores Double com 3 casas decimais
        System.out.println("Area do circulo: " + String.format("%.3f", s1.area()));
        System.out.println("Cor do retangulo: " + s2.getCor());
        System.out.println("Area do retangulo: " + String.format("%.3f", s2.area()));

    }
    
}
