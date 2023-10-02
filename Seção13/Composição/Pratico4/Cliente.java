package Seção13.Composição.Pratico4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private Date data_de_aniversario;

    public Cliente(){

    }

    public Cliente(String nome, String email, Date data_de_aniversario) {
        this.nome = nome;
        this.email = email;
        this.data_de_aniversario = data_de_aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_de_aniversario() {
        return data_de_aniversario;
    }

    public void setData_de_aniversario(Date data_de_aniversario) {
        this.data_de_aniversario = data_de_aniversario;
    }

    @Override
    public String toString() {
        return nome + " - (" + sdf.format(data_de_aniversario) + ") - " + email;
    }

}
