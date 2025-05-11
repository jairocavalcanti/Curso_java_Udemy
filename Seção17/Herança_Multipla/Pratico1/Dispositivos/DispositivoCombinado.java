package Seção17.Herança_Multipla.Pratico1.Dispositivos;

// a classe DispositivoCombinado herda de Dispositivo e implementa as interfaces Scanner e Impressora
public class DispositivoCombinado extends Dispositivo implements Scanner, Impressora {

    public DispositivoCombinado(String numerodeSerie) {
        super(numerodeSerie);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void impressao(String doc) {
       System.out.println("Impressao combinada: " + doc);
    }

    @Override
    public String scan() {
      return "Resultado scanner combinado";
    }

    @Override
    public void processarDocumento(String doc) {
      System.out.println("Processamento combinado: " + doc);  
    }
    
}
