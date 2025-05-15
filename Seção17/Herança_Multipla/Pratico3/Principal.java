package Seção17.Herança_Multipla.Pratico3;

import java.util.Scanner;

import Seção17.Herança_Multipla.Pratico3.Bancos.Central;
import Seção17.Herança_Multipla.Pratico3.Bancos.BancodoBrasil;
import Seção17.Herança_Multipla.Pratico3.Bancos.Santander;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Central central = new Central("Central dos bancos");
        BancodoBrasil bb = new BancodoBrasil("Banco do Brasil");
        Santander santander = new Santander("Santander");

        Double saldo_santander = 10000.00;
        Double saldo_banco_do_brasil = 20000.00;

        boolean init = true;

        while (init) {
            System.out.println("\n ---------------------------------------------------------------------");
            System.out.println("Insira o banco de deseja usar: (S - Santander // B - Banco do Brasil // C - central)");
            String escolha = scanner.next();

            if (escolha.toUpperCase().equals("S")) {

                System.out.println("Banco escolhido: Santander");

                System.out.printf("Insira a operação que deseja realizar (T/S): ");
                String operacao = scanner.next();

                if (operacao.toUpperCase().equals("T")) {
                    System.out.printf("Insira a quantidade que deseja transferir: ");
                    Double quantia = scanner.nextDouble();
                    System.out.println("Total transferido com taxas cobradas pelo banco: "
                            + "R$" + santander.santanderTransferencia(quantia));
                    saldo_santander -= santander.santanderTransferencia(quantia);
                    System.out.printf("Saldo restante após transferencia: " + "R$" + saldo_santander);
                } else {
                    System.out.printf("Insira a quantidade que deseja sacar: ");
                    Double quantia = scanner.nextDouble();
                    saldo_santander = santander.santanderSacar(quantia, saldo_santander);
                    System.out.printf("Saldo atual no banco santander: " + "R$" + saldo_santander);
                }

            } else if (escolha.toUpperCase().equals("B")) {

                System.out.println("Banco escolhido: Banco do Brasil");

                System.out.printf("Insira a operação que deseja realizar (T/S): ");
                String operacao = scanner.next();

                if (operacao.toUpperCase().equals("T")) {
                    System.out.printf("Insira a quantidade que deseja transferir: ");
                    Double quantia = scanner.nextDouble();
                    System.out.println("Total transferido com taxas cobradas pelo banco: "
                            + "R$" + bb.bancoDoBrasilTransferencia(quantia));
                    saldo_banco_do_brasil -= bb.bancoDoBrasilTransferencia(quantia);
                    System.out.printf("Saldo restante após transferencia: " + "R$" + saldo_banco_do_brasil);
                } else {
                    System.out.printf("Insira a quantidade que deseja sacar: ");
                    Double quantia = scanner.nextDouble();
                    saldo_banco_do_brasil = bb.bancoDoBrasilSacar(quantia, saldo_banco_do_brasil);
                    System.out.printf("Saldo atual no banco do brasil: " + "R$" + saldo_banco_do_brasil);
                }
            } else {
                System.out.println("Voce acessou a central e deve escolher um dos bancos do sistema integrado (S/B)");
                System.out.println("S - Santander");
                System.out.println("B - Banco_do_Brasil");
                System.out.printf(">>");
                String escolha2 = scanner.next();

                switch (escolha2.toUpperCase()) {
                    case "S":
                        System.out.println("Banco escolhido: Santander");

                        System.out.println("Insira a operação que deseja realizar: (T/S)");
                        String escolha_central = scanner.next();

                        if (escolha_central.toUpperCase().equals("T")) {
                            System.out.printf("Insira a quantia que deseja transferir: ");
                            Double quantia = scanner.nextDouble();
                            System.out.println("Total transferido com taxas cobradas pelo banco: "
                                    + central.santanderTransferencia(quantia));
                            saldo_santander -= central.santanderTransferencia(quantia);
                            System.out.printf("Saldo restante após transferencia: " + "R$" + saldo_santander);
                        } else {
                            System.out.printf("Insira a quantidade que deseja sacar: ");
                            Double quantia = scanner.nextDouble();
                            saldo_santander = santander.santanderSacar(quantia, saldo_santander);
                            System.out.printf("Saldo atual no banco santander: " + "R$" + saldo_santander);
                        }
                        break;

                    case "B":
                        System.out.println("Banco escolhido: Banco do brasil");

                        System.out.println("Insira a operação que deseja realizar: (T/S)");
                        String escolha_central2 = scanner.next();

                        if (escolha_central2.toUpperCase().equals("T")) {
                            System.out.printf("Insira a quantia que deseja transferir: ");
                            Double quantia = scanner.nextDouble();
                            System.out.println("Total transferido com taxas cobradas pelo banco: "
                                    + central.bancoDoBrasilTransferencia(quantia));
                            saldo_banco_do_brasil -= central.bancoDoBrasilTransferencia(quantia);
                            System.out.printf("Saldo restante após transferencia: " + "R$" + saldo_banco_do_brasil);
                        } else {
                            System.out.printf("Insira a quantidade que deseja sacar: ");
                            Double quantia = scanner.nextDouble();
                            saldo_banco_do_brasil = central.bancoDoBrasilSacar(quantia, saldo_banco_do_brasil);
                            System.out.printf("Saldo atual no banco do brasil: " + "R$" + saldo_banco_do_brasil);
                        }
                        break;
                    default:
                        System.out.println("<< INSIRA UMA OPÇÃO VÁLIDA!! >>");
                        break;
                }

            }
        }
        scanner.close();
    }
}