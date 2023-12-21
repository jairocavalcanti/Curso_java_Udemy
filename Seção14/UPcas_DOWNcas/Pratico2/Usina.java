package Seção14.UPcas_DOWNcas.Pratico2;

public class Usina {
    
    private String país_usina;
    private String nome_da_usina;
    private String tipo;


    public Usina(){

    }

    public Usina(String país_usina, String nome_da_usina, String tipo) {
        this.país_usina = país_usina;
        this.nome_da_usina = nome_da_usina;
        this.tipo = tipo;
    }


    public String getPaís_usina() {
        return país_usina;
    }

    public void setPaís_usina(String país_usina) {
        this.país_usina = país_usina;
    }

    public String getNome_da_usina() {
        return nome_da_usina;
    }

    public void setNome_da_usina(String nome_da_usina) {
        this.nome_da_usina = nome_da_usina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarnome(){
        System.out.println(nome_da_usina);
    } 

    public void mostrarpais(){
        System.out.println(país_usina);
    }

    public void mostrartipo(){
        System.out.println(tipo);
    }
    
}
