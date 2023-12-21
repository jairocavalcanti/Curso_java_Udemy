package Seção14.UPcas_DOWNcas.Pratico2;

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
        System.out.println(" -- Taxa por hora da usina nuclear --");
        System.out.println("R$ - " + taxa_por_hora * kilowats);
    }

      


}
