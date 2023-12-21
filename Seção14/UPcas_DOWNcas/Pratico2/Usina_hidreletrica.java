package Seção14.UPcas_DOWNcas.Pratico2;

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
        System.out.println("-- Taxa por hora da hidreletrica --");
        System.out.println("R$ - " + taxa_por_hora * volts);
    }
    

}
