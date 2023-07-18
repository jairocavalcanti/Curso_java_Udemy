package Seção8.Membros_estaticos.Pratico2;

public class Calculador {
    
    public final double PI = 3.14159;

    public double circunferencia(double duble){
        return 2.0 * PI * duble;
      }
  
      public double volume(double duble) {
        return 4.0 * PI * duble * duble * duble / 3.0;
      }
  


}
