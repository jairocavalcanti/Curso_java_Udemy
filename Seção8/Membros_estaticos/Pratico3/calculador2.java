package Sessão8.Membros_estaticos.Pratico3;

public class calculador2 {
    
    //metodos e atributo do tipo "static" idendependem de objetos para o seu fincionamento
    //basta chamar a classe

    public static final double PI = 3.14159;

    public static double circunferencia(double duble){
        return 2.0 * PI * duble;
      }
  
      public static double volume(double duble) {
        return 4.0 * PI * duble * duble * duble / 3.0;
      }
  





}
