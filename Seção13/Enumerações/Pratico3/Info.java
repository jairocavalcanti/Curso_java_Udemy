package Seção13.Enumerações.Pratico3;

import java.time.Instant;

public class Info {
    
    private String nome;
    private Status status;
    private Instant datalocal;
    
    
    public Info(){

    }


    public Info(String nome, Status status, Instant datalocal) {
        this.nome = nome;
        this.status = status;
        this.datalocal = datalocal;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public Instant getDatalocal() {
        return datalocal;
    }


    public void setDatalocal(Instant datalocal) {
        this.datalocal = datalocal;
    }


    @Override
    public String toString() {
        return "Info [ nome = " + nome + ", status = " + status + ", datalocal = " + datalocal + " ]";
    }

    

}
