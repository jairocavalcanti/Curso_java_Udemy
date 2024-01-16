package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico3;

public class Central {

    private boolean ligada;
    private String nome;
    private String localização;
   

    public Central(){

    }

    public Central(String nome, String localização) {
        this.nome = nome;
        this.localização = localização;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

   

    public void Ligar_usina(){
        setLigada(true);
    }


    public void desligar_usina(){
        setLigada(false);
    }


    public void Info(){
        System.out.println("---------------------------------------------");
        System.out.println("Nome da usina: " + getNome());
        System.out.println("Localização: " + getLocalização());
        System.out.println("---------------------------------------------");
    }


    public void Estado(){
        System.out.println();
        System.out.println("---------------------------------------------");
        if(ligada){
            System.out.println("Estado da Usina: Ligada // " + " Estado booleano: " + getLigada());
        }else{
            System.out.println("Estado da Usina: Desligada // " + " Estado booleano: " + getLigada());
            }
        System.out.println("---------------------------------------------");
        }

  




    }






    
    
    

