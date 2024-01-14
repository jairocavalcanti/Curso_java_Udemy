package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico1;

public class Conta_poupanca extends Conta {

    private Double taxa_de_juros;

    
    public Conta_poupanca(){
        super();
    }

    public Conta_poupanca(Integer numero, String titular, Double saldo , Double taxa_de_juros) {
        super(numero, titular, saldo);
        this.taxa_de_juros = taxa_de_juros;
    }


    public Double getTaxa_de_juros() {
        return taxa_de_juros;
    }

    public void setTaxa_de_juros(Double taxa_de_juros) {
        this.taxa_de_juros = taxa_de_juros;
    }

    
    public void atualizar_saldo(){
        saldo += saldo * taxa_de_juros;
    }

    //@override abaixo indicando ao compilador uma sobreposição de método
    //Sobreposição utilizando palavra @override
    @Override
    public void saque(Double quantidade){
        //Reutilizando código da superclasse já pronto
        //Sobreposição utilizando a palavra Super
        super.saque(quantidade);
        saldo -= 2.0;
    }

}
