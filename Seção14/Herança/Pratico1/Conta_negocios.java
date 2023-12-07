package Seção14.Herança.Pratico1;

public class Conta_negocios extends Conta {
    
    private Double limite_de_emprestimo;

    public Conta_negocios(){
        //super abaixo retornara qualquer logica presente no construtor vazio da superclasse "Conta" 
        super();
    }

    //Construtor "reciclando" atributos da classe mãe "Conta" e apenas adicionando "limite_de_emprestimo",
    //atributo esse que pertence a propria classe "Conta_negocios"
    public Conta_negocios(Integer numero, String titular, Double saldo, Double limite_de_emprestimo) {
        //super "chamando" construtor da superclasse ou classe mãe "Conta"
        super(numero, titular, saldo);
        this.limite_de_emprestimo = limite_de_emprestimo;
    }

    public Double getLimite_de_emprestimo() {
        return limite_de_emprestimo;
    }

    public void setLimite_de_emprestimo(Double limite_de_emprestimo) {
        this.limite_de_emprestimo = limite_de_emprestimo;
    }

    public void emprestimo(Double valor){
        if(valor <= limite_de_emprestimo){
            saldo += valor - 10;
        }
    }
}
