package Seção10.Laco_foreach.Pratico;

public class Principal {
    
    public static void main(String[] args) {

        String vect [] = new String[]{"Maria, Bob , Alex"};
        
      //laco for 
       for(int i = 0; i< vect.length;i++){
         System.out.println(vect[i]);
       }

      System.out.println("-------------------------------------------------- ");

       //laco for each
       //laço for percorrerá todos os elementos do vetor apelidando-os de 'obj'
       for (String obj : vect){
           //surtirá o mesmo efeito de imprimir o 'vect' na posiçao 'i' como mostrado acima
           System.out.println(obj);
       }
    }

}
