package Seção14.UPcas_DOWNcas.Pratico1;

public class Conta_negocios extends Conta {
    
    private Double limite_de_emprestimo;

    public Conta_negocios(){
        
        super();
    }

    
    public Conta_negocios(Integer numero, String titular, Double saldo, Double limite_de_emprestimo) {
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
        }else{
            System.out.println("Empréstimo solicitado maior que o limite permitido !!");
        }
    }
}
