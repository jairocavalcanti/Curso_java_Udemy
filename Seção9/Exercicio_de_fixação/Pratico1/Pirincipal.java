package Seção9.Exercicio_de_fixação.Pratico1;

import java.util.Scanner;

public class Pirincipal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Config con = new Config();
    
    System.out.println("Entre com o numero da conta:");
    con.numerodaconta = scanner.nextInt();   
    
    System.out.println("Insira o nome do titular:");
    con.nomedotitutlar = scanner.next();
   
    System.out.println("Existe uma quantia incial a ser depositada?");
    String escolha = scanner.next();
    
    if (escolha.equals("y")) {
    System.out.println("Insira a quantia inicial:");
    con.valordodeposito = scanner.nextDouble();

    }else{
    con.valordodeposito = 0.00;
    }

    System.out.println("Account data:");
    System.out.println(con);

    System.out.println("Insira uma quantia para deposito:");
    Double soma = scanner.nextDouble();
    con.deposito(soma);

    System.out.println("Dados atualizados:---" + con);

    System.out.println("Insira uma quantia para saque: (taxa de 5,00 cobrada pela instituição)");
    Double saque = scanner.nextDouble();
    con.retirada(saque);

    System.out.println("Deseja alterar o nome na proxima saida de dados?");
    escolha = scanner.next();
   
    if(escolha.equals("y")){
       System.out.println("Insira o novo nome:");
       String novonome = scanner.next();
        con.setNomedotitutlar(novonome);
    }
   

    System.out.println("Dados atualizados:");
    System.out.println(con);

    scanner.close();
    }
    


}
