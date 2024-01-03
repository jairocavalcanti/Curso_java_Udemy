package Seção14.UPcas_DOWNcas.Pratico2;
import java.text.DecimalFormat;


public class Usina_hidreletrica extends Usina {
    
    private Double volts;

    public Usina_hidreletrica(){
        
    }

    public Usina_hidreletrica(String país_usina, String nome_da_usina, String tipo, Double volts) {
        super(país_usina, nome_da_usina, tipo);
        this.volts = volts;
    }


    public Double getVolts() {
        return volts;
    }

    public void setVolts(Double volts) {
        this.volts = volts;
    }


    public void contabilizarvolts(Double taxa_por_hora){
        DecimalFormat df = new DecimalFormat("#,###.##");

    
        System.out.println("-- Lucro diário da hidreletrica --");
        double calc = taxa_por_hora * volts / 24;
        String valor_formatado = df.format(calc);
        System.out.println("R$ : " + valor_formatado );
    }
    

}
