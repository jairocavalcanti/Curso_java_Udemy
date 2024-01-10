package Seção14.Herança.Pratico3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Equipamentos {
    
    private String nome;
    private String marca;
    private Double preco;
    
    ArrayList<Equipamentos> lista = new ArrayList<>();


    public Equipamentos(){

    }
    
    public Equipamentos(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

     
    public void adicionar_a_lista(Equipamentos equip){
        lista.add(equip);
    }

    public void total(Double valor){
        
    }
    
    public void visualizar_lista(){
       DecimalFormat df = new DecimalFormat("R$: #,###.##");
       int cont = 0;
        System.out.println("---------------------------------------");
       for (Equipamentos e : lista) {
        if(e instanceof Consoles){
            System.out.println("Produto ["+ cont + "] da lista adicionado com sucesso! ");
            Consoles con = (Consoles) e;
            System.out.println("Nome: " + con.getNome()   + "      CPU_console: " + con.getCPU_console());
            System.out.println("Marca: " + con.getMarca() + "  GPU_console: " + con.getGPU_console());
            System.out.println("Preço: " + df.format(con.getPreco()) + "  RAM_console: " + con.getRAM_console() );
            System.out.println();
            System.out.println("--------------------------------------- \n");
            cont++;

         }else{
            
            System.out.println("Nome: " + e.nome);
            System.out.println("Marca: " + e.marca);
            System.out.println("Preco: " + e.preco);   
            System.out.println("---------------------");
         
        }
    
       }

    }

    
    
}
