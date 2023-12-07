package Seção14.Herança.Pratico1;

public class Conta {
    
    private Integer numero;
    private String titular;
    /* 
    Protected abaixo permite que nos façamos operações com o atributo 'saldo' na subclasse "conta_negocios"
    O uso é interessante pelo fato de deixar o atributo maleavel sem torna-lo público
    */
    protected Double saldo;

    public Conta(){

    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
    
    public void saque(double valor){
        saldo -= valor;

    }
    
    public void depositar(double valor){
        saldo += valor;
    }

}
