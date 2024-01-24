package Seção14.Polimorfismo.Pratico1;

public class Pessoa_juridica extends Metodos {
    
    private Long CNPJ;

    
    public Pessoa_juridica(){

    }

    public Pessoa_juridica(Long cNPJ) {
        CNPJ = cNPJ;
    }


    public Long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Long cNPJ) {
        CNPJ = cNPJ;
    }

    
    @Override
    public final void sacarvalor(int valor){
         super.sacarvalor(valor);
         System.out.println("CNPJ da pessoa juridica (PJ): " + getCNPJ() + "\n" );
    }
}
