package Seção17.Herança_Multipla.Pratico3.Bancos;

public class BancodoBrasil extends Bancos implements Software_BancodoBrasil {

    public BancodoBrasil(String nome) {
        super(nome);
    }

    @Override
    public Double bancoDoBrasilSacar(Double quantia, Double saldo) {
        if (quantia > saldo) {
            System.out.println("Saldo insuficiente na conta!");
            System.out.println("<< Operação não realizada >>");
            return saldo;
        }
        System.out.println("Operação realizada!");
        saldo = saldo - quantia;
        return saldo;
    }

    @Override
    public Double bancoDoBrasilTransferencia(Double quantia) {
        Double calculo = 0.0;
        if (quantia > 1000) {
            calculo = quantia + (quantia * 0.20);
        } else {
            calculo = quantia + (quantia * 0.17);
        }
        return calculo;
    }

    @Override
    public String nome(String nome) {
        return nome;
    }

}
