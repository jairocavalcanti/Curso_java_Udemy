package Seção14.Classes_e_metodos_final.Pratico1;

import java.util.ArrayList;

public class Cadastro {

    private String nome;
    private Integer idade;
    

    private ArrayList<Cadastro> lista_cadastros = new ArrayList<Cadastro>();
    

    public Cadastro(){
         
    }

    public Cadastro(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
    public void cadastrar(Cadastro cadastro){
         lista_cadastros.add(cadastro);
    }
    
    public void mostrar_cadastros(){
        
        StringBuilder sb = new StringBuilder();
        int cont = 1;
        System.out.println();
        sb.append(" -------------------------- << LISTA >>  -------------------------- \n ");
        for (Cadastro c : lista_cadastros) {
           
            if(c instanceof Cadastro_dev){
               
            sb.append(" -- DESENVOLVEDOR de numero #[").append(cont++).append("] da lista -- ").append("\n");
            sb.append("Nome: ").append(c.getNome()).append("\n");
            sb.append("Idade: ").append(c.getIdade()).append("\n");
            sb.append("-------------------------------------------------------------------- \n ");
            
        }else{

            sb.append(" -- USUÁRIO de numero #[").append(cont++).append("] da lista -- ").append("\n");
            sb.append("Nome: ").append(c.getNome()).append("\n");
            sb.append("Idade: ").append(c.getIdade()).append("\n");
            sb.append("-------------------------------------------------------------------- \n ");
           
            }
        }
       
        //Retorno do stringbuilder para String deve acontecer fora do loop
        System.out.printf(sb.toString() + " \n ");
    
    
    }
    

}
