package Seção14.Herança.Pratico2;

import java.util.ArrayList;

public class Login_jogador {
    
    private String login;
    private String senha;
    private Double id;

    ArrayList<Login_jogador> array = new ArrayList<>();

    public Login_jogador(){

    }

    public Login_jogador(String login, String senha, Double id) {
        this.login = login;
        this.senha = senha;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }
    
    public void adicionarcadastro(Login_jogador log){
        array.add(log);
    }

    public void visualizarcadastro(){

        

    }

    
    

}
