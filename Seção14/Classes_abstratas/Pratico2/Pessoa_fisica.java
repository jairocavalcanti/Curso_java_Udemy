package Seção14.Classes_abstratas.Pratico2;

public class Pessoa_fisica extends Contribuinte {

    private Double gastos_com_saude;

     
    public Pessoa_fisica(){

    }

    public Pessoa_fisica(Double gastos_com_saude) {
        this.gastos_com_saude = gastos_com_saude;
    }

    public Pessoa_fisica(String nome, Double renda_anual, Double gastos_com_saude) {
        super(nome, renda_anual);
        this.gastos_com_saude = gastos_com_saude;
    }


    public Double getGastos_com_saude() {
        return gastos_com_saude;
    }

    public void setGastos_com_saude(Double gastos_com_saude) {
        this.gastos_com_saude = gastos_com_saude;
    }

    
    @Override
    public Double taxa() {
        
        if(renda_anual <= 20000){
            System.out.println( "Nome: " + getNome());
            renda_anual -= (renda_anual * 0.15);
          //  System.out.println(renda_anual);
        }
        
        else if(renda_anual > 20000){
            System.out.println("Nome: " + getNome());
            renda_anual -= (renda_anual * 0.25);
           // System.out.println(renda_anual);
        }
        
        else if(gastos_com_saude != 0){
            renda_anual -= gastos_com_saude / 2;
           // System.out.println(renda_anual);
        }
        
        return renda_anual;
    }

    
    
}
