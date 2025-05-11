package Seção17.Herança_Multipla.Pratico2.Dispositivos;

// classe abstrata
public abstract class Dispositivo {
    
    private String numerodeserie;

    public Dispositivo(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    // operação abstrata
    public abstract void processar(String info);

}
