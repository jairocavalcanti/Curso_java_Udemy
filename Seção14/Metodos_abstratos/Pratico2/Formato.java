package Seção14.Metodos_abstratos.Pratico2;

public abstract class Formato {
    
    private Cor cor;


    public Formato(){

    }

    public Formato(Cor cor) {
        this.cor = cor;
    }


    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }


    public abstract Double area();

}
