package Seção14.Metodos_abstratos.Pratico2;

public class Quadrado extends Formato {

    private Double base;
    private Double altura;
   
   
    public Quadrado() {
   
    }

    public Quadrado(Cor cor, Double base, Double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }


    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    @Override
    public Double area() {
        System.out.println("\nCor do quadrado: " + getCor());
        System.out.printf("Area do quadrado: ");
        return base * altura;
        

    }
    
}
