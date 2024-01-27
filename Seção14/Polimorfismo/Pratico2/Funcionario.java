package Seção14.Polimorfismo.Pratico2;

public class Funcionario {
    
    private String  nome;
    private Integer horas;
    private Double  valor_por_hora;


    public Funcionario(){

    }

    public Funcionario(String nome, Integer horas, Double valor_por_hora) {
        this.nome = nome;
        this.horas = horas;
        this.valor_por_hora = valor_por_hora;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValor_por_hora() {
        return valor_por_hora;
    }

    public void setValor_por_hora(Double valor_por_hora) {
        this.valor_por_hora = valor_por_hora;
    }

    
    public double pagamento(){
        return horas * valor_por_hora;
    }
    

}
