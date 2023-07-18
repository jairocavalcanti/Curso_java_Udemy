package Sessão9.Sobrecarga.Pratico2;

public class Numeros {
    Integer numero1;
    Integer numero2;
   
    public Numeros(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Numeros(Integer numero1) {
        this.numero1 = numero1;
    }

    @Override
    public String toString() {
        return "Numeros [numero1=" + numero1 + ", numero2=" + numero2 + "]";
    }

    
    

}
