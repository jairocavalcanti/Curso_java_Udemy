package Seção14.Metodos_abstratos.Pratico1;

//Esta é uma classe abstrata por conter metodos do tipo abstrato 
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

    
    /*
    Para que o metodo abstrato possa funcionar corretamente,
    é necessário que a classe também seja abstrata
    */
    public abstract double area();

    
}
