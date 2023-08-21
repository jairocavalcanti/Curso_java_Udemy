package Seção13.Enumerações.Pratico2;

public class Principal {
    public static void main(String[] args) {
    System.out.println();

        Console con = new Console("PlayStation 3", "MW3", Status_Videogame.RODANDO_JOGO);
    
        System.out.println(con + "\n");
    
        Status_Videogame SV2 = Status_Videogame.RODANDO_JOGO;
        Status_Videogame SV = Status_Videogame.valueOf("RODANDO_JOGO");
        
        System.out.println(SV);
        System.out.println(SV2);
         
    }
}
