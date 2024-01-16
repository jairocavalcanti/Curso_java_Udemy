package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico2;

public class Conta_usuario extends Conta {

    private Double taxa_usuario = 100.0;
    

    public Conta_usuario(){

    }

    
    public Conta_usuario(Long id, String login, String senha, Long pontos) {
        super(id, login, senha, pontos);    
    }


    @Override
    public void mostrarInformacoes(){
        System.out.println("-- LOGIN USUÁRIO --");
        super.mostrarInformacoes();
        System.out.printf("Pontos totais do usuário de ID - [" + id + "] após a taxa de usabilidade (100): " +  (pontos - taxa_usuario) + "\n \n");
    }

    
    
}
