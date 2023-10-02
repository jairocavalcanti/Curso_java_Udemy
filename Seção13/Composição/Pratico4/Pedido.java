package Seção13.Composição.Pratico4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date moment;
    private Status_pedido status;
    private Cliente cliente;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<Item_pedido> items = new ArrayList<Item_pedido>();

    public Pedido(){

    }

    public Pedido(Date moment, Status_pedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Status_pedido getStatus() {
        return status;
    }

    public void setStatus(Status_pedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void additem(Item_pedido item){
        items.add(item);
    }

     public void removeitem(Item_pedido item){
        items.remove(item);
    }

    public Double total(){
        double soma = 0.0;
        for(Item_pedido ip: items){
            soma = soma + ip.subTotal();
        }
    return soma;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (Item_pedido item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
}
}