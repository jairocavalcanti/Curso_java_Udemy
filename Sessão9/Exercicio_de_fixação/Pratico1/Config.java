package Sessão9.Exercicio_de_fixação.Pratico1;

public class Config {
    
   public Integer numerodaconta;
   public String nomedotitutlar;
   public Double valordodeposito;

   public static final double tarifa = 5.00;


  public Double deposito(Double deposito){
     return this.valordodeposito += deposito;
   }

   public Double retirada(Double retirada){
    return this.valordodeposito -= retirada + 5.00;
   }

   
  public String getNomedotitutlar() {
    return nomedotitutlar;
    }

  public void setNomedotitutlar(String nomedotitutlar) {
    this.nomedotitutlar = nomedotitutlar;
    }


   @Override
  public String toString() {
    return 
    "Informações do cliente:" + 
    "----------- [numeradaconta = " + numerodaconta + ", nomedotitutlar = " + nomedotitutlar + ", valortotal = "
            + valordodeposito + ", Nome atualizado:--" + getNomedotitutlar()  + "]";
}

   

}
