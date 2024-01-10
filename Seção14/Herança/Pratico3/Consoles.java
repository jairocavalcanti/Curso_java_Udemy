package Seção14.Herança.Pratico3;

import java.text.DecimalFormat;

public class Consoles extends Equipamentos {

    private String CPU_console;
    private String GPU_console;
    private String RAM_console;

    String vetor_nome[] = {"PS3" , "Xbox_X" , "Nintendo_Switch"};
    String vetor_marca[] = {"Sony","Microsoft" , "Nintendo"};
    Double vetor_preco[] = {1200.0, 2200.0, 3000.0};

    String[] vetor_CPU = {"CPU_PS" , "CPU_X" , "CPU_0"};
    String[] vetor_GPU = {"GPU_PS" , "GPU_X" , "GPU_1"};
    String[] vetor_RAM = {"RAM_PS", "RAM_X" , "RAM_2"};

    public Consoles(){

    }

    public Consoles(String cPU_console, String gPU_console, String rAM_console) {
        CPU_console = cPU_console;
        GPU_console = gPU_console;
        RAM_console = rAM_console;
    }
    
    public Consoles(String nome, String marca, Double preco, String cPU_console, String gPU_console, String rAM_console) {
        super(nome, marca, preco);
        CPU_console = cPU_console;
        GPU_console = gPU_console;
        RAM_console = rAM_console;
    }

    public Consoles(String nome, String marca, Double preco) {
        super(nome, marca, preco);
    }


    public String getCPU_console() {
        return CPU_console;
    }

    public void setCPU_console(String cPU_console) {
        CPU_console = cPU_console;
    }

    public String getGPU_console() {
        return GPU_console;
    }

    public void setGPU_console(String gPU_console) {
        GPU_console = gPU_console;
    }

    public String getRAM_console() {
        return RAM_console;
    }

    public void setRAM_console(String rAM_console) {
        RAM_console = rAM_console;
    }
    
    public void mostrar_vetores(){

       System.out.println(" -- Consoles Disponíveis -- ");
       DecimalFormat df = new DecimalFormat("R$: #,###.##");
       int cont = 0;
       System.out.println();
       System.out.printf(" \t Especificações");
       for (int i = 0; i < vetor_nome.length; i++){
           System.out.println();
           System.out.println("#" + cont + " - ");
           System.out.println("[" + vetor_nome[i]  + "]" + " --  [" + vetor_CPU[i] + "]");
           System.out.println("[" + vetor_marca[i] + "] " + " -- [" + vetor_GPU[i] + "]");
           System.out.println("[" + df.format(vetor_preco[i]) + "] " + " -- [" + vetor_RAM[i] + "]");
           System.out.println("----------------------------");
           cont++;
        }

    }
    
   


}
