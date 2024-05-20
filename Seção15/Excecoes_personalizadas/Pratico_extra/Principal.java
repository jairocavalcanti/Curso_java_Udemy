package Seção15.Excecoes_personalizadas.Pratico_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Desenvolva um programa em Java para gerenciar reservas de locação de carros. 
 * O programa deve permitir ao usuário inserir os detalhes de uma reserva (modelo do carro, data de retirada e data de devolução) 
 * e exibir os detalhes da reserva, incluindo o período de locação em dias. 
 * Posteriormente, o programa deve solicitar novas datas de retirada e devolução e atualizar a reserva, 
 * desde que as datas sejam válidas de acordo com as seguintes regras: 
 * as alterações só podem ocorrer para datas futuras e a data de devolução deve ser após a data de retirada. 
 * Além disso, o programa deve garantir que o modelo do carro seja válido, 
 * de acordo com uma lista predefinida de modelos disponíveis para locação
 */

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Reserva_de_carros reser = new Reserva_de_carros();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String modelo = reser.escolher_modelo(scanner);
        System.out.println("Insira a data de retirada do veiculo: ");
        Date retirada = sdf.parse(scanner.next());
        System.out.println("Insira a data de devolução do veiculo: ");
        Date devolucao = sdf.parse(scanner.next());

        if (!devolucao.after(retirada)) {
            System.out.println(" Erro: << Devoluções devem acontecer após a data de retirada >> ");
        } else {

            Reserva_de_carros reserva = new Reserva_de_carros(modelo, retirada, devolucao);

            System.out.println(" \n Dados de reserva: \n" + reserva.toString());

            System.out.println("----------------------------------------------------");
            System.out.println(" --- Atualizar Reserva --- ");

            System.out.println("Insira a data de retirada do veiculo: ");
            retirada = sdf.parse(scanner.next());
            System.out.println("Insira a data de devolução do veiculo: ");
            devolucao = sdf.parse(scanner.next());

            String verif = reserva.atualizarDatas(devolucao, retirada);

            // Metodo 'startsWith' consegue verificar com qual palavra se inicia o retorno do metodo
            if (verif.startsWith("Erro")) {
                System.out.println(verif);
            } else {
                System.out.println(" \n Dados de reserva atualizados: \n" + reserva);
            }

        }

        scanner.close();
    }

}
