package Seção13.Composição.Pratico4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
      
        System.out.println(" -- Entre com os dados do cliente -- ");
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("Data do aniversario (DD/MM/YYYY): ");
        Date data_de_aniversario = sdf.parse(scanner.next());

        Cliente cli = new Cliente(nome, email, data_de_aniversario);

        System.out.println("-- Entre com os dados do pedido --");
        System.out.println("Status: ");
       
        //Convertendo String para valor correspondente no tipo enumerado
        Status_pedido status = Status_pedido.valueOf(scanner.next());

        //Objeto 'pedido' associado a objeto 'cliente' e 'status'
        Pedido pedido = new Pedido(new Date(), status, cli);

        System.out.println("Quanto items terá o pedido ?");
        int N = scanner.nextInt();
        for(int i = 0; i<N;i++){
           System.out.println("Entre com os dados do #" + (i+1) + " item:");
           System.out.println("Nome do produto: ");
           String nomedoproduto = scanner.next();
           System.out.println("Preço do produto: ");
           Double precodoproduto = scanner.nextDouble();
           System.out.println("Quantidade: ");
           int quantidade = scanner.nextInt();

           Produto produto = new Produto(nomedoproduto, precodoproduto);
           
           //objeto 'item_pedido' associado a um objeto a um objeto 'produto'
           Item_pedido it = new Item_pedido(quantidade, precodoproduto, produto);

           pedido.additem(it);
        }

        System.out.println();
        System.err.println(pedido);

      
        scanner.close();
    }
}
