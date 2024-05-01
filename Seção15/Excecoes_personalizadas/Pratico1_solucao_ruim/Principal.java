package Seção15.Excecoes_personalizadas.Pratico1_solucao_ruim;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 
  Fazer um programa paraa ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída)
  e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída,
  atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados
  inválidos para a reserva, conforme as seguintes regras:

     - Alterações de reserva só podem ocorrer para datas futuras
     - A data de saída deve ser maior que a data de entrada

*/

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

    // if abaixo verifica se data de check-out é posterior a data de check-in
    // o tipo date possui um metodo 'after' para fazer essa validação
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

      // variavel criada para armazenar o valor da data atual
      Date now = new Date();
      if (checkIn.before(now) || checkOut.before(now)) {
        System.out.println("Erro na atualização da reserva: datas de reserva a serem atualizadas deve ser para dias futuros !");  
      }
      else if (!checkOut.after(checkIn)){
        System.out.println("Erro na reserva: data de saída deve ser após a data de entrada !");
      }else{
        reserva.atualizarDatas(checkIn, checkOut);
        System.out.println("Reserva: " + reserva);
      }

    }

    scanner.close();
  }

}
