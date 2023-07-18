package Sessão8.Pratico2;

import java.util.Scanner;


public class Pratico2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("insira o nome do funcionario:");
        func.nome = scanner.next();

        System.out.println("Insira o salario do funcionario:");
        func.salariobruto = scanner.nextDouble();

        System.out.println("Insira a taxa a ser debitada do salario do funcionario:");
        func.taxa = scanner.nextDouble();

        System.out.println(func);
   
        System.out.println("Insira taxa de aumento salarial em porcentagem:");
        Double porcentagem = scanner.nextDouble();

        System.out.println("Salario com: " + porcentagem + " % " + "de aumento:" + func.aumento(porcentagem));
   
        scanner.close();
    }



}
