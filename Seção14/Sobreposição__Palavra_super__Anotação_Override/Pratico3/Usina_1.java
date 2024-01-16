package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico3;

public class Usina_1 extends Central {

    public Usina_1(){

    }

    public Usina_1(String nome, String localização) {
        super(nome, localização);
    }


    @Override
    public void Ligar_usina(){
        
        System.out.println(" << [Usina_1 ligada] >>");
        super.Ligar_usina();
    }

    @Override
    public void desligar_usina(){
        System.out.println("<< [Usina_1 desligada] >>");
        super.desligar_usina();
    }

    @Override
    public void Info(){
        System.out.println();
        System.out.println("-- USINA_1 --");
        super.Info();
    }
  

}
