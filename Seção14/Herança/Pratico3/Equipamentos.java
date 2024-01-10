package Seção14.Herança.Pratico3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Equipamentos {
    
    int total = 0;

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


    public void visualizar_lista(){
       DecimalFormat df = new DecimalFormat("R$: #,###.##");
       int cont  = 0;
       
       System.out.println("---------------------------------------");
       for (Equipamentos e : lista) {
        if(e instanceof Consoles){
            System.out.println("Produto ["+ cont + "] da lista adicionado com sucesso! ");
            Consoles con = (Consoles) e;
            System.out.println("Nome: " + con.getNome()   + "      CPU_console: " + con.getCPU_console());
            System.out.println("Marca: " + con.getMarca() + "  GPU_console: " + con.getGPU_console());
            System.out.println("Preço: " + df.format(con.getPreco()) + "  RAM_console: " + con.getRAM_console() );
            total += con.getPreco();
            System.out.println();
            System.out.println("--------------------------------------- \n");
            cont++;

        }
        if(e instanceof Pc){
            System.out.println("Produto ["+ cont + "] da lista adicionado com sucesso! ");
            Pc pc = (Pc) e;
            System.out.println("Nome: " + pc.getNome()   + " \t CPU_pc: " + pc.getCPU_pc());
            System.out.println("Marca: " + pc.getMarca() + " \t \t GPU_pc: " + pc.getGPU_pc());
            System.out.println("Preço: " + df.format(pc.getPreco()) + " \t RAM_pc: " + pc.getRAM_pc() );
            total += pc.getPreco();
            System.out.println();
            System.out.println("--------------------------------------- \n");
            cont++;

        }
    
      }

    }

    
    public void total(){
        DecimalFormat df = new DecimalFormat("R$: #,###.##");
        System.out.println(df.format(total));
    }

}
