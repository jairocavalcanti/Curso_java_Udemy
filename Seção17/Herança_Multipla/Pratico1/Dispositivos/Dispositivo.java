package Seção17.Herança_Multipla.Pratico1.Dispositivos;

public abstract class Dispositivo {
    
    public String numerodeSerie;

    public Dispositivo(String numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }

    public String getNumerodeSerie() {
        return numerodeSerie;
    }

    public void setNumerodeSerie(String numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }
    
    // operação abstrata
    public abstract void processarDocumento(String doc);

}
