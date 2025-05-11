package Seção17.Herança_Multipla.Pratico2;

import Seção17.Herança_Multipla.Pratico2.Dispositivos.DispositivoCombinado;
import Seção17.Herança_Multipla.Pratico2.Dispositivos.Roteador;
import Seção17.Herança_Multipla.Pratico2.Dispositivos.Smartphone;

public class Principal {
    public static void main(String[] args) {

        Smartphone smart = new Smartphone("4556");
        smart.processar("'Olá mundo!'");
        smart.enviarmensagem("Olá mundo! ");

        System.out.println("---------------------------------------");

        Roteador rot = new Roteador("6667");
        rot.processar("Conectando...");
        rot.rotear("Iniciando roteador");

        System.out.println("---------------------------------------");

        DispositivoCombinado dp = new DispositivoCombinado("7778");
        dp.processar("Iniciado ");
        dp.enviarmensagem("Olá mundo!");
        dp.rotear("Inciando roteador");

    }

}
