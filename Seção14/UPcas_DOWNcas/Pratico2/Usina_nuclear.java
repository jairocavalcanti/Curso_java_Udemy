package Seção14.UPcas_DOWNcas.Pratico2;
import java.text.DecimalFormat;


public class Usina_nuclear extends Usina {

    private Double kilowats;

    
    public Usina_nuclear(){

    }
    
    
    public Usina_nuclear(String país_usina, String nome_da_usina, String tipo, Double kilowats) {
        super(país_usina, nome_da_usina, tipo);
        this.kilowats = kilowats;
    }


    public Double getKilowats() {
        return kilowats;
    }


    public void setKilowats(Double energia_nuclear) {
        this.kilowats = energia_nuclear;
    }

    public void contabilizarkilowats(Double taxa_por_hora){
        DecimalFormat df = new DecimalFormat("#,###.##");
       
        System.out.println(" -- Lucro diário da usina nuclear --");
        Double calc = taxa_por_hora * kilowats / 24;
        String valor_formatado = df.format(calc);
        System.out.println("R$ : " + valor_formatado);
    }

    /*
     *  public void contabilizarvolts(Double taxa_por_hora){
        DecimalFormat df = new DecimalFormat("#,###.##");

    
        System.out.println("-- Gasto mensal da hidreletrica --");
        double calc = taxa_por_hora * volts / 30;
        String valor_formatado = df.format(calc);
        System.out.println("R$ : " + valor_formatado );
    }
    
     */
      


}
