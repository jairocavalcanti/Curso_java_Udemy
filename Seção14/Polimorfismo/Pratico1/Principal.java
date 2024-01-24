package Seção14.Polimorfismo.Pratico1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa_fisica pf = new Pessoa_fisica();
        Pessoa_juridica pj = new Pessoa_juridica();
        boolean ini = true;

        while(ini){
        System.out.println("Insira o tipo de pessoa: 1 - Fisica // 2 - Juridica");
        String escolha = scanner.next();

        if(escolha.equals("1")){

            Long CPF;
            do {
                
            System.out.println("Insira o CPF da pessoa fisica: ");
            CPF = scanner.nextLong();
            
            // a conversão para string é realizada para permitir o uso do método length(), 
            // que é específico para objetos do tipo String
            if(String.valueOf(CPF).length() < 11){
               System.out.println("-- CPF inserido não é válido!! --");
               System.out.println("(minimo 11 caracteres) \n");
            }

            // Convertendo valor long para String como feito acima
            } while (String.valueOf(CPF).length() < 11);

            System.out.println("CPF inserido corretamente! ");
            pf.setCPF(CPF);

            System.out.println("Insira quantas vezes deseja sacar: ");
            int quantidade = scanner.nextInt();
    
            int cont = 1;
            for(int i = 0; i < quantidade; i++){
                 
                System.out.println("Insira o valor do " + "[" + cont++ + "]" + " saque: ");
                int valor = scanner.nextInt();
    
                //Metodo definido na classe mãe sendo chamado por objeto da classe "pessoa_fisica"
                //Mesmo metodo foi chamado abaixo por um objeto de outro tipo, isso caracteriza polimorfismo
                pf.sacarvalor(valor);
    
            }

        }

        if(escolha.equals("2")){

            Long CNPJ;
            do {
            
            System.out.println("Insira o CNPJ da pessoa juridica: ");
            CNPJ = scanner.nextLong();
            

            if(String.valueOf(CNPJ).length() < 12){
               System.out.println("-- CNPJ inserido não é válido!! --");
               System.out.println("(mínimo 12 caracteres)");
            }
            
             
            } while(String.valueOf(CNPJ).length() < 12);
       
            System.out.println("CNPJ inserido corretamente! ");
            pj.setCNPJ(CNPJ);

            System.out.println("Insira quantas vezes deseja sacar: ");
            int quantidade_2 = scanner.nextInt();

            int cont_2 = 0;
            for(int i = 0; i< quantidade_2; i++){

                System.out.println("Insira o valor do " + "[" + cont_2++ + "]" + " saque: ");
                int valor_2 = scanner.nextInt();
    
                //Metodo definido na classe mãe sendo chamado por objeto da classe "pessoa_juridica"
                //Isso define polimorfismo, o mesmo método sendo chamado por objetos diferentes
                //Conserva a lógica do método e adiciona alguma função única da classe
                pj.sacarvalor(valor_2);

            }
       
       
        }

     }
        scanner.close();

    }
    
}
