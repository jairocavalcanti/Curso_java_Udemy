package Seção14.Herança.Pratico3;

public class Consoles extends Equipamentos {

    private String CPUs_console;
    private String GPU_console;
    private String RAM_console;



    public Consoles(String nome, String marca, Double preco) {
        super(nome, marca, preco);
    }
    
}
