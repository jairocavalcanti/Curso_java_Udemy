package Seção17.Herança_Multipla.Pratico1;

import Seção17.Herança_Multipla.Pratico1.Dispositivos.DispositivoCombinado;
import Seção17.Herança_Multipla.Pratico1.Dispositivos.ImpressoraConcreta;
import Seção17.Herança_Multipla.Pratico1.Dispositivos.ScannerConcreto;

public class Principal {
    
    public static void main(String[] args) {

        ImpressoraConcreta imp = new ImpressoraConcreta("1080");
        imp.processarDocumento("carta");
        imp.impressao("carta");

        System.out.println();

        ScannerConcreto s = new ScannerConcreto("2003");
        s.processarDocumento("Email");
        System.out.println("Resultado do scanner: " + s.scan());

        System.out.println();

        DispositivoCombinado disp = new DispositivoCombinado("2081");

        disp.processarDocumento("Dissertação");
        disp.impressao("Dissertação");
        System.out.println("Resultado do scanner: " + disp.scan());
    }
    
}
