package Seção13.Enumerações.Pratico1;

import java.util.Date;

public class Pedido {
   
    private Integer id;
    private Date momento;
    private Status_pedido status;

    public Pedido(){

    }

    public Pedido(Integer id, Date momento, Status_pedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status_pedido getStatus() {
        return status;
    }

    public void setStatus(Status_pedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [ id = " + id + ", momento = " + momento + ", status = " + status + "]";
    }

    

}
