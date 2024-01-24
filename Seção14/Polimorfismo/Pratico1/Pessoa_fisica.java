package Seção14.Polimorfismo.Pratico1;

public class Pessoa_fisica extends Metodos {

     private Long CPF;


     public Pessoa_fisica(){

     }

     public Pessoa_fisica(Long cPF) {
          CPF = cPF;
     }

 
     public Long getCPF() {
          return CPF;
     }

     public void setCPF(Long cPF) {
          CPF = cPF;
     }


     @Override
     public final void sacarvalor(int valor){
          super.sacarvalor(valor);
          System.out.println("CPF da pessoa fisica (PF): " + getCPF() + "\n");
     }

     

     
     
}
