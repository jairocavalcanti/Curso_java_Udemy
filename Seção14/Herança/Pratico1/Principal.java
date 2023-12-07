package Seção14.Herança.Pratico1;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta_negocios conta = new Conta_negocios();
        Random rand = new Random();
       
        boolean L = false;
        Double saldo1 = 10000.00;
        Double saldo2 = 20000.00;


        while (L != true) {
            
        System.out.println("Insira o tipo de conta: 1 - ContaPF // 2 - ContaPJ ");
        int alternativa = scanner.nextInt();


        switch (alternativa) {
            case 1:
            int numero_conta = rand.nextInt(1,1000);
            conta.setNumero(numero_conta);
            System.out.println("Numero da contaPF: " + "#" + conta.getNumero());
            System.out.println("Insira o nome do titular: ");
            String titular = scanner.next();
            conta.setTitular(titular); 
            conta.saldo = saldo1;
            System.out.println("Proprietario da conta: [" + titular + "]");
            System.out.println("Saldo disponivel na conta de numero #" + conta.getNumero() +  ":" + conta.getSaldo() + "R$");
            
            System.out.println("Insira qual operação deseja realizar: 1 - Saque // 2 - Depósito");
            int escolha = scanner.nextInt();

            if(escolha == 1 ){
                System.out.println("Insira a quantia a ser sacada: ");
                Double quantia = scanner.nextDouble();
                conta.saque(quantia);
                System.out.println("-- Saque realizado com sucesso ! --");
                System.out.println("Saldo disponivel na conta apos o saque: " + conta.getSaldo());
            }else{
                System.out.println("Insira a quantida a ser depositada: ");
                Double quantia2 = scanner.nextDouble();
                conta.depositar(quantia2);
                System.out.println("-- Deposito realizdo com sucesso ! -- ");
                System.out.println("Saldo disponivel na conta apos o deposito: " + conta.getSaldo());

            }

                break;
        
            case 2:
            int numero_conta2 = rand.nextInt(1 ,1000);    
            conta.setNumero(numero_conta2);
            System.out.println("Numero da contaPJ: " + "#" + conta.getNumero());
            System.out.println("Insira o nome do titular: ");
            String titular2 = scanner.next();
            conta.setTitular(titular2);
            conta.saldo = saldo2;
            System.out.println("Proprietario da conta: + [" + titular2 + "]");
            System.out.println("saldo disponivel na conta de numero #" + conta.getNumero() + ":" + conta.getSaldo() + "R$");

            System.out.println("Insira qual operação deseja realizar: 1 - Saque // 2 - Depósito // 3 - Empréstimo");
            int escolha2 = scanner.nextInt();

            if(escolha2 == 1){
               System.out.println("Insira a quantia a ser sacada: ");
               Double quantia2 = scanner.nextDouble();
               conta.saque(quantia2);
               System.out.println("-- Saque realizado com sucesso ! -- ");
               System.out.println("Saldo disponivel na conta apos o saque: " + conta.getSaldo());
            }
            if(escolha2 == 2){
                System.out.println("Insira a quantia a ser depositada: ");
                Double quantia2 = scanner.nextDouble();
                conta.depositar(quantia2);
                System.out.println("-- Deposito realizado com sucesso ! --");
                System.out.println("Saldo disponivel na conta apos deposito: " + conta.getSaldo());
            }
            if(escolha2 == 3){
                System.out.println("Saldo disponivel na conta de numero #" + conta.getNumero() + ":" + conta.getSaldo());
                System.out.println("Insira a quantidade do valor a ser solicitado para emprestimo: ");
                Double emprestimo = scanner.nextDouble();
                conta.setLimite_de_emprestimo(saldo2);
                conta.emprestimo(emprestimo);
                System.out.println("Saldo na conta após emprestimo: " + conta.getSaldo());        
            }
            
                break;    

            case 0:
            System.out.println("Programa encerrado...");
            L = true;

                break;


            default:
            System.out.println("-- Insira uma alternativa valida !!");
                break;
            } 
        }
   
     scanner.close();
    }
}
