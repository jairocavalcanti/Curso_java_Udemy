package Seção17.Herança_Multipla.Pratico3.Bancos;

public class Santander extends Bancos implements Software_Santander {

    public Santander(String nome) {
        super(nome);
    }

    @Override
    public Double santanderSacar(Double quantia, Double saldo) {
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
    public Double santanderTransferencia(Double quantia) {
        Double calculo = 0.0;
        if (quantia > 2000) {
            calculo = quantia + (quantia * 0.15);
        } else {
            calculo = quantia + (quantia * 0.12);
        }
        return calculo;
    }

    @Override
    public String nome(String nome) {
        return nome;
    }

}
