package Seção14.Polimorfismo.Pratico3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_usado extends Produto {
    
    private Date data_de_fabricação;


    public Produto_usado(){

    }

    public Produto_usado(Date data_de_fabricação) {
        this.data_de_fabricação = data_de_fabricação;
    }

    public Produto_usado(String nome, Double preco, Date data_de_fabricação) {
        super(nome, preco);
        this.data_de_fabricação = data_de_fabricação;
    }

    
    public Date getData_de_fabricação() {
        return data_de_fabricação;
    }

    public void setData_de_fabricação(Date data_de_fabricação) {
        this.data_de_fabricação = data_de_fabricação;
    }

    @Override
    public String etiqueta_de_preco(){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("(Aparelho usado) -- " + super.etiqueta_de_preco() + "(Data de fabricação:" + sdf.format(getData_de_fabricação()) + ")");
        return sb.toString();
    }
 

}
