package Seção9.Exercicio_de_fixação.Pratico2;

import java.util.Locale;
import java.util.Scanner;

public class Principal2 {
    
    public static void main(String[] args) {
        
        //maneira de fazer com que separadores decimais sejam com ponto
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //objeto da classe 'Acount' vai permitir instanciação da mesma em diversos lugares
        Account account;
        double initialdeposit = 0;

        System.out.println("Enter account number:");
        int number = scanner.nextInt();
        System.out.println("Enter account holder:");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        char response = scanner.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit value:");
            initialdeposit = scanner.nextDouble();
            account = new Account(number, holder, initialdeposit);
        }else{
            /*INSTANCIANDO com construtor de apenas 2 parametros pois nesse caso o 'initaldeposit',
            não será necessário.*/
            //SOBRECARGA na prática
            account = new Account(number, holder, initialdeposit);
          
        }
   
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);


        System.out.println();
        System.out.println("Enter a deposit value:");
        double depositvalue = scanner.nextDouble();
        //operaçao que vai realizar o deposito na conta 
        account.deposit(depositvalue);
        System.out.println("Updated account data:");
        System.out.println(account);
   
       
        System.out.println();
        System.out.println("Enter a withdraw value:");
        double withdrawvalue = scanner.nextDouble();
        //operaçao que vai realizar o deposito na conta 
        account.withdraw(withdrawvalue);
        System.out.println("Updated account data:");
        System.out.println(account);
   
       scanner.close();
   
   
    }
    
    




}
