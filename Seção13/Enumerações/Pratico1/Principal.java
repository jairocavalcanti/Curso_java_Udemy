package Seção13.Enumerações.Pratico1;

import java.util.Date;

public class Principal {
    
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(1080, new Date(), Status_pedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        Status_pedido stats = Status_pedido.ENTREGUE;
        
        Status_pedido stats2 = Status_pedido.valueOf("ENTREGUE");

        System.out.println(stats);
        System.out.println(stats2);

    }

}
