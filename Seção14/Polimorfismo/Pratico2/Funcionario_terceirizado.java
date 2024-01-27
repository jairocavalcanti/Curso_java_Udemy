package Seção14.Polimorfismo.Pratico2;

public class Funcionario_terceirizado extends Funcionario {

    private Double adicional;


    public Funcionario_terceirizado(){
        super();
    }

    public Funcionario_terceirizado(String nome, Integer horas, Double valor_por_hora, Double adicional) {
        super(nome, horas, valor_por_hora);
        this.adicional = adicional;
    }


    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    

    @Override
    public double pagamento(){
      return super.pagamento() + adicional * 1.1;
    }


}
