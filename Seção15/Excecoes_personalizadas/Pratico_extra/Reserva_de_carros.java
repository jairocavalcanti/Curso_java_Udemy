package Seção15.Excecoes_personalizadas.Pratico_extra;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.InputMismatchException;

public class Reserva_de_carros {

    private String modelo_do_carro;
    private Date retirada;
    private Date devolucao;

    private String vetor_carros[] = new String[0];
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva_de_carros() {

    }

    public Reserva_de_carros(String modelo_do_carro, Date retirada, Date devolucao) {
        this.modelo_do_carro = modelo_do_carro;
        this.retirada = retirada;
        this.devolucao = devolucao;
    }

    public String getModelo_do_carro() {
        return modelo_do_carro;
    }

    public void setModelo_do_carro(String modelo_do_carro) {
        this.modelo_do_carro = modelo_do_carro;
    }

    public Date getRetirada() {
        return retirada;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public String atualizarDatas(Date devolucao, Date retirada) {
        Date date = new Date();

        if (devolucao.before(date) || retirada.before(date)) {
            return "Erro: Os agendamentos devem ser futuros em relação ao dia atual !";
        }
        if (!devolucao.after(retirada)) {
            return "Erro: As devoluções devem acontecer após o dia de saída !";
        } else {
            this.retirada = retirada;
            this.devolucao = devolucao;
            return "Datas atualizadas! ";
        }

    }

    public Long conversao_dias() {
        long duracao = devolucao.getTime() - retirada.getTime();

        return TimeUnit.MILLISECONDS.toDays(duracao);
    }

    public String escolher_modelo(Scanner scanner) {
        vetor_carros = new String[] { "Tesla", "Chevrolet", "Ferrari", "Lamborghini", "Porsche" };
        String modelo = "";
        int cont = 0;

        System.out.println("-- MODELOS DISPONIVEIS --");
        for (int i = 0; i < vetor_carros.length; i++) {
            System.out.println("#" + cont++ + "[" + vetor_carros[i] + "]");
        }

        while (modelo.equals("")) {
            try {
                System.out.println("\n" + "Insira a posição do veiculo que deseja alugar: ");
                int posicao = scanner.nextInt();

                modelo = vetor_carros[posicao];
                this.modelo_do_carro = modelo;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: << Insira uma posição do vetor que seja válida! >>");
                System.out.println("-- Pilha Stack trace do erro:");
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("Erro: << Insira um caracter válido! >>");
                System.out.println("-- Pilha Stack trace do erro:");
                e.printStackTrace();
                scanner.next();
            }
        }
        return "Modelo escolhido : " + modelo;
    }

    @Override
    public String toString() {
        return ""
                + "\n Modelo_do_carro - "
                + modelo_do_carro
                + "\n Data de retirada - "
                + sdf.format(retirada)
                + "\n Data de devolução - "
                + sdf.format(devolucao)
                + "\n Dias de duracao - "
                + conversao_dias();
    }

}
