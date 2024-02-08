package Seção14.Metodos_abstratos.Pratico1;

public class Circulo extends Formato {

    private Double raio;


    public Circulo(){
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }


    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
 
    @Override
    public double area() {
      return Math.PI * raio * raio;
    }

}
