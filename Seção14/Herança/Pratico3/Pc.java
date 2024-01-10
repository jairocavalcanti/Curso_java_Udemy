package Seção14.Herança.Pratico3;

import java.text.DecimalFormat;

public class Pc extends Equipamentos {

    private String CPU_pc;
    private String GPU_pc;
    private String RAM_pc;

    String vetor_nome[] = {"ASUS ROG" , "Alienware_a5" , "MSI GS"};
    String vetor_marca[] = {"asus","Alien" , "MSI"};
    Double vetor_preco[] = {4700.0, 5200.0, 3100.0};

    String[] vetor_CPU = {"CPU_rog" , "CPU_A" , "CPU_gs"};
    String[] vetor_GPU = {"GPU_rog" , "GPU_A" , "GPU_gs"};
    String[] vetor_RAM = {"RAM_rog", "RAM_A" , "RAM_gs"};


    public Pc(){

    }
    
    public Pc(String cPU_pc, String gPU_pc, String rAM_pc) {
        CPU_pc = cPU_pc;
        GPU_pc = gPU_pc;
        RAM_pc = rAM_pc;
    }

    public Pc(String nome, String marca, Double preco, String cPU_pc, String gPU_pc, String rAM_pc) {
        super(nome, marca, preco);
        CPU_pc = cPU_pc;
        GPU_pc = gPU_pc;
        RAM_pc = rAM_pc;
    }

    public Pc(String nome, String marca, Double preco) {
        super(nome, marca, preco);
    }



    public String getCPU_pc() {
        return CPU_pc;
    }

    public void setCPU_pc(String cPU_pc) {
        CPU_pc = cPU_pc;
    }

    public String getGPU_pc() {
        return GPU_pc;
    }

    public void setGPU_pc(String gPU_pc) {
        GPU_pc = gPU_pc;
    }

    public String getRAM_pc() {
        return RAM_pc;
    }

    public void setRAM_pc(String rAM_pc) {
        RAM_pc = rAM_pc;
    }
    

    public void mostrar_vetores(){

       System.out.println(" -- PC's Disponíveis -- ");
       DecimalFormat df = new DecimalFormat("R$: #,###.##");
       int cont = 0;
       System.out.println();
       System.out.printf(" \t Especificações");
       for (int i = 0; i < vetor_nome.length; i++){
           System.out.println();
           System.out.println("Numeração do produto - #" + cont + "");
           System.out.println("[" + vetor_nome[i]  + "]" + " \t -- [" + vetor_CPU[i] + "]");
           System.out.println("[" + vetor_marca[i] + "] " + " \t -- [" + vetor_GPU[i] + "]");
           System.out.println("[" + df.format(vetor_preco[i]) + "] " + " \t -- [" + vetor_RAM[i] + "]");
           System.out.println("----------------------------");
           cont++;
        }

    }

}
