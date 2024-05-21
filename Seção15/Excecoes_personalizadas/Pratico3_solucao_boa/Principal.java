package Seção15.Excecoes_personalizadas.Pratico3_solucao_boa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.printf("Numero do quarto: ");
            Integer numero = scanner.nextInt();
            System.out.printf("Data de chegada (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scanner.next());
            System.out.printf("Data de saída (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scanner.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.printf("Reserva: " + reserva);

            System.out.println("\n");
            System.out.println("Insira a data para atualizar a reserva: ");
            System.out.printf("Data de entrada (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.printf("Data de saída (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            // logica de validação de datas delegada para método
            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }

        scanner.close();
    }

}
