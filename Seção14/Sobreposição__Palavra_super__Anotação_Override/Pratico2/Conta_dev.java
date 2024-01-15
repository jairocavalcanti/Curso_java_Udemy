package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico2;

public class Conta_dev extends Conta {

    private Double taxa_dev = 200.0;


    public Conta_dev(){

    }

    public Conta_dev(Long id, String login, String senha, Long pontos) {
        super(id, login, senha, pontos);
    }


    @Override
    public void mostrarInformacoes(){
        System.out.println("-- LOGIN DESENVOLVEDOR --");
        super.mostrarInformacoes();
        System.out.println("Pontos totais do desenvolvedor de ID - [" + id + "] após a taxa de usabilidade (200): " +  (pontos - taxa_dev));
    }
    


}
