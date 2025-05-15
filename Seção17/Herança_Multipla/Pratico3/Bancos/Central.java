package Seção17.Herança_Multipla.Pratico3.Bancos;


public class Central extends Bancos implements Software_BancodoBrasil, Software_Santander {

    private BancodoBrasil bb;
    private Santander santander;

    public Central(String nome) {
        super(nome);
        this.bb = new BancodoBrasil("Banco do Brasil");
        this.santander = new Santander("Santander");
    }

    @Override
    public Double santanderSacar(Double quantia, Double saldo) {
        return santander.santanderSacar(quantia, saldo);
    }

    @Override
    public Double santanderTransferencia(Double quantia) {
        return santander.santanderTransferencia(quantia);
    }

    @Override
    public String nome(String nome) {
        return nome;
    }

    @Override
    public Double bancoDoBrasilSacar(Double quantia, Double saldo) {
        return bb.bancoDoBrasilSacar(quantia, saldo);
    }

    @Override
    public Double bancoDoBrasilTransferencia(Double quantia) {
        return bb.bancoDoBrasilTransferencia(quantia);
    }

    
}
