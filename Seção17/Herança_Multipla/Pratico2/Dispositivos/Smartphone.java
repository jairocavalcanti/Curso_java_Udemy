package Seção17.Herança_Multipla.Pratico2.Dispositivos;

public class Smartphone extends Dispositivo implements Software_Smartphone {

    public Smartphone(String numerodeserie) {
        super(numerodeserie);
    }

    @Override
    public void enviarmensagem(String info) {
       System.out.println("Envio de mensagem: " + info);
    }

    @Override
    public void processar(String info) {
       System.out.println("Processamento: " + info);
    }
    
}
