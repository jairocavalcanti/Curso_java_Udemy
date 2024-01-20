package Seção14.Classes_e_metodos_final.Pratico1;

//Classe "final" evista que a mesma seja herdada
public final class Cadastro_dev extends Cadastro {

    
    public Cadastro_dev(){
        
    }

    public Cadastro_dev(String nome, Integer idade) {
        super(nome, idade);
    }
    
    @Override
    public final void cadastrar(Cadastro cadastro){
        super.cadastrar(cadastro);
    }
    
    /*
    metodo "final" faz com que o método não seja sobreposto, 
    evitando sobreposições múltiplas, eliminando a chance de inconsistencias 
    */
    @Override
    public final void mostrar_cadastros(){
        System.out.println("-------------------- CADASTROS DEV --------------------");
        super.mostrar_cadastros();
    }

}
