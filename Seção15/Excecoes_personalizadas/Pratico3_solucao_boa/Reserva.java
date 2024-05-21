package Seção15.Excecoes_personalizadas.Pratico3_solucao_boa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroDoQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: data de saída deve ser após a data de entrada !");
        }
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

    public long duracao() {

        long diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.MILLISECONDS.toDays(diff);
    }

    public void atualizarDatas(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            // exceção utilizada quando os argumentos passados ao método são inválidos
            throw new DomainException(
                    "Erro na atualização da reserva: datas de reserva a serem atualizadas deve ser para dias futuros !");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: data de saída deve ser após a data de entrada !");
        }
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
