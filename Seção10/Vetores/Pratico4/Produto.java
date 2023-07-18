package Seção10.Vetores.Pratico4;

public class Produto {

    private String name;
    private double preço;
   
    
    public Produto(String name, double preço) {
        this.name = name;
        this.preço = preço;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    
}
