package Seção15.Excecoes_personalizadas.Pratico2_solucao_ruim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Numero do quarto: ");
        Integer numero = scanner.nextInt();
        System.out.printf("Data de chegada (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());
        System.out.printf("Data de saída (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());

        if (!checkOut.after(checkIn)) {
            System.out.printf("Erro na reserva: data da saída deve ser após data de entrada !");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.printf("Reserva: " + reserva);

            System.out.println("\n");
            System.out.println("Insira a data para atualizar a reserva: ");
            System.out.printf("Data de entrada (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.printf("Data de saída (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            // logica de validação de datas delegada para método
            String erro = reserva.atualizarDatas(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            }else{
                System.out.println("Reserva: " + reserva);
            }
      
        }
        scanner.close();
    }

}
