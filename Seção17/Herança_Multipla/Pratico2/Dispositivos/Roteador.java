package Seção17.Herança_Multipla.Pratico2.Dispositivos;

public class Roteador extends Dispositivo implements Software_Roteador {

    public Roteador(String numerodeserie) {
        super(numerodeserie);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void rotear(String info) {
         System.out.println("Roteamento: " + info);
    }

    @Override
    public void processar(String info) {
        System.out.println("Processamento: " + info);
    }
    
}
