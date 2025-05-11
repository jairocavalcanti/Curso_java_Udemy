package Seção17.Herança_Multipla.Pratico1.Dispositivos;

// A classe ScannerConcreto herda de Dispositivo e implementa a interface Scanner
public class ScannerConcreto extends Dispositivo implements Scanner{

    public ScannerConcreto(String numerodeSerie) {
        super(numerodeSerie);
    }

    // sobreescrevendo operação "processarDocumento" da classe Dispositivo
    @Override
    public void processarDocumento(String doc) {
        System.out.println("Processamento de scanner: " + doc);
    }
 
    // sobreescrevendo operação "scan" da interface Scanner
    @Override
    public String scan(){
        return "Conteudo scaneado";
    }
    
}
