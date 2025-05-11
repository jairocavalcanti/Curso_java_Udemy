package Seção17.Herança_Multipla.Pratico1.Dispositivos;

public class ImpressoraConcreta extends Dispositivo implements Impressora {

    public ImpressoraConcreta(String numerodeSerie) {
        super(numerodeSerie);
    }

    // sobreescrevendo operação "processarDocumento" da classe Dispositivo
    @Override
    public void processarDocumento(String doc) {
        System.out.println("Processamento de impressora: " + doc);
    }
    
    // sobreescrevendo operação "Impressao" da interface Impressora
    @Override
    public void impressao(String doc){
        System.out.println("Impressão: " + doc);
    }

}
