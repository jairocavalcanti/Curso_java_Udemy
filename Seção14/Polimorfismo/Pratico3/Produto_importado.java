package Seção14.Polimorfismo.Pratico3;

public class Produto_importado extends Produto {

    private double taxa_de_alfandega;


    public Produto_importado(){

    }

    public Produto_importado(double taxa_de_alfandega) {
        this.taxa_de_alfandega = taxa_de_alfandega;
    }

    public Produto_importado(String nome, Double preco, double taxa_de_alfandega) {
        super(nome, preco);
        this.taxa_de_alfandega = taxa_de_alfandega;
    }


    public double getTaxa_de_alfandega() {
        return taxa_de_alfandega;
    }

    public void setTaxa_de_alfandega(double taxa_de_alfandega) {
        this.taxa_de_alfandega = taxa_de_alfandega;
    }
    

    @Override
    public String etiqueta_de_preco(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.etiqueta_de_preco() + "(Taxa alfandegaria: R$" + taxa_de_alfandega + ")");
        return sb.toString();
    }

    

}
