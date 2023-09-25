package Seção13.DemoStringBuilder.Pratico1;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal { 
    public static void main(String[] args) throws ParseException {
        
        //Mascara de data padronizada com Horas, minutos e segundos
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comentario c1 = new Comentario("Tenha uma boa viagem !");
        Comentario c2 = new Comentario("WOW, isso é dahora! ");
        Post p1 = new Post(sdf.parse("17/09/2030 18:24:32"), 
        "Viajando para Nova York ! ", 
      "Estou indo para uma metropole!", 
         105);

         p1.addComentario(c1);
         p1.addComentario(c2);

         System.out.println(p1.toString());

    }
     
}
