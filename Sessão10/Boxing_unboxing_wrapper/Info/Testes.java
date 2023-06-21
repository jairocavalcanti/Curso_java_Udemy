package Sessão10.Boxing_unboxing_wrapper.Info;

public class Testes {
    public static void main(String[] args) {
      
        System.out.println("---------------------------------------------------------------------------------");
        
        // BOXING: é o processo de conversão de um objeto tipo valor para um objeto tipo referencia compatível 
       
        // UNBOXING: é o processo de conversão de um objeto tipo referencia para um objeto tipo valor compatível
       
        
        int x = 20;
          
        System.out.printf("Quebra: %n");
        //objeto tipo valor convertido para objeto tipo referencia -- boxing
        Object obj = x;



        System.out.println(obj);

        //codigo nao funcionara pois os tipos sao imcompativeis
        /*int y = obj;*/
    
        //forma correta de escrever o codigo
        // é necessario o casting (int)
        //valor 20 trazido de volta para um tipo valor 'int' compativel -- unboxing
        int y = (int) obj;
    
        System.out.println(y);
   

        //Wrapper classes são classes que possuem o objetivo de tratar os tipos primitivos como classes
        //Uma variavel do tipo 'int' pode receber uma variavel do tipo 'Integer' sem a necessidade de castings


        //wrapper class do tipo primitivo int
        //aceita valores nulos
        Integer numero = null;

        System.out.println(numero);

        //tipo primitivo da wrapper class Integer
        //não aceita valores nulos
        int numero2 = 0;
   
        System.out.println(numero2);
    }

    
}
