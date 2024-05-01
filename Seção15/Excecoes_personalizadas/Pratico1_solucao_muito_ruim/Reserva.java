package Seção15.Excecoes_personalizadas.Pratico1_solucao_muito_ruim;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroDoQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    // calculando a diferença das datas em milisegundos
    public long duracao() {
        // .getTime() retorna a quantidade de milisegundos da respectiva data
        // com a operação abaixo pegamos a diferença entre as duas datas em milisegundos
        long diff = checkOut.getTime() - checkIn.getTime();
        // convertendo o valor gerado em milisegundos para dias
        // 'TimeUnit' é um tipo enumerado complexo que possui algumas operações
        TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        return diff;
    }

    public void atualizarDatas(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto "
                + numeroDoQuarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " noites";
    }

}
