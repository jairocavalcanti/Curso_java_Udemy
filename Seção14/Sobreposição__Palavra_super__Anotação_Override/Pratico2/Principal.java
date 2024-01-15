package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico2;

import java.util.Random;

public class Principal { 
    public static void main(String[] args) {

        Random rand = new Random();
        Long pontos = rand.nextLong(1000);
        Long id = rand.nextLong(1000);

        Conta cont = new Conta(id, "Jairo", "123456789", pontos);
        cont.mostrarInformacoes();
        

        Long pontos_2 = rand.nextLong(1000);
        Long id_2 = rand.nextLong(2000);

        Conta cont_2 = new Conta_usuario(id_2, "Juliana", "232455643", pontos_2);
        cont_2.mostrarInformacoes();

        
        Long pontos_3 = rand.nextLong(1000);
        Long id_3 = rand.nextLong(2000);

        Conta cont_3 = new Conta_dev(id_3, "Wilson", "191912939", pontos_3);
        cont_3.mostrarInformacoes();


    }
    
}
