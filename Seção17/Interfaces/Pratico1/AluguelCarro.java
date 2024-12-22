package Seção17.Interfaces.Pratico1;

import java.time.LocalDateTime;

public class AluguelCarro {

    // Atributos para marcar data de aluguel de veículo e data de devolução do veículo
    private LocalDateTime comeco;
    private LocalDateTime fim;

    // O aluguel de um carro está diretamente ligado a um veiculo e a uma fatura de acordo com as regras do problema proposto
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {

    }

    public AluguelCarro(LocalDateTime comeco, LocalDateTime fim, Veiculo veiculo) {
        this.comeco = comeco;
        this.fim = fim;
        this.veiculo = veiculo;
    }

    public LocalDateTime getComeco() {
        return comeco;
    }

    public void setComeco(LocalDateTime comeco) {
        this.comeco = comeco;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

}
