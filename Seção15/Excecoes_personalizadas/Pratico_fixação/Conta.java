package Seção15.Excecoes_personalizadas.Pratico_fixação;

import java.text.DecimalFormat;

public class Conta {

    private Integer numero_da_conta;
    private String titular;
    private Double saldo;
    private Double limite_de_saque;

    DecimalFormat df = new DecimalFormat("00.00R$");

    public Conta() {

    }

    public Conta(Integer numero_da_conta, String titular, Double saldo, Double limite_de_saque) {
        this.numero_da_conta = numero_da_conta;
        this.titular = titular;
        this.saldo = saldo;
        this.limite_de_saque = limite_de_saque;
    }

    public Integer getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(Integer numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite_de_saque() {
        return limite_de_saque;
    }

    public void setLimite_de_saque(Double limite_de_saque) {
        this.limite_de_saque = limite_de_saque;
    }

    public void depositar(Double quantia) {
        this.saldo += quantia;
    }

    public void sacar(Double quantia) {
        if (this.saldo == 0) {
            throw new DomainException("Impossivel sacar! (Saldo não disponivel em conta)");
        } else if (quantia > this.limite_de_saque) {
            throw new DomainException("Impossivel sacar! (Saque excede o limite permitido)");
        } else if (quantia > this.saldo) {
            throw new DomainException("Impossivel sacar! (Saque excede o saldo em conta)");
        } else {
            this.saldo -= quantia;
            System.out.println("Saque de " + df.format(quantia) + " realizado!");
        }

    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------");
        return " Numero_da_Conta: "
                + numero_da_conta
                + "\n Titular: "
                + titular
                + "\n Saldo: "
                + df.format(saldo)
                + "\n Limite_de_Saque: "
                + df.format(limite_de_saque);
    }

}
