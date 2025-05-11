package Seção17.Herança_Multipla.Pratico2.Dispositivos;

public class DispositivoCombinado extends Dispositivo implements Software_Smartphone, Software_Roteador  {

    public DispositivoCombinado(String numerodeserie) {
        super(numerodeserie);
    }

    @Override
    public void rotear(String info) {
       System.out.println("Roteamento pela classe combinada: " + info);
    }

    @Override
    public void enviarmensagem(String info) {
        System.out.println("Envio de mensagem pela classe combinada: " + info);
    }

    @Override
    public void processar(String info) {
        System.out.println("Processamento combinado (roteamento e envio de mensagem): " + info);
    }
    
}
